// Figura 19.6: MergeSortTest.java
// Classificando um array com a classificacao por intercalacao

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortTest 
{
	
		// chama o metodo split recursivo para iniciar a classificacao por intercalacao
		public static void mergeSort(int[] data)
		{
			sortArray(data, 0, data.length - 1); // classifica todo o array
		} // fim do metodo sort
		
		// divide o array, classifica subarrays e intercala subarrays no array classificado
		private static void sortArray(int[] data, int low, int high)
		{
			int middle1 = (low + high) / 2; // calcula o meio do aray
			int middle2 = middle1 + 1; // calcula o proximo elemento
			
			// gera uma saida do passo de divisao
			System.out.printf("split:  %s%n", subarrayString(data, low, high));
			System.out.printf("    %s%n", subarrayString(data, low, middle1));
			System.out.printf("    %s%n%n", subarrayString(data, middle2, high));
			
			// divide o array pela metade; classifica cada metade (chamadas recursivas)
			sortArray(data, low, middle1); // primeira metade do array
			sortArray(data, middle2, high); // segunda metade do array
			
			// intercala dois arrays classificados depois que as chamadas de divisao retornam
			merge(data, low, middle1, middle2, high);
		} // fim do if
	} // fim do metodo sortArray
	
	// intercala dois subarrays classificados em um subarray classificado
	private static void merge(int[] data, int left, int middle1, int middle2, int right)
	{
		int leftIndex = left; // indice no subarray esquerdo
		int rightIndex = middle2; // indice no subarray direito
		int combineIndex = left; // indice no array temporario funcional
		int[] combined = new int[data.length]; // array de trabalho
		
		// gera saida de dois subarrays antes de mesclar
		System.out.printf("merge:  %s%n", subarraysString(data, left, middle1));
		System.out.printf("    %s%n", subarrayString(data, middle2, right));
		
		// intercala arrays ate alcancar o final de um deles
		while(leftIndex <= middle1 && rightIndex <= right)
		{
			// coloca o menor dos dois elementos atuais no resultado
			// e o move para o proximo espaco nos arrays
			if(data[leftIndex] <= data[rightIndex])
				combined[combinedIndex++] = data[leftIndex++];
			else
				combined[combinedIndex++] = data[rightIndex++];
		}
		
		// se o array esquerdo estiver vazio
		if(leftIndex == middle2)
			// copia o restante do aray direito
			while(rightIndex <= right)
				combined[combinedIndex++] = data[rightIndex++];
		else // o array direito esta vazio
			// copia o restante do array esquerdo
			while(leftIndex <= middle1)
				combined[combinedIndex++] = data[leftIndex++];
		
		// copia os valores de volta ao array original
		for(int i = left; i <= right; i ++)
			data[i] = combined[i];
		
		// gera saida do array intercalado
		System.out.printf("          %s%n%n", subarrayString(data, left, right));
	} // fim do metodo merge
	
	// metodo para gerar saida de certos valores no array
	private static String subarrayString(int[] data, int low, int high)
	{
		StringBuilder temporary = new StringBuilder();
		
		// gera espacos para alinhamento
		for(int i = 0; i < low; i ++)
		temporary.append("        ");
		
		// gera a saida dos elementos que permanecem no array
		for(int i = low; i <= high; i ++)
			temporary.append("  " + data[i]);
		
		return temporary.toString();
	}
	
	public static void main(String[] args) 
	{
	
		int[] data = new int[10]; // cria o array
		
		for(int i = 0; i < data.length; i ++) // preenche o array
			data[i] = 10 + generator.nextInt(90);
		
		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data)); // exibe o array
	}
} // fim da classe MergeSortTest