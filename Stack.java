// Figura 20.7: Stack.java
// Declaracao da classe generica Stack

import java.util.ArrayList;

public class Stack <T>
{

	private final ArrayList<T> elements; // ArrayList armazena elementos da pilha
	
	// construtor sem argumento cria uma pilha do tamanho padrao
	public Stack()
	{
		this(10); // tamanho padrao da pilha
	}
	
	// construtor cria uma pilha com o numero especificado de elementos
	public Stack(int capacity)
	{
		int initCapacity = capacity > 0 ? capacity : 10; // valida
		elements = new ArrayList<T>(initCapacity); // cria a ArrayList
	}
	
	// insere o elemento na pilha
	public void push(T pushValue)
	{
		elements.add(pushValue); // insere pushValue na Stack
	}
	
	// retorna o elemento superior se nao estiver vazia; do contrario lanca uma EmptyStackException
	public T pop()
	{
		if(elements.isEmpty()) // se a pilha estiver vazia
			throw new EmptyStackException("Stack is empty, cannot pop");
		
		// remove e retorna o elemento superior da Stack
		return elements.remove(elements.size() -1);
	}
}
