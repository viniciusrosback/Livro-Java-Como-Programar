// Figura 16.6: Sort1.java
// Metodo Collections sort1.

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1 
{

	public static void main(String[] args) 
	{
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// Cria e exibe uma lista contendo os elementos do array naipes
		List<String> list = Arrays.asList(suits);
		System.out.printf("Unsorted array elements: %s%n", list);
		
		Collections.sort(list); // classifica ArrayList
		System.out.printf("Sorted array elements: %s%n", list);
	}
} // fim da classe Sort1
