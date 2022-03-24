// Figura 19.5: InsertionSortTest.java
// Classificando um array com a classificacao por insercao

import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest 
{

	// classifica o array utilizando a classificacao por isencao
	public static void insertionSort(int[] data)
	{
		// faz um loop sobre data.length -1 elementos
		for(int next = 1; next < data.length; next ++)
		{
			int insert = data[next]; // valor a inserir
			int moveItem = next; // local para inserir elemento
			
			// procura o local para colocar o elemento atual
			while(moveItem > 0 && data[moveItem - 1] > insert)
			{
				// desloca o elemento direito um slot
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}
			
			data[moveItem] = insert; // local do elemento inserido
			printPass(data, next, moveItem); // passagem de saida do algoritmo
		}
	}
	
	// imprime uma passage do algoritmo
	public static void printPass(int[] data, int pass, int index)
	{
		System.out.printf("after pass %2d: ", pass);
		
		// gera saida dos elementos ate o item trocado
		for(int i = 0; i < index; i ++)
			System.out.printf("%d ", data[i]);
		
		System.out.printf("%d* ", data[index]); // indica troca
		
		// termina de gerar a saida do array
		for(int i = index + 1; i < data.length; i ++)
			System.out.printf("%d  ", data[i]);
		
		System.out.printf("%n          "); // para alinhamento
		
		// indica quantidade do array que e classificado
		for(int i = 0; i <= pass; i ++)
			System.out.print("--  ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int[10]; // cria o array
		
		for(int i = 0; i < data.length; i ++) // preenche o array
			data[i] = 10 + generator.nextInt(90);
		
		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data)); // exibe o array
	}
} // fim da classe InsertionSortTest
