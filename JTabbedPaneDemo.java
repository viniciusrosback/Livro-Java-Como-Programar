// Figura 22.4: JTabbedPaneDemo.java
// Demonstrando o JTabbedPane

import javax.swing.JFrame;

public class JTabbedPaneDemo 
{

	public static void main(String[] args) 
	{
	
		JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame();
		tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPaneFrame.setSize(250, 200);
		tabbedPaneFrame.setVisible(true);
	}
} // fim da classe JTabbedPaneDemo
