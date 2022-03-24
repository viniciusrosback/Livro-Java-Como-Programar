// Figura 16.13: Algorithms2.java
// Metodos Collections addAll, frequency e disjoint

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms2 
{

	public static void main(String[] args) 
	{
	
		// inicializa list1 e list2
		String[] colors = {"red", "white", "yellow", "blue"};
		List<String> list1 = Arrays.asList(colors);
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("black"); // adiciona "black" ao final da list2
		list2.add("red"); // adiciona "red" ao final da list2
		list2.add("green"); // adiciona "green" ao final da list2
		
		System.out.printf("Before addAll, list2 contains: ");
		
		// exibe os elementos em list2
		for(String s : list2)
			System.out.printf("%s ", s);
		
		Collections.addAll(list2, colors); // adiciona Strings colors a list2
		
		System.out.printf("%nAfter addAll, list2 contains: ");
		
		// exibe os elementos em list2
		for(String s : list2)
			System.out.printf("%s ", s);
		
		// obtem frequencia de "red"
		int frequency = Collections.frequency(list2, "red");
		System.out.printf("%nFrequency of red in list2: %d%n", frequency);
		
		// verifica se list1 e list2 tem elementos em comum
		boolean disjoint = Collections.disjoint(list1, list2);
		
		System.out.printf("list1 and list2 %s elements in common%n", (disjoint ? "do not have" : "have"));
	}
} // fim da classe Algorithm2
