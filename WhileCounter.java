// Figura 5.1: WhileCounter.java
// Repeticao controlada por contador com a instrucao de repeticao while

public class WhileCounter 
{

	public static void main(String[] args) 
	{
		int counter = 1; // declara e inicializa a variavel de controle
		
		while(counter <= 10) // condicao de continuacao do loop
		{
			System.out.printf("%d  ", counter);
			++ counter; // variavel de controle de incremento
		}
		
		System.out.println();
	}
} // fim da classe WhileCounter
