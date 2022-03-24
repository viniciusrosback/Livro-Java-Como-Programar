// Figura 23.11: Consumer.java
// Consumidor com um metodo run que faz um loop, lendo 10 valores do buffer

import java.security.SecureRandom;

public class Consumer implements Runnable
{

	private static final SecureRandom generator = new SecureRandom();
	private final Buffer sharedLocation; // referencia a objeto compartilhado
	
	// construtor
	public Consumer(Buffer sharedLocation)
	{
		this.sharedLocation = sharedLocation;
	}
	
	// le o valor do sharedLocation 10 vezes e soma os valores
	public void run()
	{
		int sum = 0;
		
		for(int count = 1; count <= 10; count ++)
		{
			// dorme de 0 a 3 segundos, le o valor do buffer e adiciona a soma
			try
			{
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.blockingGet();
				System.out.printf("\t\t\t%2d%n", sum);
			}
			catch(InterruptedException exception)
			{
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.printf("%n%s %d%n%n%s%n", "Consumer read values totaling", sum, "Terminating Consumer");
	}
} // fim da classe Consumer
