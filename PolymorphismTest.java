// Figura 10.1: PolymorphismTest.java
// Atribuindo referencias de superclasse e subclasse a variaveis de superclasse e
// de subclasse

public class PolymorphismTest 
{

	public static void main(String[] args) 
	{
	
		// atribui uma referencia de superclasse a variavel de superclasse
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		
		// atribui uma referencia de subclasse a variavel de subclasse
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		// invoca toString no objeto de superclasse utilizando a variavel
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", commissionEmployee.toString());
		
		// invoca toString no objeto de subclasse utilizando a variavel de subclasse
		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
		System.out.printf("%s %s:%n%n%s%n", "Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object", commissionEmployee2.toString());
	} // fim de main
} // fim da classe PolymorphismTest
