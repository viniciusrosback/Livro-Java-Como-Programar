// Figura 21.12: StackComposition.java
// StackComposition usa um objeto List composto.

//package com.deitel.datastructures;

public class StackComposition {

	private List<T> stackList;
	
	// construtor
	public StackComposition()
	{
		stackList = new List<T>("stack");
	}
	
	// adiciona ojeto a lista
	public void push(T object)
	{
		stackList.insertAtFront(object);
	}
	
	// remove objeto da pilha
	public T pop() throws EmptyListException
	{
		return stackList.removeFromFront();
	}
	
	// determina se a pilha esta vazia
	public boolean isEmpty()
	{
		return stackList.isEmpty();
	}
	
	// gera saida do conteudo de pilha
	public void print()
	{
		stackList.print();
	}
} // fim da classe StackComposition
