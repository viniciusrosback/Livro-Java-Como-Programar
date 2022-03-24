// Figura 23.14: BlockingBuffer.java
// Criando um buffer sincronizado usando um ArrayBlockingQueue

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer
{

	private final ArrayBlockingQueue<Integer> buffer; // buffer compartilhado
	
	public BlockingBuffer()
	{
		buffer = new ArrayBlockingQueue<Integer>(1);
	}
	
	// coloca o valor no buffer
	public void blockingPut(int value) throws InterruptedException
	{
		buffer.put(value); // coloca o valor no buffer
		System.out.printf("%s%2d\t%s%d%n", "Producer writes ", value, "Buffer cells occuped: ", buffer.size());
	}
	
	// retorna valor do buffer
	public int blockingGet() throws InterruptedException
	{
		int readValue = buffer.take(); // remove o valor do buffer
		System.out.printf("%s %2d\t%s%d%n", "Consumer reads ", readValue, "Buffer cells occupied: ", buffer.size());
		
		return readValue;
	}
} // fim da classe BlockingBuffer
