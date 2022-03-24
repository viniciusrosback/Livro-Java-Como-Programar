// Figura 4.4: Student.java
// Classe Student que armazena o nome e a media de um aluno

public class Student 
{

	private String name;
	private double average;
	
	// construtor incializa variaveis de instancia
	public Student(String name, double average)
	{
		this.name = name;
		
		// valida que a media e > 0.0 e <= 100.0; caso contrario,
		// armazena o valor padrao da media da variavel de instancia (0.0)
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average; // atribui a variavel de instancia
	}
	
	// define o nome de Student
	public void setName(String name)
	{
		this.name = name;
	}
	
	// recupera o nome de Student
	public String getName()
	{
		return name;
	}
	
	// define a media de Student
	public void setAverage(double studentAverage)
	{
		// valida que a media e > 0.0 e <= 100.0; caso contrario,
		// armazena o valor atual da media da variavel de instancia
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average; // atribui a variavel de instancia
	}
	
	// recupera a media de Student
	public double getAverage()
	{
		return average;
	}
	
	// determina e retorna a letra da nota de Student
	public String getLetterGrade()
	{
		String letterGrade = ""; // inicializando como uma String vazia
		
		if(average >= 90.0)
			letterGrade = "A";
		else if(average >= 80.0)
			letterGrade = "B";
		else if(average >= 70.0)
			letterGrade = "C";
		else if(average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
} // finaliza a classe Student
