// Figura 20.1: OverloadedMethods.java
// Imprimindo elementos do array com metodos sobrecarregados

public class OverloadedMethods 
{

	public static void main(String[] args) 
	{
	
		// cria arrays de Integer, Double e Character
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.printf("Array integerArray contains:%n");
		printArray(integerArray); // passa um array de Integer
		System.out.printf("%nArray doubleArray contains:%n");
		printArray(doubleArray); // passa um arrayDouble
		System.out.printf("%nArray characterArray contains:%n");
		printArray(characterArray); // passa um array de Character
	}
	
	// metodo printArray para imprimir um array de Integer
	public static void printArray(Integer[] inputArray)
	{
		// exibe elementos do array
		for(Integer element : inputArray)
			System.out.printf("%s ", element);
		System.out.println();
	}
	
	// metodo printArray para imprimir um array de Double
	public static void printArray(Double[] inputArray)
	{
		// exibe elementos do array
		for(Double element : inputArray)
			System.out.printf("%s ", element);
		
		System.err.println();
	}
	
	// metodo printArray para imprimir um array de Character
	public static void printArray(Character[] inputArray)
	{
		// exibe elementos do array
		for(Character element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
} // fim da classe OverloadedMethods
