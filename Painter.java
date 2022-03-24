// Figura 12.35: Painter.java
// Testando o PaintPanel

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter 
{

	public static void main(String[] args) 
	{
	
		// cria o JFrame
		JFrame application = new JFrame("A simple paint program");
		
		PaintPanel paintPanel = new PaintPanel();
		application.add(paintPanel, BorderLayout.CENTER);
		
		// cria um rotulo e o coloca em SOUTH do BorderLayout
		application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 200);
		application.setVisible(true);
	}
} // fim da classe Painter
