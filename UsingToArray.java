// Figura 16.4: UsingToArray.java
// Visualizando arrays como Lists e convertendo Lists em arrays

import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray 
{

	// cria uma LinkedList, adiciona elementos e vonverte em array
	public static void main(String[] args) 
	{
	
		String[] colors = {"black", "blue", "yellow"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		
		links.addLast("red"); // adiciona como o ultimo item
		links.add("pink"); // adiciona ao final
		links.add(3, "green"); // adicina no terceiro indice
		links.addFirst("cyan"); // adiciona como primeiro item
		
		// obtem elementos LinkedList como um array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors:");
		
		for(String color : colors)
			System.out.println(color);
	}
} // fim da classe UsingToArray
