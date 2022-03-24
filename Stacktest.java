// Figura 20.9: StackTest.java
// Programa de teste da classe

public class StackTest
{
	public static void main(String[] args) 
	{
	
		double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Criando um Stack<Double> e um Stack<Integer>
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();
		
		// coloca os elementos de doubleElements em doubleStack
		testPushDouble(doubleStack, doubleElements);
		testPopDouble(doubleStack); // remove de doubleStack
		
		// coloca os elementos de integerElements em integerStack
		testPushInteger(integerStack, integerElements);
		testInteger(integerStack); // remove de integerStack
	}
	
	// testa o metodo push com a pilha de double
	private static void testPushDouble(Stack<Double> stack, double[] values)
	{
		System.out.printf("%nPushing elements onto doubleStack%n");
		
		// insere elementos na Stack
		for(double value : values)
		{
			System.out.printf("%n.1f ", value);
			stack.push(value); // insere em doubleStack
		}
	}
	
	// testa o metodo pop com a pilha de double
	private static void testPopDouble(Stack<Double> stack)
	{
		// remove elementos da pilha
		try
		{
			System.out.printf("%nPopping elements from doubleStack%n");
			double popValue; // armazena o elemento removido da pilha
			
			// remove todos os elementos da Stack
			while(true)
			{
				popValue = stack.pop();
			}
		}
		
		catch(EmptyStackException emptyStackException)
		{
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
	
	// testa o metodo push com a pilha de integer
	private static void testPushInteger(Stack<Integer> stack, int[] values)
	{
		System.out.printf("%nPushing elements onto integerStack%n");
		
		// insere elementos na Stack
		for(int value : values)
		{
			System.out.printf("%d ", value);
			stack.push(value); // insere em integerStack
		}
	}
	
	// testa o metodo pop com a pilha de integer
	private static void testPopInteger(Stack<Integer> stack)
	{
		// remove elementos da pilha
		try 
		{
		
			System.out.printf("%nPopping elements from integerStack%n");
			int popValue; // armazena o elemento removido da pilha
			
			// remove todos os elementos da Stack
			while(true)
			{
				popValue = stack.pop(); // remove de intStack
				System.out.printf("%d ", popValue);
			}
		}
		
		catch(EmptyStackException emptyStackException)
		{
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
	
} // fim da classe StackTest











/*
// Figura 16.14: StackTest.java
// classe Stack do pacote java.util

import java.util.Stack;
import java.util.EmptyStackException;

public class Stacktest 
{

	public static void main(String[] args) 
	{
	
		Stack<Number> stack = new Stack<>(); // cria uma Stack
		
		// utiliza metodo push
		stack.push(12L); // insere valor long 12L
		System.out.println("Pushed 12L");
		printStack(stack);
		stack.push(34567); // insere o valor int 34567
		System.out.println("Pushed 34567");
		printStack(stack);
		stack.push(1.0F); // insere o valor float 1.0F
		System.out.println("Pushed 1.0F");
		printStack(stack);
		stack.push(1234.5678); // insere o valor double 1234.5678
		System.out.println("Pushed 1234.5678 ");
		printStack(stack);
		
		// remove itens de pilha
		try
		{
			Number removedObject = null;
			
			// remove elementos da pilha
			while(true)
			{
				removedObject = stack.pop(); // utiliza metodo pop
				System.out.printf("Popped %s%n", removedObject);
				printStack(stack);
			}
		}
		
		catch(EmptyStackException emptyStackException)
		{
			emptyStackException.printStackTrace();
		}
	}
	
	// exibe o conteudo de Stack
	private static void printStack(Stack<Number> stack)
	{
		if(stack.isEmpty())
			System.out.printf("stack is empty%n%n"); // a pilha esta vazia
		else // a pilha nao esta vazia
			System.out.printf("stack contains: %s (top)%n", stack);
	}
} // fim da classe StackTest
*/
