// Figura 22.10: LookAndFeelDemo.java
// Alterando a aparencia e comportamento

import javax.swing.JFrame;

public class LookAndFeelDemo 
{

	public static void main(String[] args) 
	{
	
		LookAndFeelFrame.lookAndFeelFrame = new LookAndFeelFrame();
		LookAndFeelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lookAndFeelFrame.setSize(400, 220);
		lookAndFeelFrame.setVisible(true);
	}
} // fim da classe LookAndFeelDemo
