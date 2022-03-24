// Figura 8.13: EmployeeTest.java
// Demonstracao do membro static

public class EmployeeTest
{
	public static void main(String[] args) 
	{
	
		// mostra que a contagem e 0 antes de criar Employees
		System.out.printf("Employees before instantiation: %d%n", Employee.getCount());
		
		// cria dois Employees; a contagem deve ser 2
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		// mostra que a contagem e 2 depois de criar dois Employees
		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());
		
		// obtem nomes de Employees
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
	}
} // fim da classe EmployeeTest



// Figura 8.9: EmployeeTest.java
// Demonstracao de composicao

//public class EmployeeTest 
//{

	//public static void main(String[] args) 
	//{
	
		//Date birth = new Date(7, 24, 1949);
		//Date hire = new Date(3, 12, 1988);
		//Employee employee = new Employee("Bob", "Blue", birth, hire);
		
		//System.out.println(employee);
	//}
//} // fim da classe EmployeeTest
