// Figura 21.10: StackInheritance.java
// StackInheritance estende a classe List

//package com.deitel.datastructures;

public class StackInheritance<T> extends List<T>
{

	// constructor
	public StackInheritance()
	{
		super("stack");
	}
	
	// adiciona objeto a pilha
	public void push(T object)
	{
		insertAtFront(object);
	}
	
	// remove objeto da pilha
	public T pop() throws EmptyListException
	{
		return removeFromFront();
	}
} // fim da classe StackInheritance
