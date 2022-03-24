// Figura 7.18: Gradebook.java
// classe GradeBook utilizando um array bidimensional para armazenar notas

public class GradeBook
{
	private String courseName; // nome de curso que este livro de nota representa
	private int[][] grades; // array bidimensional de notas de aluno
	
	// construtor de dois argumentos inicializa courseName e array de notas
	public GradeBook(String courseName, int[][] grades)
	{
		this.courseName = courseName;
		this.grades = grades;
	}
	
	// metodo para configurar o nome do curso
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	// metodo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	}
	
	// realiza varias operacoes nos dados
	public void processGrades()
	{
		// gera saida de array de notas
		outputGrades();
		
		// chama metodos getMinimum e getMaximum
		System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(), "Highest grade in the grade book is", getMaximum());
		
		// gera a saida de grafico de distribuicao de notas de todas as notas em todos os testes
		outputBarChart();
	}
	
	// localiza nota minima
	public int getMinimum()
	{
		// supoe que o primeiro elemento de array de notas e o menor
		int lowGrade = grades[0][0];
		
		// faz um loop pelas linhas do array de notas
		for(int[] studentGrades : grades)
		{
			// faz um loop pelas colunas da linha atual
			for(int grade : studentGrades)
			{
				// se a nota for menor que lowGrade, atribui a nota a lowGrade
				if(grade < lowGrade)
					lowGrade = grade;
			}
		}
		
		return lowGrade;
	}
	
	// localiza nota maxima
	public int getMaximum()
	{
		// supoe que o primeiro elemento de array de notas e o maior
		int highGrade = grades[0][0];
		
		// faz um loop pelas linhas do array de notas
		for(int[] studentGrades : grades)
		{
			// faz um loop pelas colunas da linha atual
			for(int grade : studentGrades)
			{
				// se a nota for maior que highGrade, atribui essa nota a highGrade
				if(grade > highGrade)
					highGrade = grade;
			}
		}
		
		return highGrade;
	}
	
	// determina a media do conjunto particular de notas
	public double getAverage(int[] setOfGrades)
	{
		int total = 0;
		
		// soma notas de um aluno
		for(int grade : setOfGrades)
			total += grade;
		
		// retorna media de notas
		return(double) total / setOfGrades.length;
	}
	
	// gera a saida do grafico de barras para exigir distribuicao total de notas
	public void outputBarChart()
	{
		System.out.println("Overall grade distribuition");
		
		// armazena frequencia de notas em cada intervalo de 10 notas
		int[] frequency = new int[11];
		
		// para cada nota em GradeBook, incrementa a frequencia apropriada
		for(int[] studentGrades : grades)
		{
			for(int grade : studentGrades)
				++ frequency[grade / 10];
		}
		
		// para cada frequencia de nota, imprime barra no grafico
		for(int count = 0; count < frequency.length; count ++)
		{
			// gera saida do rotulo de barra ("00-09: ", ..., "90-99: ", "100: ")
			if(count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			
			// imprime a barra de asteriscos
			for(int stars = 0; stars < frequency[count]; stars ++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	// gera a saida do conteudo do array de notas
	public void outputGrades()
	{
		System.out.printf("The grades are:%n%n");
		System.out.print("           "); // alinha titulos de coluna
		
		// cria um titulo de coluna para cada um dos testes
		for(int test = 0; test < grades[0].length; test ++)
			System.out.printf("Test %d  ", test + 1);
		
		System.out.println("Average"); // titulo da coluna de media do aluno
		
		// cria linhas/colunas de texto que representam notas de array
		for(int student = 0; student < grades.length; student ++)
		{
			System.out.printf("Student %2d", student + 1);
			
			for(int test : grades[student]) // gera saida de notas do aluno
				System.out.printf("%8d", test);
			
			// chama metodo getAverage para calcular a media do aluno;
			// passa linha de notas como o argumento para getAverage
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);
		}
	}
} // fim da classe GradeBook




// Figura 7.14: GradeBook.java
// classe GradeBook utilizando um array para armazenar notas de teste

//public class GradeBook 
//{

	//private String courseName; // nome do curso que essa GradeBook representa
	//private int[] grades; // array de notas de aluno
	
	// construtor
	//public GradeBook(String courseName, int[] grades)
	//{
		//this.courseName = courseName;
		//this.grades = grades;
	//}
	
	// metodo para configurar o nome do curso
	//public void setCourseName(String courseName)
	//{
		//this.courseName = courseName;
	//}
	
	// metodo para recuperar o nome do curso
	//public String getCourseName()
	//{
		//return courseName;
	//}
	
	// realiza varias operacoes nos dados
	//public void processGrades()
	//{
		// gera saida de array de notas
		//outputGrades();
		
		// chama metodo getAveragepara calcular a nota media
		//System.out.printf("%nClass average is %.2f%n", getAverage());
		
		//chama metodos getMinimum e getMaximum
		//System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
		
		// chama outputBarChart para imprimir grafico de distribuicao de nota
		//outputBarChart();
	//}
	
	// localiza nota minima
	//public int getMinimum()
	//{
		//int lowGrade = grades[0]; // supoe que grades[0] e a menor nota
		
		// faz um loop pelo array de notas
		//for(int grade : grades)
		//{
			// se nota for mais baixa que lowGrade, atribui essa nota a lowGrade
			//if(grade < lowGrade)
				//lowGrade = grade; // nova nota mais baixa
		//}
		
		//return lowGrade;
	//}
	
	// localiza nota maxima
	//public int getMaximum()
	//{
		//int highGrade = grades[0]; // supoe que grades[0] e a maior nota
		
		// faz um loop pelo array de notas
		//for(int grade : grades)
		//{
			// se a nota for maior que highGrade, atribui essa nota a highGrade
			//if(grade > highGrade)
				//highGrade = grade; // nova nota mais alta
		//}
		
		//return highGrade;
	//}
	
	// determina media para o teste
	//public double getAverage()
	//{
		//int total = 0;
		
		// soma notas de um aluno
		//for(int grade : grades)
			//total += grade;
		
		// retorna media de notas
		//return(double) total / grades.length;
	//}
	
	// gera a saida do grafico de barras exibindo distribuicao de notas
	//public void outputBarChart()
	//{
		//System.out.println("Grade distribuition:");
		
		// armazena frequencia de notas em cada intervalor de 10 notas
		//int[] frequency = new int[11];
		
		// para cada nota, incrementa a frequencia apropriada
		//for(int grade : grades)
			//++ frequency[grade / 10];
		
		// para cada frequencia de nota, imprime barra no grafico
		//for(int count = 0; count < frequency.length; count ++)
		//{
			// gera saida do rotulo de barra ("00-09: ", ..., "90-99: ", "100: ")
			//if(count == 10)
				//System.out.printf("%5d: ", 100);
			//else
				//System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			
			// imprime a barra de asteriscos
			//for(int stars = 0; stars < frequency[count]; stars ++)
				//System.out.print("*");
			
			//System.out.println();
		//}
	//}
	
	// gera a saida do conteudo do array de notas
	//public void outputGrades()
	//{
		//System.out.printf("The grades are:%n%n");
		
		// gera a saida da nota de cada aluno
		//for(int student = 0; student < grades.length; student ++)
			//System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
	//}
//} // fim da classe GradeBook
