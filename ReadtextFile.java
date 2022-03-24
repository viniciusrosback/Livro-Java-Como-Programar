// Figura 15.6: ReadTextFile.java
// Esse programa le um arquivo de texto e exibe cada registro

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadtextFile 
{

	private static Scanner input;
	
	public static void main(String[] args) {
		
		openFile();
		readRecords();
		closeFile();
	}
	
	// abre o arquivo clients.txt
	public static void openFile()
	{
		try
		{
			input = new Scanner(Paths.get("clients.txt"));
		}
		
		catch(IOException ioException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}
	
	// le o registro no arquivo
	public static void readRecords()
	{
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balace");
		
		try
		{
			while(input.hasNext()) // enquanto houver mais para ler
			{
				// exibe o conteudo de registro
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			}
		}
		
		catch(NoSuchElementException elementException)
		{
			System.err.println("File improperly formed. Terminating.");
		}
		
		catch(IllegalStateException stateException)
		{
			System.err.println("Error reading from file. Terminating.");
		}
	} // fim do metodo readRecords
	
	// fecha o arquivo e termina o aplicativo
	public static void closeFile()
	{
		if(input != null)
			input.close();
	}
} // fim da classe ReadTextFile
