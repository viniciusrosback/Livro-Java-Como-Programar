// Figura 7.26: DrawRainbowTest.java
// Aplicativo de teste para exibir um arco-iris

import javax.swing.JFrame;

public class DrawRainbowTest 
{

	public static void main(String[] args) 
	{
	
		DrawRainbow panel = new DrawRainbow();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
	}
} // fim da classe DrawRainbowTest
