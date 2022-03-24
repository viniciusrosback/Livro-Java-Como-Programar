// Figura 6.3: MaximumFinder.java
// Metodo maximum declarado pelo programador com tres parametros double

import java.util.Scanner;

public class MaximumFinder 
{

	// obtem tres valores de ponto flutuante e localiza o valor maximo
	public static void main(String[] args) 
	{
	
		// cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// solicita e insere tres valores de ponto flutuante
		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble(); // le o primeiro double
		double number2 = input.nextDouble(); // le o segundo double
		double number3 = input.nextDouble(); // le o terceiro double
		
		// determina o valor maximo
		double result = maximum(number1, number2, number3);
		
		// exibe o valor maximo
		System.out.println("Maximum is: " + result);
	}
	
	// retorna o maximo dos seus tres parametros de double
	public static double maximum(double x, double y, double z)
	{
		double maximumValue = x; // supoe que x e o maior valor inicial
		
		// determina se y e maior que maximumValue
		if(y > maximumValue)
			maximumValue = y;
		
		// determina se Z e maior que maximumValue
		if(z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
	}
} // fim da classe MaximumFinder
