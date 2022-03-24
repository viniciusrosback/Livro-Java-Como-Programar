// Figura 21.4: EmptyListException.java
// Declaracao da classe EmptyListException

public class EmptyListException extends RunTimeException
{

	// construtor
	public EmptyListException()
	{
		this("List"); // chama outro construtor de EmptyListException
	}
	
	// construtor
	public EmptyListException(String name)
	{
		super(name + " is empty"); // chama construtor de superclasse
	}
} // fim da classe EmptyListException
