// FibonacciDemo.java
// Calculos de Fibonacci realizados de formas sincrona e assincrona

import java.time.Duration;
import java.text.NumberFormat;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// classe que armazena dois Instants no tempo
class TimeData
{
	public Instant start;
	public Instant end;
	
	// retorna o tempo total em segundos
	public double timeInSeconds()
	{
		return Duration.between(start, end).toMillis() / 1000.0;
	}
} // fim da classe TimeData

public class FibonacciDemo 
{

	public static void main(String[] args) 
		throws InterruptedException, ExecutionException
		{
			// realiza calculos sincronos fibonacci(45) e fibonacci(44)
			System.out.println("Synchronous Long Running Calculations");
			TimeData synchronousResult1 = startFibonacci(45);
			TimeData synchronousResult2 = startFibonacci(44);
			double synchronousTime = calculateTime(synchronousResult1, synchronousResult2);
			System.out.printf("  Total calculation time = %.3f seconds%n", synchronousTime);
			
			// realiza calculos assincronos fibonacci(45) e fibonacci(44)
			System.out.printf("%nAsynchronous Long Running Calculations%n");
			CompletableFuture<TimeData> futureResult1 = CompletableFuture.supplyAsync(() -> startFibonacci(45));
			CompletableFuture<TimeData> futureResult2 = CompletableFuture.supplyAsync(() -> startFibonacci(44));
			
			// espera os resultados das operacoes assincronas
			TimeData asynchronousResult1 = futureResult1.get();
			TimeData asynchronousResult2 = futureResult2.get();
			double asynchronousTime = calculateTime(asynchronousResult1, asynchronousResult2);
			System.out.printf("  Total calculation time = %.3f seconds%n", asynchronousTime);
			
			// exibe a diferenca de tempo como um percentual
			String percentage = NumberFormat.getPercentInstance().format(synchronousTime / asynchronousTime);
			System.out.printf("%nSynchronous calculations took %s" + " more time than the asynchronous calculations%n", percentage);
		}
		
		// executa a funcao fibonacci assincronamente
		private static TimeData startFibonacci(int n)
		{
			// cria um objeto TimeData fibonacci assincronamente
			TimeData timeData = new TimeData();
			
			System.out.printf("  Calculating fibonacci(%d)%n", n);
			timeData.start = Instant.now();
			long fibonacciValue = fibonacci(n);
			timeData.end = Instant.now();
			displayResult(n, fibonacciValue, timeData);
			return timeData;
		}
		
		// metodo fibonacci recursivo; calcula o enesimo numero de Fibonacci
		private static long fibonacci(long n)
		{
			if(n == 0 || n == 1)
				return n;
			else
				return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
		// exibe o resultado do calculo de Fibonacci e o tempo total de calculo
		private static void displayResult(int n, long value, TimeData timeData)
		{
			System.out.printf("  fibonacci(%d) = %d%n", n, value);
			System.out.printf("  Calculation time for fibonacci(%d) = %.3f seconds%n", n, timeData.timeInSeconds());
		}
		
		// exibe o resultado do calculo de Fibonacci e o tempo total de calculo
		private static double calculateTime(TimeData result1, TimeData result2)
		{
			TimeData bothThreads = new TimeData();
			// determina a primeira hora inicial
			bothThreads.start = result1.start.compareTo(result2.start) < 0 ?
					result1.start : result2.end;
			
			// determina a ultima hora final
			bothThreads.end = result1.end.compareTo(result2.end) > 0 ?
					result1.end : result2.end;
			
			return bothThreads.timeInSeconds();
		}
	
	
} // fim da classe FibonacciDemo
