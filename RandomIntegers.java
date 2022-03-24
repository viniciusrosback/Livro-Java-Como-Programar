// Figura 6.6: RandomIntegers.java
// Inteiros aleatorios deslocados e escalonados

import java.security.SecureRandom; // o programa usa a classe SecureRandom

public class RandomIntegers 
{

	public static void main(String[] args) 
	{

		// o objeto randoNumbers produzira numeros aleatorios seguros
		SecureRandom randomNumbers = new SecureRandom();
		
		// faz o loop 20 vezes
		for(int counter = 1; counter <= 20; counter ++)
		{
			// seleciona o inteiro aleatorio entre 1 e 6
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d  ", face); // exibe o valor gerado
			
			// se o contador for divisivel por 5, inicia uma nova linha de saida
			if(counter % 5 == 0)
				System.out.println();
		}
	}
} // fim da classe RandomIntegers
