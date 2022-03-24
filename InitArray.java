// Figura 7.21: InitArray.java
// Inicializando um array com argumentos de linha de comando

public class InitArray
{
	public static void main(String[] args) 
	{
	
		// verifica numero de argumentos de linha de comando
		if(args.length != 3)
			System.out.printf("Error: Please re-enter the entire command, including%n" + "an array size, initial value and increment.%n");
		else
		{
			// obtem o tamanho do array a partir do primeiro argumento de linha de comando
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			// obtem o valor inicial e o incrementa a partir dos argumentos de linha de comando
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			// calcula valor de cada elemento do array
			for(int counter = 0; counter < array.length; counter ++)
				System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
} // fim da classe InitArray




// Figura 7.17: InitArray.java
// Inicializando arrays bidimensionais

//public class InitArray
//{
	// cria e gera saida de arrays bidimensionais
	//public static void main(String[] args) 
	//{
	
		//int[] array1 = {{1, 2, 3}, {4, 5, 6}};
		//int[] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		//System.out.println("Values in array1 by row are");
		//outputArray(array1); // exibe array1 por linha
		
		//System.out.printf("%nValues in array2 by row are%n");
		//outputArray(array2); // exibe array2 por linha
	//}
	
	// gera saida de linahs e colunas de um array bidimensional
	//public static void outputArray(int[][] array)
	//{
		// faz um loop pelas linhas do array
		//for(int row = 0; row < array.length; row ++)
		//{
			// faz um loop pelas colunas da linha atual
			//for(int column = 0; column < array[row].length; column ++)
				//System.out.printf("%d  ", array[row][column]);
			
			//System.out.println();
		//}
	//}
//} // fim da classe InitArray




// Figura 7.4: InitArray.java
// Calculando os valores a serem colocados nos elementos de uma array

//public class InitArray
//{
	//public static void main(String[] args) 
	//{
	
		//final int ARRAY_LENGTH = 10; // declara constante
		//int[] array = new int[ARRAY_LENGTH]; // cria o array
		
		// calcula valor de cada elemento do array
		//for(int counter = 0; counter < array.length; counter ++);
			//array[counter] = 2 + 2 * counter;
			
		//System.out.printf("%s%8s%n", "Index", "Value"); // titulos de coluna
		
		// gera saida do valor de cada elemento do array
		//for(int counter = 0; counter < array.length; counter ++)
			//System.out.printf("%5d%8d%n", counter, array[counter]);
	//}
//} // fim da classe InitArray




// Figura 7.3: InitArray.java
// Inicializando os elementos de um array com um inicializador de array

//public class InitArray
//{
	//public static void main(String[] args) 
	//{
	
		// A lista de inicializador especifica o valor de cada elemento
		//int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		
		//System.out.printf("%s%8s%n", "Index", "Value"); // titulos de coluna
		
		// gera saida do valor de cada elemento do array
		//for(int counter = 0; counter < array.length; counter ++);
			//System.out.printf("%5d%8d%n", counter, array[counter]);
	//}
//} // fim da classe InitArray




// Figura 7.2: InitArray.java
// Inicializando os elementos de um array como valores padrao de zero

//public class InitArray 
//{

	//public static void main(String[] args) 
	//{
	
		// declara array variavel e o inicializa com um objeto array
		//int[] array = new int[10]; // cria o objeto array
		
		//System.out.printf("%s%8s%n", "Index", "Value"); // titulos de coluna
		
		// gera saida do valor de cada elemento do array
		//for(int counter = 0; counter < array.length; counter ++)
			//System.out.printf("%5d%8d%n", counter, array[counter]);
	//}
//} // fim da classe InitArray
