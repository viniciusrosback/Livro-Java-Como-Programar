// Figura 11.2: DivideByZeroNoExceptionHandling.java
// Divisao de inteiro sem tratamento de excecao

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling 
{

	// demonstra o lancamento de uma excecao quando ocorre uma divisao por zero
	public static int quotient(int numerator, int denominator)
	{
		return numerator / denominator; // possivel divisao por zero
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();
		
		int result = quotient(numerator, denominator);
		System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
	}
} // fim da classe DivideByZeroNoExceptionHandling
