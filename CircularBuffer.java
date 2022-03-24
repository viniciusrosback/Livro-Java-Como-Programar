// Figura 23.18: CircularBuffer.java
// Sincronizando o acesso a um buffer limitado de tres elementos compartilhados

public class CircularBuffer implements Buffer
{

	private final int[] buffer = {-1, -1, -1}; // buffer compartilhado
	
	private int occupiedCells = 0; // conta numero de buffers utilizados
	private int writeIndex = 0; // indice do proximo elemento em que gravar
	private int readIndex = 0; // indice do proximo elemento a ler
	
	// coloca o valor no buffer
	public synchronized void blockingPut(int value) throws InterruptedException
	{
		// espera ate que haja espaco disponivel no buffer, entao grava o valor;
		// enquanto nao houver posicoes vazias, poe o thread no estado bloqueado
		while(occupiedCells == buffer.length)
		{
			System.out.printf("Buffer is full. Producer waits.%n");
			wait(); // espera ate uma celula do buffer ser liberada
		} // fim do while
		
		buffer[writeIndex] = value; // configura novo valor de buffer
		
		// atualiza indice de gravacao circular
		writeIndex = (writeIndex + 1) % buffer.length;
		
		++occupiedCells; // mais uma celula do buffer esta cheia
		displayState("Producer writes " + value);
		notifyAll(); // notifica threads que estao esperando para ler a partir do buffer
	}
	
	// retorna valor do buffer
	public synchronized int blockingGet() throws InterruptedException
	{
		// espera ate que o buffer tenha dados, entao le o valor;
		// enquanto os dados nao sao lidos, coloca thread em estado de espera
		while(occupiedCells == 0)
		{
			System.out.printf("Buffer is empty. Consumer waits.%n");
			wait(); // espera ate que uma celula do buffer seja preenchida
		} // fim do while
		
		int readValue = buffer[readIndex]; // le o valor do buffer
		
		// atualiza indice de leitura circular
		readIndex = (readIndex + 1) % buffer.length;
		
		--occupiedCells; // um numero menor de celulas do buffer e ocupado
		displayState("Consumer reads " + readValue);
		notifyAll(); // notifica threads que estao esperando para gravar no buffer
		
		return readValue;
	}
	
	// exibe a operacao atual e o estado de buffer
	public synchronized void displayState(String operation)
	{
		// gera saida de operacao e numero de celulas de buffers ocupadas
		System.out.printf("%s%s%d)%n%s", operation, " (buffer cells occupied: ", occupiedCells, "buffer cells: ");
		
		for(int value : buffer)
			System.out.printf(" %2d ", value); // gera a saida dos valores no buffer
		
		System.out.printf("%n           ");
		
		for(int i = 0; i < buffer.length; i ++)
			System.out.print("------ ");
		
		System.out.printf("%n           ");
		
		for(int i = 0; i < buffer.length; i ++)
		{
			if(i == writeIndex && i == readIndex)
				System.out.print(" WR"); // indice de gravacao e leitura
			else if(i == writeIndex)
				System.out.print(" W  "); // so grava indice
			else if(i == readIndex)
				System.out.print(" R  "); // so le indice
			else
				System.out.print("    "); // nenhum dos indices
		}
		
		System.out.printf("%n%n");
	}
} // fim da classe CircularBuffer
