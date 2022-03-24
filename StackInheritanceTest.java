// Figura 21.11: StackInheritanceTest.java
// Programa de manipulacao de pilha

//import com.deitel.datastructures.StackInheritance;
//import com.deitel.datastructures.EmptyListException;

public class StackInheritanceTest 
{

	public static void main(String[] args) 
	{
	
		StackInheritance<Integer> stack = new StackInheritance<>();
		
		// utiliza o metodo push
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
		stack.push(5);
		stack.print();
		
		// remove itens de pilha
		try
		{
			int removedItem;
			
			while(true)
			{
				removedItem = stack.pop(); // utiliza o metodo pop
				System.out.printf("%n%d popped%n", removedItem);
				stack.print();
			}
		}
		
		catch(EmptyListException emptyListException)
		{
			emptyListException.printStackTrace();
		}
	}
} // fim da classe StackInheritanceTest
