// Figura 10.7: CommissionEmployee.java
// Classe CommissionEmployee estende Employee

public class CommissionEmployee extends Employee
{
	private double grossSales; // vendas brutas semanais
	private double commissionRate; // porcentagem da comissao
	
	// construtor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0) // valida
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		if(grossSales < 0.0) // valida
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}
	
	// retorna a quantidade de vendas brutas
	public double getGrossSales()
	{
		return grossSales;
	}
	
	// configura a taxa de comissao
	public void setCommissionRate(double commissionRate)
	{
		if(commissionRate <= 0.0 || commissionRate >= 1.0) // valida
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	// calcula os rendimentos; sobrescreve o metodo earnigs em Employee
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
	}
	
} // fim da classe CommissionEmployee






// Figura 9.10: Figura 9.10: CommissionEmployee.java
// A classe CommissionEmployee usa metodos para manipular suas
// variaveis de instancia private

//public class CommissionEmployee
//{
	//private final String firstName;
	//private final String lastName;
	//private final String socialSecurityNumber;
	//private double grossSales; // vendas brutas semanais
	//private double commissionRate; // porcentagem da comissao
	
	// construtor de cinco argumentos
	//public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	//{
		// chamada implicita para o construtor Object ocorre aqui
		
		// se grossSales e invalido, lanca uma excecao
		//if(commissionRate <= 0.0 || commissionRate >= 1.0)
			//throw new IllegalArgumentException("Commission rate must be > 0.0 and 1.0");
		
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.socialSecurityNumber = socialSecurityNumber;
		//this.grossSales = grossSales;
		//this.commissionRate = commissionRate;
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
			//throw new IllegalArgumentException("Commission rate must be > 0.0 and <= 1.0");
		
		//this.commissionRate = commissionRate;
	//}
		
	// retorna a taxa de commissao
	//public double getCommissionRate()
	//{
		//return commissionRate;
	//}
		
	// calcula os lucros
	//public double earnings()
	//{
		//return getCommissionRate() * getGrossSales();
	//}
		
	// retorna a representacao String do objeto CommissionEmployee
	//@Override
	//public String toString()
	//{
		//return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
	//}
		
	
//} // fim da classe CommissionEmployee




// Figura 9.14: CommissionEmployee.java
// A classe CommissionEmployee representa um empregado que recebeu um
// percentual das vendas brutas

//public class CommissionEmployee extends Object
//{

	//private final String firstName;
	//private final String lastName;
	//private final String socialSecurityNumber;
	//private double grossSales; // vendas brutas semanais
	//private double commissionRate; // percentagem da comissao
	
	// construtor de cinco argumentos
	//public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	//{
		// a chamada implicita para o construtor padrao de Object ocorre aqui
		
		// se grossSales e invalido, lanca uma excecao
		//if(grossSales < 0.0)
			//throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		// se commissionRate e invalido, lanca uma excecao
		//if(commissionRate <= 0.0 || commissionRate >= 1.0)
			//throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.socialSecurityNumber = socialSecurityNumber;
		//this.grossSales = grossSales;
		//this.commissionRate = commissionRate;
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
		//if(commissionRate  <= 0.0 || commissionRate >= 1.0)
			//throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	
		//this.commissionRate = commissionRate;
	//}

	// retorna a taxa de comissao
	//public double getCommissionRate()
	//{
		//return commissionRate;
	//}
	
	// calcula os lucros
	//public double earnings()
	//{
		//return commissionRate * grossSales;
	//}
	
	// retorna a representacao String do objeto CommissionEmployee
	//@Override // indica que esse metodo substitui um metodo da superclasse
	//public String toString()
	//{
		//return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate);
	//}
//} // fim d aclasse CommissionEmployee

