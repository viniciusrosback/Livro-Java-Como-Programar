// Figura 15.8: CreditInquiry.java
// Esse programa le um arquivo sequencialmente e exibe o
// conteudo baseado no tipo de conta que o usuario solicita
// (saldo credor, saldo devedor ou saldo zero).

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry 
{

	private final static MenuOption[] choices = MenuOption.values();
	
	public static void main(String[] args) 
	{
	
		// obtem a solicitacao do usuario (por exemplo, saldo zero, credor ou devedor)
		MenuOption accountType = getRequest();
		
		while(accountType != MenuOption.END);
		{
			switch(accountType)
			{
			case ZERO_BALANCE:
				System.out.printf("%nAccounts with zero balances:%n");
				break;
			case CREDIT_BALANCE:
				System.out.printf("%nAccounts with credit balances:%n");
				break;
			case DEBIT_BALANCE:
				System.out.printf("%nAccounts with debit balances:%n");
				break;
			}
			
			readRecords(accountType);
			accountType = getRequest(); // obtem a solicitacao do usuario
		}
	}
	
	// obtem a solicitacao do usuario
	private static MenuOption getRequest()
	{
		int request = 4;
		
		// exibe opcoes de solicitacao
		System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n", "1 - List accounts with zero balances", "2 - List accounts with credit balances", "3 - List accounts with debit balances", "4 - Terminate program");
		
		try
		{
			Scanner input = new Scanner(System.in);
			
			do // insere a solicitacao de usuario
			{
				System.out.printf("%n?");
				request = input.nextInt();
			} while ((request < 1) || (request > 4));
		}
		
		catch(NoSuchElementException noSuchElementException)
		{
			System.err.println("Invalid input. Terminating.");
		}
		
		return choices[request - 1]; // retorna o valor enum da opcao
	}
	
	// le registros de arquivo e exibe somente os registros do tipo apropriado
	private static void readRecords(MenuOption accountType)
	{
		// abre o arquivo e processa o conteudo
		try(Scanner input = new Scanner(Paths.get("clients.txt")))
		{
			while(input.hasNext()) // mais dados para ler
			{
				int accountNumber = input.nextInt();
				String firstName = input.next();
				String lastName = input.next();
				double balance = input.nextDouble();
				
				// se o tipo for a conta adequada, exibe o registro
				if(shouldDisplay(accountType, balance))
					System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
				else
					input.nextLine(); // descarta o restante do registro atual
			}
		}
		
		catch(NoSuchElementException | IOException e)
		{
			System.err.println("Error processing file. Terminating.");
			System.exit(1);
		}
	} // fim do metodo readRecords
	
	// utiliza o tipo de registro para determinar se registro deve ser exibido
	private static boolean shoulDisplay(MenuOption accountType, double balance)
	{
		if((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
			return true;
		else if((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
			return true;
		else if((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
			return true;
		
		return false;
	}
} // fim da classe CreditInquiry
