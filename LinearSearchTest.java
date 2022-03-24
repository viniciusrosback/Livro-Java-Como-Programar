// Figura 19.2: LinearSearchTest.java
// Pesquisando sequencialmente um item em um array

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest 
{

	// realiza uma pesquisa linear nos dados
	public static int linearSearch(int data[], int searchKey)
	{
		// faz um loop pelo array sequencialmente
		for(int index = 0; index < data.length; index ++)
			if(data[index] == searchKey)
				return index; // retorna o indice de inteiros
		
		return -1; // inteiro nao foi localizado
	} // fim do metodo linearSearch
	
	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int[10]; // cria o array
		
		for(int i = 0; i < data.length; i ++) // preenche o array
			data[i] = 10 + generator.nextInt(90);
		
		System.out.printf("%s%n%n", Arrays.toString(data)); // exibe o array
		
		// obtem a entrada de usuario
		System.out.print("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt();
		
		// insere repetidamente um inteiro; -1 termina o programa
		while(searchInt != -1)
		{
			int position = linearSearch(data, searchInt); // realiza a pesquisa
			
			if(position == -1) // nao encontrado
				System.out.printf("%d was not found%n%n", searchInt);
			else // encontrado
				System.out.printf("%d was found in position %d%n%n", searchInt, position);
			
			// obtem a entrada de usuario
			System.out.print("Please enter an integer value (-1 to quit): ");
			searchInt = input.nextInt();
		}
	} // fim de main
} // fim da classe LinearSearchTest
