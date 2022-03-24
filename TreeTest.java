// Figura 21.18: TreeTest.java
// Programa de teste da arvore binaria

import java.security.SecureRandom;
//import com.deitel.datastructures.Tree;

public class TreeTest 
{

	public static void main(String[] args) 
	{
	
		Tree<Integer> tree = new Tree<Integer>();
		SecureRandom randomNumber = new SecureRandom();
		
		System.out.println("Inserting the following values: ");
		
		// insere 10 inteiros aleatorios de 0 a 99 na arvore
		for(int i = 1; i <= 10; i ++)
		{
			int value = randomNumber.nextInt(100);
			tree.insertNode(value);
		}
		
		System.out.printf("%n%nPreorder traversal%n");
		tree.preorderTraversal();
		
		System.out.printf("%n%nInorder traversal%n");
		tree.inorderTraversal();
		
		System.out.printf("%n%nPostorder traversal%n");
		tree.postorderTraversal();
		System.out.println();
	}
} // fim da classe TreeTest
