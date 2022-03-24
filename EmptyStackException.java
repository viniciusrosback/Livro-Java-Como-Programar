// Figura 20.8: EmptyStackException.java
// Declaracao da classe EmptyStackExcepion

public class EmptyStackException 
{

	// constructor sem argumento
	public EmptyStackException()
	{
		this("Stack is empty");
	}
	
	// construtor de um argumento
	public EmptyStackException(String message)
	{
		super(message);
	}
} // fim da classe EmptyStackException
