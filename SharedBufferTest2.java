// Figura 23.21: SharedBufferTest2.java
// Duas threads manipulando um buffer sincronizado

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest2
{
	public static void main(String[] args) throws InterruptedException
	{
		
		// cria novo pool de threads com duas threads
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// cria SynchronizedBuffer para armazenar threads
		ExecutorService sharedService = Executors.newCachedThreadPool();
		
		// cria SynchronizedBuffer para armazenar ints
		Buffer sharedLocation = new SynchronizedBuffer();
		
		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation", "Buffer", "Occupied", "--------", "-----\t\t--------");
		
		// executa as tarefas do produtor e consumidor
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
} // fim da classe SharedBufferTest2






/*
// Figura 23.17: SharedBufferTest2.java
// Duas threads manipulando corretamente um buffer sincronizado

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest2 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		// cria um newCachedThreadPool
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// cria SynchronizedBuffer para armazenar ints
		Buffer sharedLocation = new SynchronizedBuffer();
		
		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation", "Buffer", "Occupied", "----------", "------\t\t-------");
		
		// executa as tarefas do produtor e consumidor
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
} // fim da classe SharedBufferTest2
*/