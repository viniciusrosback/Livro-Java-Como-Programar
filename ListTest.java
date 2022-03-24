// Figura 21.5: ListTest.java
// Classe ListTest para demonstrar capacidades de List

import com.deitel.datastructures.List;
import com.deitel.datastructures.EmptyListException;

public class ListTest
{
	public static void main(String[] args) 
	{
	
		List<Integer> list = new List<>();
		
		// insere inteiros na lista
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBlack(1);
		list.print();
		list.insertAtBlack(5);
		list.print();
		
		
		// remove objetos da lista; imprime depois de cada remocao
		try
		{
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removedFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
		}
		catch (EmptyListException emptyListException)
		{
			emptyListException.printStackTrace();
		}
	}
} // fim da classe ListTest
 







/*
// Figura 16.3: ListTest.java
// Lists. LinkedLists e ListIterators.

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest
{
	public static void main(String[] args) 
	{
	
		// adiciona elementos colors a list1
		String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<>();
		
		for(String color : colors)
			list1.add(color);
		
		// adiciona elementos colors2 a list2
		String[] colors2 = {"gold", "while", "brown", "blue", "gray", "silver"};
		List<String> lsit2 = new LinkedList<>();
		
		for(String color : colors2)
			list2.add(color);
		
		list1.addAll(list2); // concatena as listas
		list2 = null; // libera recursos
		printList(list1); // imprime elementos list1
		
		convertToUppercaseStrings(list1); // converte em string de letras maiusculas
		printList(list1); // imprime elementos list1
		
		System.out.printf("%nDeleting elements 4 to 6 ...");
		removeItems(list1, 4, 7); // remove itens 4 a 6 da lista
		printList(list1); // imprime elementos list1
		printReversedList(list1); // imprime lista na ordem inversa
		
	}
	
	// gera saida do conteudo de List
	private static void printLista(List<String> list)
	{
		System.out.printf("%nlist:%n");
		
		for(String color : list)
			System.out.printf("%s", color);
		
		System.out.println();
	}
	
	// localiza objetos String e converte em letras maiusculas
	private static void convertToUpperCaseStrings(List<String> list)
	{
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext())
		{
			String color = iterator.next(); // obtem o item
			iterator.set(color.toUpperCase()); // converte em letras maiusculas
		}
	}
	
	// obtem sublista e utiliza metodo clear para excluir itens da sublista
	private static void removeItems(List<String> list, int start, int end)
	{
		list.subList(start, end).clear(); // remove os itens
	}
	
	// imprime lista invertida
	private static void printReversedList(List<String> list)
	{
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.printf("%nReversed List:%n");
		
		// imprime lista na ordem inversa
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
} // fim da classe ListTest
*/




/*
// Figura 12.24: ListTest.java
// Selececionando as cores de uma JList

//import javax.swing.JFrame;

//public class ListTest 
//{

	//public static void main(String[] args) 
	//{
	
		//ListFrame listFrame = new ListFrame(); // cria ListFrame
		//listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//listFrame.setSize(350, 150);
		//listFrame.setVisible(true);
	//}
//} // fim da classe ListTest
*/