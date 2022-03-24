// Figura 7.7: RollDie.java
// Programa de jogo de dados utilizando arrays em vez de switch

import java.security.SecureRandom;

public class RollDie
{
	public static void main(String[] args) 
	{
	
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7]; // array de contadores de frequencia
		
		// lanca o dado 6.000.000 vezes; usa o valor do dado como indice de frequencia
		for(int roll = 1; roll < 6000000; roll ++)
			++ frequency[1 + randomNumbers.nextInt(6)];
		
		System.out.printf("%s%10s%n", "Face", "Frequency");
		
		// gera saida do valor de cada elemento do array
		for(int face = 1; face < frequency.length; face ++)
			System.out.printf("%4d%10d%n", face, frequency[face]);
	}
} // fim da classe RollDie



// Figura 6.7: RollDie.java
// Rola um dado de seis lados 6.000.000 vezes

//import java.security.SecureRandom;

//public class RollDie 
//{

	//public static void main(String[] args) 
	//{
		// o objeto randomNumbers produzira numeros aleatorios seguros
		//SecureRandom randomNumbers = new SecureRandom();
		
		//int frequency1 = 0; // contagem de 1s lancados
		//int frequency2 = 0; // contagem de 2s lancados
		//int frequency3 = 0; // contagem de 3s lancados
		//int frequency4 = 0; // contagem de 4s lancados
		//int frequency5 = 0; // contagem de 5s lancados
		//int frequency6 = 0; // contagem de 6s lancados
		
		// soma 6.000.000 lancamentos de um dado
		//for(int roll = 1; roll <= 6000000; roll ++)
		//{
			// usa o valor 1-6 para as faces a fim de determinar qual contador incrementar
			//switch(face)
			//{
				//case 1:
					//++ frequency1; // incrementa o contador de 1s
				//case 2:
					//++ frequency2; // incrementa o contador de 2s
				//case 3:
					//++ frequency3; // incrementa o contador de 3s
				//case 4:
					//++ frequency4; // incrementa o contador de 4s
				//case 5:
					//++ frequency5; // incrementa o contador de 5s
				//case 6:
					//++ frequency6; // incrementa o contador de 6s
					//break;
			//}
		//}
		
		//System.out.println("Face\tFrequency"); // cabecalhos de saida
		//System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
	//}
//} // fim da classe RollDie
