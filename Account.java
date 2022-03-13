// Figura 15.9: Account.java
// Classe Account serializavel para armazenar registros como objetos

import java.io.Serializable;

public class Account implements Serializable{
	
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	// inicializa uma Account com valores padrao
	public Account()
	{
		this(0, "", "", 0.0); // chama outro construtor
	}
	
	// inicializa uma Account com os valores fornecidos
	public Account(int account, String firstName, String lastName, double balance)
	{
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	// configura o numero de conta
	public void setAccount(int acct)
	{
		this.account = account;
	}
	
	// obtem numero de conta
	public int getAccount()
	{
		return account;
	}
	
	// configura o nome
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// obtem o nome
	public String getFirstName()
	{
		return firstName;
	}
	
	// configura o sobrenome
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// obtem o sobrenome
	public String getLastName()
	{
		return lastName;
	}
	
	// configura saldo
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	// obtem saldo
	public double getBalance()
	{
		return balance;
	}
} // fim da classe Account




// Figura 3.8: Account.java
// Classe Account com uma variavel de instancia balance do tipo double e um construtor
// e metodo deposit que executa a validacao

//public class Account
//{
	//private String name; // variavel de instancia
	//private double balance; // variavel de instancia
	
	// Construtor de Account que recebe dois parametros
	//public Account(String name, double balance)
	//{
		//this.name = name; // atribui name a variavel de instancia name
		
		// valida que o balance e maior que 0.0; se nao for,
		// a variavel de instancia balance mantem seu valor inicial padrao de 0.0
		//if(balance > 0.0) // se o saldo for valido
			//this.balance = balance; // o atribui a variavel de instancia balance
	//}
	
	// metodo que deposita (adiciona) apenas uma quantia valida no saldo
	//public void deposit(double depositAmount)
	//{
		//if(depositAmount > 0.0) // se depositAmount for valido
			//balance = balance + depositAmount; // o adiciona ao saldo
	//}
	
	// metodo retorna o saldo da conta
	//public double getBalance()
	//{
		//return balance;
	//}
	
	// metodo que define o nome
	//public void setName(String name)
	//{
		//this.name = name;
	//}
	
	// metodo que retorna o nome
	//public String getName(String name)
	//{
		//return name; // retorna o valor de name ao chamador
	//} // fim do metodo getName
//} // fim da classe Account




// Figura 3.5: Account.java
// a classe Account com um construtor que inicializa o nome

//public class Account
//{
	//private String name; // variavel de instancia
	
	
	// o construtor inicializa name com nome do parametro
	//public Account(String name) // o nome do construtor e nome da classe
	//{
		//this.name = name;
	//}
	
	// metodo para configurar o nome
	//public void setName(String name)
	//{
		//this.name = name;
	//}
	
	// metodo para recuperar o nome do curso
	//public String getName()
	//{
		//return name;
	//}
//} // fim da classe Account





// Figura 3.1: Account.java
// Classe Account que contem uma variavel de instancia name
// e metodos para configurar e obter seu valor

//public class Account 
//{

	//private String name; // variavel de instancia
	
	// metodo para definir o nome no objeto
	//public void setName(String name)
	//{
		//this.name = name; // armazena o nome
	//}
	
	// metodo para recuperar o nome do objeto
	//public String getName()
	//{
		//return name; // retorna valor do nome para o chamador
	//}
	
//} // fim da classe Account
