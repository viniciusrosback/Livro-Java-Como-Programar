// Figura 16.2: CollectionTest.java
// Interface Collection demonstrada por meio de um objeto ArrayList.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest 
{

	public static void main(String[] args) 
	{
	
		// adiciona elementos no array colors a listar
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<String>();
		
		for(String color : colors)
			list.add(color); // adiciona color ao final da lista
		
		// adiciona elementos no array removeColors em removeList
		String[] removeColors = {"RED", "WHITE", "BLUE"};
		List<String> removeList = new ArrayList<String>();
		
		for(String color : colors)
			list.add(color); // adiciona color ao final da lista
		
		// gera saida do conteudo da lista
		System.out.printf("%n%nArrayList after calling removeColors:%n");
		
		for(String color : list)
			System.out.printf("%s ", color);
	}
	
	// remove cores especificadas em collection2 a partir de collection1
	private static void removeColors(Collection<String> collection1, Collection<String> collection2)
	{
		// obtem o iterador
		Iterator<String> iterator = collection1.iterator();
		
		// loop enquanto a colecao tiver itens
		while(iterator.hasNext())
		{
			if(collection2.contains(iterator.next()))
				iterator.remove(); // remove o elemento atual
		}
	}
} // fim da classe CollectionTest
