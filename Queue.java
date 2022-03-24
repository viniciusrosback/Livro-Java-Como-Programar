// Figura 21.13: Queue.java
// Queue usa a classe List

public class Queue 
{

	private List<T> queueList;
	
	// construtor
	public Queue()
	{
		queueList = new List<T>("queue");
	}
	
	// adiciona o objeto a fila
	public void enqueue(T object)
	{
		queueList.insertAtBack(object);
	}
	
	// remove o objeto da fila
	public T dequeue( throws EmptyListException)
	{
		return queueList.removeFromFront();
	}
	
	// determina se a fila esta vazia
	public boolean isEmpty()
	{
		return queueList.isEmpty();
	}
	
	// gera o conteudo da fila
	public void print()
	{
		queueList.print();
	}
} // fim da classe Queue
