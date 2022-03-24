// Figura 13.30: Shapes.java
// Testando ShapesJPanel

import javax.swing.JFrame;

public class Shapes
{
	// executa o aplicativo
	public static void main(String[] args) 
	{
	
		// cria frame para ShapesJPanel
		JFrame frame = new JFrame("Drawing 2D shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// cria ShapesJPanel
		ShapesJPanel shapesJPanel = new ShapesJPanel();
		
		frame.add(shapesJPanel);
		frame.setSize(425, 200);
		frame.setVisible(true);
	}
} // fim da classe Shapes



// Figura 5.27: Shapes.java
// Desenhando uma cascata de formas com base na escolha do usuario

//import java.awt.Graphics;
//import javax.swing.JPanel;

//public class Shapes extends JPanel
//{

	//private int choice; // escolha do usuario de qual forma desenhar
	
	// construtor configura a escolha do usuario
	//public Shapes(int userChoice)
	//{
		//choice = userChoice;
	//}
	
	// desenha uma cascata de formas que iniciam do canto superior esquerdo
	//public void paintComponent(Graphics g)
	//{
		//super.paintComponent(g);
		
		//for(int i = 0; i < 10; i ++)
		//{
			// seleciona a forma com base na escolha do usuario
			//swich(choice)
			//{
				//case 1: // desenha retangulos
					//g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					//break;
				//case 2: // desenha ovais
					//g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					//break;
			//}
		//}
	//}
//} // fim da classe Shapes
