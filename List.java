// Figura 21.3: List.java
// Declaracoes de classe ListNode e List


// classe para representar um no em uma lista
Class ListNode<T>
{

	
	// membros de acesso de pacote; List pode acessa-los diretamente
	T data; // dados para esse no
	ListNode<T> nextNode; // referencia para o proximo no na lista
	
	// construtor cria um ListNode que referencia o objeto
	ListNode(T object)
	{
		this(object, null);
	}
	
	// construtor cria ListNode que referencia o objeto
	// especificado e o proximo ListNode
	ListNode(T object, ListNode<T> node)
	{
		data = object;
		nextNode = node;
	}
	
	// retorna referencia aos dados no no
	T getData()
	{
		return data;
	}
	
	// retorna referencia ao proximo no na lista
	ListNode<T> getNext()
	{
		return nextNode;
	}
} // fim da classe ListNode<T>


// definicao da classe List
public class List<T>
{
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name; // string como "lista" usada na impressao
	
	// construtor cria List vazia com "list" como o nome
	public List()
	{
		this("list");
	}
	
	// construtor cria uma List vazia com um nome
	public List(String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	}
	
	// insere o item na frente de List
	public void insertAtFront(T insertItem)
	{
		if(isEmpty()) // firstNode e lastNode referenciam o mesmo objeto
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // firstNode referenciam o novo no
			firstNode = new ListNode<T>(insertItem, firstNode);
	}
	
	// insere o item no fim de List
	public void insertAtBack(T insertItem)
	{
		if(isEmpty()) // firstNode referenciam o mesmo objeto
			firstNode = lastNode = new ListNode<T>(insertItem);
	}
	
	// remove o primeiro no de List
	public T removeFromFront() throws EmptyListException
	{
		if(isEmpty()) // lanca excecao se List estiver vazia
			throw new EmptyListException(name);
		
		T removedItem = firstNode.data; // recupera dados sendo removidos
		
		// atualiza referencias firstNode e lastNode
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
		
		return removedItem; // retorna dados de no removidos
	}
	
	// remove o ultimo no de List
	public T removeFromBack() throws EmptyListException
	{
		if(isEmpty()) // lanca excecao se List estiver vazia
			throw new EmptyListException(name);
		
		T removedItem = lastNode.data; // recupera dados sendo removidos
		
		// atualiza referencias firstNode e lastNode
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else // localiza o novo ultimo no
		{
			ListNode<T> current = firstNode;
			
			// faz loop enquanto o no atual nao referencia lastNode
			while(current.nextNode != lastNode)
				current = current.nextNode;
			
			lastNode = current; // atual e novo lastNode
			current.nextNode = null;
		}
		
		return removedItem; // retorna dados de no removidos
	}
	
	// determina se a lista estiver vazia
	public boolean isEmpty()
	{
		if(isEmpty())
		{
			System.out.printf("Empty %s%n", name);
			return;
		}
		
		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;
		
		// enquanto nao estiver no fim de lista, gera saida dos dados do no atual
		while(current != null)
		{
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		
		System.out.println();
	}
} // fim da classe List<T>