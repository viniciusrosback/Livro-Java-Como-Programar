// Figura 3.9: AccountTest.java
// Entrada e saida de numeros de ponto flutuante com objetos Account

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args) 
	{
	
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// exibe saldo inicial de cada objeto
		System.out.printf("%s balance: $%.2f %n", account1.getName(null), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(null), account2.getBalance());
		
		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtem a entrada do usuario
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1
		
		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n", account1.getName(null), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(null), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtem a entrada do usuario
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo de account2
		
		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n", account1.getName(null), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(null), account2.getBalance());
	} // fim de main
} // fim da classe AccountTest





// Figura 3.6: AccountTest.java
// Usando o construtor de Account para incializar a instancia name
// variavel no momento em que cada objeto Account e criado

//public class AccountTest
//{
	//public static void main(String[] args) 
	//{
	
		// cria dois objetos Account
		//Account account1 = new Account("Jane Green");
		//Account account2 = new Account("John Blue");
		
		// exibe o valor inicial de nome para cada Account
		//System.out.printf("account1 name is: %s%n", account1.getName());
		//System.out.printf("account2 name is: %s%n", account2.getName());
	//}
//} // fim da classe AccountTest




// Figura 3.2: AccountTest.java
// Cria e manipula um objeto Account

//import java.util.Scanner;

//public class AccountTest 
//{

	//public static void main(String[] args) 
	//{
		// cria um objeto Scanner para obter entrada a partir da janela de comando
		//Scanner input = new Scanner(System.in);
		
		// cria um objeto Account e o atribui a myAccount
		//Account myAccount = new Account();
		
		// exibe o valor inicial do nome (null)
		//System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		// solicita e le o nome
		//System.out.println("Please enter the name: ");
		//String theName = input.nextLine(); // le uma linha de texto
		//myAccount.setName(theName); // insere theName em myAccount
		//System.out.println(); // gera saida de uma linha em branco
		
		// exibe o nome armazenado no objeto myAccount
		//System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
	//}
//} // fim da classe AccountTest
