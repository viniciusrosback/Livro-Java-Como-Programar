// Figura 16.15: PriorityQueueTest.java
// Programa de teste de PriorityQueue

import java.util.PriorityQueue;

public class PriorityQueueTest 
{

	public static void main(String[] args) 
	{
		
		// fila de capacidade 11
		PriorityQueue<Double> queue = new PriorityQueue<>();
		
		// insere elementos na fila
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		
		System.out.printf("Polling from queue: ");
		
		// exibe elementos na fila
		while(queue.size() > 0)
		{
			System.out.printf("%.1f ", queue.peek()); // visualiza o elemento superior
			queue.poll(); // remove o elemento superior
		}
	}
} // fim da classe PriorityQueueTest
