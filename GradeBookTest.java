// Figura 7.19: GradeBookTest.java
// GradeBookTest cria o objeto GradeBook utilizando um array bidimensional
// das notas e, entao, invoca o metodo processGrades para analisa-las

public class GradeBookTest
{
	// metodo main inicia a execucao de programa
	public static void main(String[] args) 
	{
	
		// array bidimensional de notas de aluno
		int[][] gradesArray = {{87, 96, 70},
				{68, 87, 90},
				{100, 81, 82},
				{83, 65, 85},
				{78, 87, 65},
				{85, 75, 83},
				{91, 94, 100},
				{76, 72, 84},
				{87, 93, 73}};
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		myGradeBook.processGrades();
	}
} // fim da classe GradeBookTest



// Figura 7.15: GradeBookTest.java
// GradeBookTest cria um objeto GradeBook utilizando um array de notas
// e, entao, invoca o metodo processGrades para analisa-las

//public class GradeBookTest 
//{

	// metodo main inicia a execucao de programa
	//public static void main(String[] args) 
	//{
	
		// array de notas de aluno
		//int[] gradesArray = { 87, 68, 94, 100, 78, 85, 91, 76, 87 };
		
		//GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
		//System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		//myGradeBook.processGrades();
	//}
//} // fim da classe GradeBookTest
