// Figura 11.6: UsingExceptions.java
// Desempilhando e obtendo dados a partir de um objeto de excecao

public class UsingExceptions
{
	public static void main(String[] args) 
	{
	
		try
		{
			method1();
		}
		
		catch(Exception exception) // captura a excecao lancada em method1
		{
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();
			
			// obtem informacoes de rastreamento de pilha
			StackTraceElement[] traceElements = exception.getStackTrace();
			
			System.out.printf("%nStack trace from getStackTrace:%n");
			System.out.println("Class\t\tFile\t\t\tLine\tMethod");
			
			// faz um loop por traceElementspara obter a descricao da excecao
			for(StackTraceElement element: traceElements)
			{
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}
	} // fim de main
	
	// chama method2; lanca excecoes de volta para main
	public static void method1() throws Exception
	{
		method2();
	}
	
	// chama method3; lanca excecoes de volta para method1
	public static void method2() throws Exception
	{
		method3();
	}
	
	// lanca Exception de volta para method2
	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3");
	}
} // fim da classe UsingExceptions




// Figura 11.5: UsingExceptions.java
// mecanismo de tratamento de excecao try...catch...finally

//public class UsingExceptions 
//{


	//public static void main(String[] args) 
	//{
	
		//try
		//{
			//throwException();
		//}
		
		//catch(Exception exception) // excecao lancada por throwException
		//{
			//System.err.println("Exception handled in main");
		//}
		
		//doesNotThrowException();
	//}
	
	// demonstra try...catch...finally
	//public static void throwException() throws Exception
	//{
		//try // lanca uma excecao e imediatamente a captura
		//{
			//System.out.println("Method throwException");
			//throw new Exception(); // gera a excecao
		//}
		
		//catch(Exception exception) // captura excecao lancada em try
		//{
			//System.err.println("Exception handled in method throwException");
			//throw exception; // lanca novamente para processamento adicional
			
			// o codigo aqui nao seria lancado; poderia causar erros de compilacao
		//}
		
		//finally // executa independentemente do que ocorre em try...catch
		//{
			//System.err.println("Finally executed in throwException");
		//}
		
		// o codigo aqui nao seria alcancado; poderia causar erros de compilacao
	//}
	
	// demonstra finally quando nenhuma excecao ocorrer
	//public static void doesNotThrowException()
	//{
		//try // bloco try nao lanca uma excecao
		//{
			//System.out.println("Method doesNotThrowException");
		//}
		
		//catch(Exception exception) // nao executa
		//{
			//System.err.println(exception);
		//}
		
		//finally // executa independentemente do que ocrre em try...catch
		//{
			//System.err.println("Finally executed in doesNotThrowException");
		//}
		
		//System.out.println("End of method doesNotThrowException");
	//}
//} // fim da classe UsingExceptions
