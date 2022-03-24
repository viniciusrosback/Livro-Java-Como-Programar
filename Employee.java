// Figura 17.9: Employee.java
// Classe Employee
public class Employee
{
	private String firstName;
	private String lastName;
	private double salary;
	private String department;
	
	// construtor
	public Employee(String firstName, String lastName, double salary, String department)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}
	
	// configura firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// obtem firstName
	public String getFirstName()
	{
		return firstName;
	}
	
	// configura lastName
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// obtem lastName
	public String getLastName()
	{
		return lastName;
	}
	
	// configura o salario
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	// obtem salario
	public double getSalary()
	{
		return salary;
	}
	
	// configura departamento
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	// obtem departamento
	public String getDepartment()
	{
		return department;
	}
	
	// retorna o nome e o sobrenome do empregado combinados
	public String getName()
	{
		return String.format("%s %s", getFirstName(), getLastName());
	}
	
	// retorna uma String contendo informacoes do Employee
	@Override
	public String toString()
	{
		return String.format("%-8s %-8s %8.2f  %s", getFirstName(), getLastName(), getSalary(), getDepartment());
	} // fim do metodo toString
} // fim da classe Employee











/*
// Figura 10.13: Employee.java
// Superclasse abstrata Employee que implementa Payable

public abstract class Employee implements Payable
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	// construtor
	public Employee(String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// retorna o nome
	public String getFirstName()
	{
		return firstName;
	}
	
	// retorna o sobrenome
	public String getLastName()
	{
		return lastName;
	}
	
	// retorna o numero de seguro social
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	// retorna a representacao de String do objeto Employee
	@Override
	public String toString()
	{
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	// Observacao: nao implementamos o metodo getPaymentAmount de Payable aqui, assim
	// essa classe deve ser declarada abstrata para evitar um erro de compilacao
} // fim da classe abstrata Employee

*/





// Figura 10.4: Employee.java
// Superclasse abstrata Employee


//public abstract class Employee
//{
	//private final String firstName;
	//private final String lastName;
	//private final String socialSecurityNumber;
	
	// construtor
	//public Employee(String firstName, String lastName, String socialSecurityNumber)
	//{
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.socialSecurityNumber = socialSecurityNumber;
	//}
	
	// retorna o nome
	//public String getFirstName()
	//{
		//return firstName;
	//}
	
	// retorna o sobrenome
	//public String getLastName()
	//{
		//return lastName;
	//}
	
	// retorna o numero do seguro social
	//public String getSocialSecurityNumber()
	//{
		//return socialSecurityNumber;
	//}
	
	// retorna a representacao de String do objeto Employee
	//@Override
	//public String toString()
	//{
		//return String.format("%s %s%n%social security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	//}
	
	// O metodo abstract deve ser sobrescrito pelas subclasses concretas
	//public abstract double earnings(); // nenhuma implementacao aqui
//} // fim da classe abstrata Employee




// Figura 8.12: Employee.java
// Variavel static utilizada para manter uma contagem do numero de
// objetos Employee na memoria

//public class Employee
//{
	//private static int count = 0; // numero de Employees criados
	//private String firstName;
	//private String lastName;
	
	// inicializa Employee, adiciona 1 a static count e
	// gera a saida de String indicando que o construtor foi chamado
	//public Employee(String firstName, String lastName)
	//{
		//this.firstName = firstName;
		//this.lastName = lastName;
		
		//++ count; // incrementa contagem estatica de empregados
		//System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
	//}
	
	// obtem o primeiro nome
	//public String getFirstName()
	//{
		//return firstName;
	//}
	
	// obtem o ultimo nome
	//public String getLastName()
	//{
		//return lastName;
	//}
	
	// metodo estatico para obter valor de contagem de estatica
	//public static int getCount()
	//{
		//return count;
	//}
//} // fim da classe Employee




// Figura 8.8: Employee.java
// Classe Employee com referencia a outros objetos

//public class Employee 
//{

	//private String firstName;
	//private String lastName;
	//private Date birthDate;
	//private Date hireDate;
	
	// construtor para inicializar nome, data de nascimento e data de contratacao
	//public Employee(String firstName, String lastName, Date birthDate, Date hireDate)
	//{
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.birthDate = birthDate;
		//this.hireDate = hireDate;
	//}
	
	// converte Employee em formato de String
	//public String toString()
	//{
		//return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
				
	//}
//} // fim da classe Employee


