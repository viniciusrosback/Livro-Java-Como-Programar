// Figura 11.7: UsingChainedExceptions.java
// Excecoes encadeadas

public class UsingChainedExceptions 
{

	public static void main(String[] args) 
	{
	
		try
		{
			method1();
		}
		
		catch(Exception exception) // excecoes lancadas de method1
		{
			exception.printStackTrace();
		}
	}
	
	// chama method2; lanca de volta para main
	public static void method1() throws Exception
	{
		try
		{
			method2();
		} // fim do try
		
		catch(Exception exception) // excecao lancada de method2
		{
			throw new Exception("Exception thrown in method1", exception);
		}
	}
	
	// chama method3; lanca excecoes de volta para method1
	public static void method2() throws Exception
	{
		try
		{
			method3();
		}
		
		catch(Exception exception) // excecao lancada de method3
		{
			throw new Exception("Exception thrown in method2", exception);
		}
	}
	
	// lanca Exception de volta para method2
	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3");
	}
} // fim da classe UsingChainedExceptions
