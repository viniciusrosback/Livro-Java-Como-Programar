// Figura 14.16: StaticCharMethods2.java
// Metodos de conversao static da classe Character

import java.util.Scanner;

public class StaticCharMethods2 
{

	// executa o aplicativo
	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);
		
		// obtem radical
		System.out.println("Please enter a radix:");
		int radix = scanner.nextInt();
		
		// obtem escolha de usuario
		System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n", "Convert digit to character", "Convert character to digit");
		int choice = scanner.nextInt();
		
		// processa solicitacao
		switch(choice)
		{
		case 1: // converte digito em caractere
			System.out.println("Enter a digit:");
			int digit = scanner.nextInt();
			System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit,  radix));
			break;
			
		case 2: // converte caractere em digito
			System.out.println("Enter a character:");
			char character = scanner.next().charAt(0);
			System.out.printf("Convert character to digit: %s%n");
			Character.digit(character, radix);
			break;
		}
	}
} // fim da classe StaticCharMethods2
