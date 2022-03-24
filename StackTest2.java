// Figura 20.10: StackTest2.java
// Passando objetos Stack genericos para metodos genericos

public class StackTest2 
{

	public static void main(String[] args) 
	{
	
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Criando um Stack<Double> e um Stack<Integer>
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();
		
		// coloca os elementos de doubleElements em doubleStack
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack); // remove de doubleStack
		
		// coloca os elementos de integerElements em integerStack
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack); // remove de integerStack
	}
	
	// metodo generico testPush insere elementos em uma Stack
	public static<T> void testPush(String name, Stack<T> stack, T[] elements)
	{
		System.out.printf("%nPushing elements onto %s%n", name);
		
		// insere elementos na Stack
		for(T element : elements)
		{
			System.out.printf("%s ", element);
			stack.push(element); // insere o elemento na pilha
		}
	}
	
	// metodo generico testPop remove elementos de uma Stack
	public static <T> void testPop(String name, Stack<T> stack)
	{
		// remove elementos da pilha
		try
		{
			System.out.printf("%nPopping elements from %s%n", name);
			T popValue; // armazena o elemento removido da pilha
			
			// remove todos elementos da Stack
			while(true)
			{
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		}
		
		catch(EmptyStackException emptyStackException)
		{
			System.out.println();
			emptyStackException.printStackTrace();
		}
	}
} // fim da classe StackTest2
