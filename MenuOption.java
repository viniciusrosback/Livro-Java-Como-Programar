// Figura 15.7: MenuOption.java
// tipo enum para as opcoes do programa de consulta de credito

public enum MenuOption 
{

	// declara o conteudo do tipo enum
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value; // opcao atual de menu
	
	// construtor
	private MenuOption(int value)
	{
		this.value = value;
	}
} // fim do enum de MenuOption
