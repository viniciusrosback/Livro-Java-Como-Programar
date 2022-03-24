// Figura 23.8: SimpleArray.java
// Classe que gerencia um array de inteiros a ser compartilhado por multiplas 
// threads com sincronizacao

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray
{
	private static final SecureRandom generator = new SecureRandom();
	private final int[] array; // array de inteiros compartilhado
	private int writeIndex = 0; // indice do proximo elemento a ser gravado
	
	// cria um SimpleArray de um determinado tamanho
	public SimpleArray(int size)
	{
		array = new int[size];
	}
	
	// adiciona um valor ao array compartilhado
	public synchronized void add(int value)
	{
		int position = writeIndex; // armazena o indice de gravacao
		
		try
		{
			// em aplicativos reais, nao se deve dormir enquanto se mantem um bloqueio
			Thread.sleep(generator.nextInt(500)); // apenas para demonstracao
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		
		// coloca o valor no elemento apropriado
		array[position] = value;
		System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);
		
		++writeIndex; // incrementa indice de elemento a ser gravado depois
		System.out.printf("Next write index: %d%n", writeIndex);
	}
	
	// usado para gerar o conteudo do array de inteiros compartilhado
	public synchronized String toString()
	{
		return Arrays.toString(array);
	}
} // fim da classe SimpleArray


/*
// Figura 23.5: SimpleArray.java
// Classe que gerencia um array de inteiros para ser compartilhado por varias threads

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray // ATENCAO: NAO SEGURO PARA THREADS!
{

	private static final SecureRandom generator = new SecureRandom();
	private final int[] array; // array de inteiros compartilhado
	private int writeIndex = 0; // indice compartilhado do proximo elemento a gravar
	
	// cria um SimpleArray de um determinado tamanho
	public SimpleArray(int size)
	{
		array = new int[size];
	}
	
	// adiciona um valor ao array compartilhado
	public void add(int value)
	{
		int position = writeIndex; // armazena o indice de gravacao
		
		try
		{
			// coloca a thread para dormir durtante 0 a 599 milissegundos
			Thread.sleep(generator.nextInt(500));
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt(); // reinterrompe a thread
		}
		
		// coloca o valor no elemento apropriado
		array[position] = value;
		System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);
		
		++writeIndex; // indice de incremento de elemento a ser gravado depois
		System.out.printf("Next write index: %d%n", writeIndex);
	}
	
	// usado para gerar saida do conteudo do array de inteiros compartilhado
	public String toString()
	{
		return Arrays.toString(array);
	}
} // fim da classe SimpleArray

*/
