// Figura 20.14: Wildcardtest.java
// Programa de teste de curinga

import java.util.ArrayList;

public class WildcardTest 
{

	public static void main(String[] args) 
	{
	
		// cria, inicializa e gera saida de ArrayList de Integers, entao
		// exibe o total dos elementos
		
		Integer[] integers = {1, 2, 3, 4, 5};
		ArrayList<Integer> integerList = new ArrayList<>();
		
		// insere elementos na integerList
		for(Integer element : integers)
			integerList.add(element);
		
		System.out.printf("integer contains: %s%n", integerList);
		System.out.printf("Total of the elements in integerList: %.0f%n%n", sum(integerList));
		
		// cria, inicializa e gera saida do ArrayList de Doubles, entao
		// exibe o total dos elementos
		Double[] doubles = {1.1, 3.3, 5.5};
		ArrayList<Double> doubleList = new ArrayList<>();
		
		// insere elementos na doubleList
		for(Double element : doubles)
			doubleList.add(element);
		
		System.out.printf("doubleList contains: %s%n", doubleList);
		System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));
		
		// cria, incializa e gera saida de ArrayList de numeros contendo
		// Integers e Doubles, e entao exibe o total dos elementos
		Number[] numbers = {1, 2.4, 3, 4.1}; // Integers e Doubles
		ArrayList<Number> numberList = new ArrayList<>();
		
		// insere elementos na numberList
		for(Number element : numbers)
			numberList.add(element);
		
		System.out.printf("numberList contains: %s%n", numberList);
		System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
	} // fim de main
	
	// totaliza os elementos; usando um curinga no parametro ArrayList
	public static double sum(ArrayList<? extends Number> list)
	{
		double total = 0; // inicializa o total
		
		// calcula a soma
		for(Number element : list)
			total += element.doubleValue();
		
		return total;
	}
} // fim da classe WildcardTest
