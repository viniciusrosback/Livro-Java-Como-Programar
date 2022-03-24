// Figura 4.10: ClassAverage.java
// Resolvendo o problema da media da classe usando a repeticao controlada por sentinela

import java.util.Scanner; // programa utiliza a classe Scanner

public class ClassAverage
{
	public static void main(String[] args) 
	{
	
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// fase de incializacao
		int total = 0; // inicializa a soma das notas
		int gradeCounter = 0; // inicializa o numero de notas inseridas ate agora
		
		// fase de processamento
		// solicita entrada e le a nota do usuario
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		// faz um loop ate ler o valor de sentinela inserido pelo usuario
		while(grade != -1)
		{
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa counter
			
			// solicita entrada e le a proxima nota fornecida pelo usuario
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		// fase de termino
		// se usuario inseriu pelo menos uma nota...
		if(gradeCounter != 0)
		{
			// usa numero com ponto decimal para calcular media das notas
			double average = (double) total / gradeCounter;
			
			// exibe o total e a media (com dois digitos de precisao)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		
		else // nenhuma nota foi inserida, assim gera a saida da mensagem apropriada
			System.out.println("No grades were entered");
	}
} // fim da classe ClassAverage



// Figura 4.8: ClassAverage.java
// Resolvendo o problema da media da classe usando a repeticao controlada por contador

//import java.util.Scanner;// programa utiliza a classe Scanner

//public class ClassAverage 
//{

	//public static void main(String[] args) 
	//{
	
		// cria Scanner para obter entrada a partir da janela de comando
		//Scanner input = new Scanner(System.in);
		
		// fase de inicializacao
		//int total = 0; // inicializa a soma das notas inseridas pelo usuario
		//int gradeCounter = 1; // inicializa numero da noa a ser inserido em seguida
		
		// fase de processamento utiliza repeticao controlada por contador
		//while(gradeCounter <= 10) // faz o loop 10 vezes
		//{
			//System.out.print("Enter grade: "); // prompt
			//int grade = input.nextInt(); // insere a proxima nota
			//total = total + grade; // adiciona grade a total
			//gradeCounter = gradeCounter + 1; // incrementa o contador por 1
		//}
		
		// fase de termino
		//int average = total / 10; // divisao de inteiros produz um resultado inteiro
		
		// exibe o total e a media das notas
		//System.out.printf("%nTotal of all 10 grades is %d%n", total);
		//System.out.printf("Class average is %d%n", average);
	//}
//} // fim da classe ClassAverage
