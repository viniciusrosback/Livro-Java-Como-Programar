// Figura 12.2: Addition.java
// Programa de adicao que utiliza JOptionPane para entrada e saida

import javax.swing.JOptionPane;

public class Addition
{
	public static void main(String[] args) 
	{
	
		// obtem a entrada de usuario a partir dos dialogos de entrada JOptionPane
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
		
		// converte String em valores int para utilizacao em um calculo
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		// exibe o resultado em um dialogo de mensagem JOptionPane
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	}
} // fim da classe Addition




// Figura 2.7: Addition.java
// Programa de adicao que insere dois numeros, entao exibe a soma deles

//import java.util.Scanner;

//public class Addition 
//{

	// metodo main inicia a execucao do aplicativo Java
	//public static void main(String[] args) 
	//{
	
		// cria um Scanner para obter entrada a partir da janela de comando
		//Scanner input = new Scanner(System.in);
		
		//int number1; // primeiro numero a somar
		//int number2; // segundo numero a somar
		//int sum; // soma de number1 e number2
		
		//System.out.print("Enter first integer: "); // prompt
		//number1 = input.nextInt(); // le primeiro o numero fornecido pelo usuario
		
		//System.out.print("Enter second integer: "); // prompt
		//number2 = input.nextInt(); // le o segundo numero fornecido pelo usuario
		
		//sum = number1 + number2; // soma os numeros, depois armazena o total em sum
		
		//System.out.printf("Sum is %d%n", sum); // exibe a soma
	//} // fim do metodo main
//} // fim da classe Addition
