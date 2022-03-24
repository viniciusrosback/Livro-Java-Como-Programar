// Figura 23.20: SynchronizedBuffer.java
// Sincronizando o acesso a um numero inteiro compartilhado usando
// interfaces Lock e Condition

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class SynchronizedBuffer implements Buffer
{
	// Bloqueio para controlar sincronizacao com esse buffer
	private final Lock accessLock = new ReentrantLock();
	
	// condicoes para controlar leitura e gravacao
	private final Condition canWrite = accessLock.newCondition();
	private final Condition canRead = accessLock.newCondition();
	
	private int buffer = -1; // compartilhado pelas threads producer e consumer
	private boolean occupied = false; // se o buffer estiver ocupado
	
	// coloca o valor int no buffer
	public void blockingPut(int value) throws InterruptedException
	{
		accessLock.lock(); // bloqueia esse objeto
		
		// envia informacoes da thread e do buffer para a saida, entao espera
		try
		{
			// enquanto o buffer nao estiver vazio , coloca thread no estado de espera
			while(occupied)
			{
				System.out.println("Producer tries to write.");
				displayState("Buffer full. Producer waits.");
				canWrite.await(); // espera ate que o buffer esteja vazio
			}
			
			buffer = value; // configura novo valor de buffer
			
			// indica que a produtora nao pode armazenar outro valor
			// ate a consumidora recuperar valor atual de buffer
			occupied = true;
			
			displayState("Producer writes " + buffer);
			
			// sinaliza quaisquer threads que estao esperando para ler o buffer
			canRead.signalAll();
		}
		
		finally
		{
			accessLock.unlock(); // desbloqueia esse objeto
		}
	}
	
	// reotorna valor do buffer
	public int blockingGet() throws InterruptedException
	{
		int readValue = 0; // inicializa do valor lido a partir do buffer
		accessLock.lock(); // bloqueia esse objeto
		
		// envia informacoes da thread e do buffer para a saida, entao espera
		try
		{
			// se nao houver dados para serem lidos,  coloca a thread em estado de espera
			while(!occupied)
			{
				System.out.println("Consumer tries to read.");
				displayState("Buffer empty. COnsumer waits.");
				canRead.await(); // espera ate o buffer tornar-se cheio
			}
			
			// indica que a produtora pode armazenar outro valor
			// porque a consumidora acabou de recuperar o valor do buffer
			occupied = false;
			
			readValue = buffer; // recupera o valor do buffer
			displayState("Consumer reads " + readValue);
			
			// sinaliza qualquer thread que esta esperando o buffer tornar-se vazio
			canWrite.signalAll();
		}
		
		finally
		{
			accessLock.unlock(); // desbloqueia esse objeto
		}
		
		return readValue;
	}
	
	// exibe a operacao atual e o estado de buffer
	private void displayState(String operation)
	{
		try
		{
			accessLock.lock(); // bloqueia esse objeto
			System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
		}
		
		finally
		{
			accessLock.unlock(); // desbloqueia esses objetos
		}
	}
} // fim da classe SynchronizedBuffer





/*
// Figura 23.16: SynchronizedBuffer.java
// Sincronizando o acesso a dados mutaveis compartilhados usando
// metodos wait e notifyAll de Object

public class SynchronizedBuffer implements Buffer
{

	private int buffer = -1; // compartilhado pelos threads producer and consumer
	private boolean occupied = false;
	
	// coloca o valor no buffer
	public synchronized void blockingPut(int value) throws InterruptedException
	{
		// enquanto nao houver posicoes vazias, coloca a thread em estado de espera
		while(occupied)
		{
			// envia informacoes da thread e do buffer para a saida, entao espera
			System.out.println("Producer tries to write."); // apenas para demonstracao
			dislplayState("Buffer full. Producer waits."); // apenas para demonstracao
			wait();
		}
		
		buffer = value; // configura novo valor de buffer
		
		// indica que a produtora nao pode armazenar outro valor
		// ate a consumidora recuperar valor atual de buffer
		occupied = true;
		
		dislplayState("Producer writes " + buffer); // apenas para demonstracao
		
		notifyAll(); // instrui threads(s) em espera a entrar no estado executavel
	} // fim do metodo blockingPut; libera bloqueio em SynchronizedBuffer
	
	// retorna valor do Buffer
	public synchronized int blockingGet() throws InterruptedException
	{
		// enquanto os dados nao sao lidos, coloca thread em estado de espera
		while(!occupied)
		{
			// envia informacoes da thread e do buffer para a saida, entao espera
			System.out.println("Consumer tries to read."); // apenas para demonstracao
			dislplayState("Buffer empty. Consumer waits."); // apenas para demonstracao
			wait();
		}
		
		// indica que a produtora pode armazenar outro valor
		// porque a consumidora acabou de recuperar o valor do buffer
		occupied = false;
		
		dislplayState("Consumer reads " + buffer); // apenas para demonstracao
		
		notifyAll(); // instrui thread(s) em espera a entrar no estado executavel
		
		return buffer;
	} // fim do metodo blockingGet; libera bloqueio em SynchronizedBuffer
	
	// exibe a operacao atual e o estado de buffer; apenas para demonstracao
	private synchronized void dislplayState(String operation)
	{
		System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
	}
} // fim da classe SynchronizedBuffer
*/