// Figura 4.15: Increment.java
// Operadores de pre-incremento e de pos-incremento

public class Increment 
{

	public static void main(String[] args) 
	{
	
		// demonstra o operador de pos-incremento
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); //imprime 5
		System.out.printf("    postincrementing c: %d%n", c++); // imprime 5
		System.out.printf("  c after postincrement: %d%n", c); // imprime 6
		
		System.out.println(); // pula uma linha
		
		// demonstra o operador de pre-incremento
		c = 5;
		System.out.printf(" c before preincrement: %d%n", c); // imprime 5
		System.out.printf("    preincrementing c: %d%n", ++c); // imprime 6
		System.out.printf("   c after preincrement: %d%n", c); // imprime 6
	}
} // fim da classe Increment
