// Figura 20.3: GenericMethodTest.java
// Imprimindo elementos do array com o metodo generico printArray

public class genericMethodTest 
{

	public static void main(String[] args, Object[] integerArray, Object[] characterArray) 
	{
	
		// cria arrays de Integer, Double e Character
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.printf("Array integerArray contains:%n");
		printArray(integerArray); // passa um array de Integer
		System.out.printf("%nArray doubleArray contains:%n");
		printArray(doubleArray); // passa um array Doubles
		System.out.printf("%nArray characterArray contains:%n");
		printArray(characterArray); // passa um array de Characters
	}
	
	// metodo generico printArray
	public static <T> void printArray(T[] inputArray)
	{
		// exibe elementos do array
		for(T element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
} // fim da classe GenericMethodTest
