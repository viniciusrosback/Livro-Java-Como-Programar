// Figura 8.18: DrawPanel.java
// Programa que utiliza a classe MyLine
// para desenhar linhas aleatoria

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines; // array de linhas
	
	// construtor, cria um painel com formas aleatorias
	public DrawPanel()
	{
		setBackground(Color.WHITE);
		
		lines = new MyLine[5 + randomNumbers.nextInt(5)];
		
		// cria linhas
		for(int count =0; count < lines.length; count ++)
		{
			// gera coordenadas aleatorias
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			// gera uma cor aleatoria
			Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			
			// adiciona a linha a lista de linhas a ser exibida
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
	}
	
	// para cada array de forma, desenha as formas individuais
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// desenha as linhas
		for(MyLine line : lines)
			line.draw(g);
	}
} // fim da classe DrawPanel



// Figura 4.18: DrawPanel.java
// Utiliza DrawLine para conectar os cantos de um painel

//import java.awt.Graphics;
//import javax.swing.JPanel;

//public class DrawPanel extends JPanel
//{

	 // desenha um X a partir dos canots do painel
	//public void paintComponent(Graphics g)
	//{
		// chama paintComponent(g);
		
		//int width = getWidth(); // largura total
		//int height = getHeight(); // altura total
		
		// desenha uma linha a partir do canto superior esquerdo ate o inferior direito
		//g.drawLine(0, 0, width, height);
		
		// desenha uma linha a partir do canto inferior esquerdo ate o superior direito
		//g.drawLine(0, height, width, 0);
	//}
//} // fim da classe DrawPanel
