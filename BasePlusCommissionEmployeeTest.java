// Figura 9.7: BasePlusCommissionEmployeeTest
// Programa de teste BasePlusCommissionEmployee

public class BasePlusCommissionEmployeeTest 
{

	public static void main(String[] args) 
	{
	
		// instancia o objeto BasePlusCommissionEmployee
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		// obtem os dados do empregado comissionado com salario-base
		System.out.println("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "LastName is", employee.getLastName());
		System.out.printf("%s %.2f%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
	} // fim de main	
} // fim da classe BasePlusCommissionEmployeeTest
