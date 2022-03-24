// Figura 18.9: FactorialCalculator.java
// Metodo fatorial iterativo

public class FactorialCalculator
{
	// declaracao recursiva de metodo fatorial
	public long factorial(long number)
	{
		long result = 1;
		
		// declaracao iterativa de metodo fatorial
		for(long i = number; i >= 1; i --)
			result *= i;
		
		return result;
		
	}
	
	// gera saida de fatoriais para valores 0 a 10
	public static void main(String[] args) 
	{
	
		// calcula o fatorial de 0 a 10
		for(int counter = 0; counter <= 10; counter ++)
			System.out.printf("%d! = %d%n", counter, factorial(counter));
	}
} // fim da classe FactorialCalculator





/*
// Figura 18.4: FactorialCalculator.java
// Metodo fatorial recursivo

import java.math.BigInteger;

public class FactorialCalculator
{
	// metodo fatorial recursivo (supoe que o parametro e >= 0)
	public static BigInteger factorial(BigInteger number)
	{
		if(number.compareTo(BigInteger.ONE) <= 0) // caso basico de teste
			return BigInteger.ONE; // casos basicos: 0! = 1 e 1! = 1
		else
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
	}
	
	// gera saida de fatoriais para valores 0 a 50
	public static void main(String[] args) 
	{
	
		// calcula o fatorial de 0 a 50
		for(int counter = 0; counter <= 50; counter ++)
			System.out.printf("%d! = %d%n", counter, factorial(BigInteger.valueOf(counter)));
	}
	
} // fim da classe FactorialCalculator
*/

/*
// Figura 18.3: FactorialCalculator.java
// Metodo fatorial recursivo

public class FactorialCalculator 
{

	// metodo fatorial recursivo (supoe que o parametro e >= 0)
	public static long factorial(long number)
	{
		if(number <= 1) // testa caso basico
			return 1; // casos basicos: 0! = 1 e 1! = 1
		else // passo de recursao
			return number * factorial(number - 1);
	}
	
	// gera saida de fatoriais para valores de 0 a 21
	public static void main(String[] args) 
	{
	
		// calcula o fatorial de 0 a 21
		for(int counter = 0; counter <= 21; counter ++)
			System.out.printf("%d! = %d%n", counter, factorial(counter));
	}
} // fim da classe FactorialCalculator
*/