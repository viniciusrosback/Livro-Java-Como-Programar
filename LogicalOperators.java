// Figura 5.19: LogicalOperators.java
// Operadores logicos

public class LogicalOperators 
{

	public static void main(String[] args) 
	{
	
		// cria a tabela-verdade para o operador && (E condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
				"Conditional AND (&&)", "false && false", (false && false), 
				"false && true", (false && true),
				"true && false", (true && false),
				"true && true", (true && true));
		
		// cria a tabela-verdade para o operador || (OU condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
				"Conditional OR (||)", "false || false", (false || false),
				"false || true", (false || true),
				"true || false", (true || false),
				"true || true", (true || true));
		
		// cria a tabela-verdade para o operador & (E logico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
				"Boolean logical AND (&)", "false & false", (false & false),
				"false & true", (false & true),
				"true & false", (true & false),
				"true & true", (true & true));
		
		// cria a tabela-verdade para o operador | (OU inclusivo logico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical inclusive OR (|)",
				"Boolean logical inclusive OR (|)",
				"false | false", (false | false),
				"false | true", (false | true),
				"true | false", (true | false),
				"true | true", (true | true));
		
		// cria a tabela-verdade para o operador ^ (OU exclusivo logico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical inclusive OR (|)",
				"Boolean logical inclusive OR (^)",
				"false | false", (false ^ false),
				"false | true", (false ^ true),
				"true | false", (true ^ false),
				"true | true", (true ^ true));
		
		// cria a tabela-verdade para o operador ! (negacao logica)
		System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)", "!false", (!false), "!true", (!true));
	}
} // fim da classe LogicalOperators
