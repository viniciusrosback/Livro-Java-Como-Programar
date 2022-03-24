// Figura 3.13: NameDialog.java
// Obtendo a entrada de usuario a partir de um dialogo

import javax.swing.JOptionPane;

public class NameDialog 
{

	public static void main(String[] args) 
	{
		// pede para o usuario inserir seu nome
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// cria a mensagem
		String message = String.format("Welcome, %s, to Java Programming!", name);
		
		// exibe a mensagem para cumprimentar o usuario pelo nome
		JOptionPane.showMessageDialog(null, message);
	} // fim de main
} // termina NameDialog
