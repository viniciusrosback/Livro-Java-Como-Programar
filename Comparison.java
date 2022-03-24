// Figura 2.15: Comparison.java
// Compara inteiros utilizando instrucoes if, operadores relacionais
// e operadores de igualdade

import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison 
{

	// metodo main inciia a execucao do aplicativo Java
	public static void main(String[] args) 
	{
	
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // primeiro numero a comparar
		int number2; // segundo numero a comparar
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // le o primeiro numero fornecido pelo usuario
		
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // le o segundo numero fornecido pelo usuario
		
		if(number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		
		if(number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if(number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if(number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if(number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
	} // fim do metodo main
} // fim da classe Comparison
