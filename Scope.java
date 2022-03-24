// Figura 6.9: Scope.java
// A classe Scope demonstra os escopos de campo e de variavel local

public class Scope 
{

	// campo acessivel para todos os metodos dessa classe
	private static int x = 1;
	
	// o metodo main cria e inicializa a variavel local x
	// e chama os metodos useLocalVariable e useField
	public static void main(String[] args)
	{
		int x = 5; // variavel local x do metodo sombreia o campo x
		
		System.out.printf("local x in main is %d%n", x);
		
		useLocalVariable(); // useLocalVariable tem uma variavel local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a variavel local x
		useField(); // campo x da classe Scope retem seu valor
		
		System.out.printf("%nlocal x in main is %d%n", x);
	}
	
	// cria e inicializa a variavel local x durante cada chamada
	public static void useLocalVariable()
	{
		int x = 25; // inicializa toda vez que useLocalVariable e chamado
		
		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
		++ x; // modifica a variavel local x desse metodo
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
	}
	
	// modifica o campo x da classe Scope durante cada chamada
	public static void useField()
	{
		System.out.printf("%nfield x on entering method useField is %d%n", x);
		x *= 10; // modifica o campo x da classe Scope
		System.out.printf("field x before exiting method useField is %d%n", x);
	}
} // fim da classe Scope
