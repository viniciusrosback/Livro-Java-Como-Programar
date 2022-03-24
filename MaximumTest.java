// Figura 20.5: MaximumTest.java
// O metodo generico maximum retorna o maior dos tre objetos

public class MaximumTest 
{

	public static void main(String[] args) 
	{
	
		System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("Maximum of %.1fm %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
	}
	
	// determina o maior dos tres objetos Comparable
	public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x; // supoe que x e inicialmente o maior
		
		if(y.compareTo(max) > 0)
			max = y; // y e o maior ate agora
		
		if(z.compareTo(max) > 0)
			max = z; // z e o maior
		
		return max; // retorna o maior objeto
	}
} // fim da classe MaximumTest
