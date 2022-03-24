// Figura 23.12: UnsynchronizedBuffer.java
// UnsynchronizedBuffer mantem o inteiro compartilhado que e acessado por
// uma thread produtora e uma thread consumidora

public class UnsynchronizedBuffer implements Buffer
{

	private int buffer = -1; // compartilhado pelas threads producer e consumer
	
	// coloca o valor no buffer
	public void blockingPut(int value) throws InterruptedException
	{
		System.out.printf("Producer writes\t%2d", value);
		buffer = value;
	}
	
	// retorna valor do buffer
	public int blockingGet() throws InterruptedException
	{
		System.out.printf("Consumer reads\t%2d", buffer);
		return buffer;
	}
} // fim da classe UnsynchronizedBuffer
