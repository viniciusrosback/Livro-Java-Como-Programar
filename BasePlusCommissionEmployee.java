// Figura 10.8: BasePlusCommissionEmployee.java
// Classe BasePlusCommissionEmployee estende a CommissionEmployee

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary; // Salario de base por semana
	
	// construtor
	public BasePlusCommissionEmployee(String firstName, String lastName, String SocialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if(baseSalary < 0.0) // valida baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// configura o salario-base
	public void setBaseSalary(double baseSalary)
	{
		if(baseSalary < 0.0) // valida baseSalary
		{
			if(baseSalary < 0.0) // valida baseSalary
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			
			this.baseSalary = baseSalary;
		}
		
		// retorna o salario-base
		public double getBaseSalary()
		{
			return baseSalary;
		}
		
		// calcula os vencimentos; sobrescreve o metodo earnings em CommissionEmployee
		@Override
		public double earnings()
		{
			return getBaseSalary() + super.earnings();
		}
		
		// retorna a representacao String do objeto BasePlusCommissionEmployee
		@Override
		public String toString()
		{
			return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
		}
		
	
}





// Figura 9.11: BasePlusCommissionEmployee.java
// A classe BasePlusCommissionEmployee e herdada de CommissionEmployee
// e acessa os dados private da superclasse via
// metodos public herdados

//public class BasePlusCommissionEmployee extends CommissionEmployee
//{
	//private double baseSalary; // salario-base por semana
	
	// construtor de seis argumentos
	//public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
	//{
		//super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		// se baseSalary e invalido, lanca uma excecao
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// configura o salario-base
	//public void setBaseSalary(double baseSalary)
	//{
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// retorna o salario-base
	//public double getBaseSalary()
	//{
		//return baseSalary;
	//}
	
	// calcula os lucros
	//@Override
	//public double earnings()
	//{
		//return getBaseSalary() + super.earnings();
	//}
	
	// retorna a representacao de String de BasePlusCommissionEmployee
	//@Override
	//public String toString()
	//{
		//return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	//}
//} // fim da classe BasePlusCommissionEmployee









// Figura 9.9: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee herda variaveis de instancia protected de
// CommissionEmployee

//public class BasePlusCommissionEmployee extends CommissionEmployee
//{
	//private double baseSalary; // salario-base por semana
	
	// construtor de seis argumentos
	//public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)\
	//{
		//super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		// se baseSalary e invalido, lanca uma excecao
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// configura o salario-base
	//public void setBaseSalary(double baseSalary)
	//{
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// retorna o salario-base
	//public double getBaseSalary()
	//{
		//return baseSalary;
	//}
	
	// calcula os lucros
	//@Override // indica que esse metodo substitui um metodo da superclasse
	//public double earnings()
	//{
		//return baseSalary + (CommissionRate * grossSales);
	//}
	
	// retorna a representacao de String de BasePlusCommissionEmployee
	//@Override
	//public String toString()
	//{
		
	//return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
			//"base-salaried commission employee", firstName, lastName, 
			//"social security number", socialSecurityNumber, "gross Sales", grossSales, "commission rate", commissionRate, "base salary", baseSalary);
	//}
//}





// Figura 9.8: BasePlusCommissionEmployee.java
// Membros private da superclasse nao podem ser acessados emuma subclasse

//public class BasePlusCommissionEmployee extends CommissionEmployee
//{
	//private double baseSalary; // salario-base por semana
	
	// construtor de seis argumentos
	//public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSales, double commissionRate, double baseSalary)
	//{
		// chamada explicita para o construtor CommissionEmployee da superclasse
		//super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		// se baseSalary e invalido, lanca uma excecao
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// configura o salario-base
	//public void setBaseSalary(double baseSalary)
	//{
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// calcula os lucros
	//@Override
	//public double earnings()
	//{
		// nao permitido: commissionRate e grossSales privado em superclasse
		//return baseSalary + (commissionRate * grossSales);
	//}
	
	// retorna a representacao de String de BasePlusCommissionEmployee
	//@Override
	//public String toString()
	//{
		// nao permitido: tenta acessar membros private da superclasse
		//return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate, "base salary", baseSalary);
	//}
//} // fim da classe BasePlusCommissionEmployee





// Figura 9.6: BasePlusCommissionEmployee.java
// A classe BasePlusCommissionEmployee representa um empregado que recebe
// um salario-base alem da comissao

//public class BasePlusCommissionEmployee 
//{

	//private final String firstName;
	//private final String lastName;
	//private final String socialSecurityNumber;
	//private double grossSales; // vendas brutas semanais
	//private double commissionRate; // percentagem da comissao
	//private double baseSalary; // salario-base por semana
	
	// construtor de seis argumentos
	//public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
	//{
		// a chamada implicita para o construtor padrao de Object ocorre aqui
		
		// se grossSales e invalido, lanca uma excecao
		//if(grossSales < 0.0)
			//throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		// se commissionRate e invalido, lanca uma excecao
		//if(commissionRate <= 0.0 || commissionRate >= 1.0)
			//throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
		
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.socialSecurityNumber = socialSecurityNumber;
		//this.grossSales = grossSales;
		//this.commissionRate = commissionRate;
		//this.baseSalary = baseSalary;
	//} // fim do construtor
	
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
	
	// retorna o numero de seguro social
	//public String getSocialSecurityNumber()
	//{
		//return socialSecurityNumber;
	//}
	
	// configura a quantidade de vendas brutas
	//public void setGrossSales(double grossSales)
	//{
		//if(grossSales < 0.0)
			//throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		//this.grossSales = grossSales;
	//}
	
	// retorna a quantidade de vendas brutas
	//public double getGrossSales()
	//{
		//return grossSales;
	//}
	
	// configura a taxa de comissao
	//public void setCommissionRate(double commissionRate)
	//{
		//if(commissionRate <= 0.0 || commissionRate >= 1.0)
			//throw new IllegalArgumentException("Commission rate must be > 0.0 and 1.0");
		
		//this.commissionRate = commissionRate;
	//}
	
	// retorna a taxa de comissao
	//public double getCommissionRate()
	//{
		//return commissionRate;
	//}
	
	// configura o salario-base
	//public void setBaseSalary(double baseSalary)
	//{
		//if(baseSalary < 0.0)
			//throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		//this.baseSalary = baseSalary;
	//}
	
	// retorna o salario-base
	//public double getBaseSalary()
	//{
		//return baseSalary;
	//}
	
	// calcula os lucros
	//public double earnings()
	//{
		//return baseSalary + (commissionRate * grossSales);
	//}
	
	// retorna a representacao de String de BasePlusCommissionEmployee
	//@Override
	//public String toString()
	//{
		//return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate, "base salary", baseSalary);
	//}
//} // fim da classe BasePlusCommissionEmployee
