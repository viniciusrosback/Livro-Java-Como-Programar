// Figura 6.10: MethodOverload.java
// Declaracoes de metodos sobrecarregados

public class MethodOverload 
{

	// teste de metodos square sobrecarregados
	public static void main(String[] args) 
	{
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	}
	
	// metodo square com argumento de int
	public static int square(int intValue)
	{
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		return intValue * intValue;
	}
	
	// metodo square com argumento double
	public static double square(double doubleValue)
	{
		System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
		return doubleValue * doubleValue;
	}
} //fim da classe MethodOverload
