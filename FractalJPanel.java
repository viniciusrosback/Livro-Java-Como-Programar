// Figura 18.19: FractalJPanel.java
// Desenhando o "fractal de Lo Feather" com a recursao

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel{

	private Color color; // armazena cor utilizada para desenhar o fractal
	private int level; // armazena o nivel atual do fractal
	
	private static final int WIDTH = 400; // define a largura do JPanel
	private static final int HEIGTH = 400; // define a altura do JPanel
	
	// configura o nivel do fractal inicial com o valor especificado
	// e configura as especificacoes do JPanel
	public FractalJPanel(int currentLevel)
	{
		color = Color.BLUE; // inicializa a cor do desenho como azul
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	// desenha o fractal recursivamente
	public void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g)
	{
		// caso basico: desenha uma linha conectando dois pontos dados
		if(level == 0)
			g.drawLine(xA, yA, xB, yB);
		else // passo de recursao: determina novos pontos, desenha proximo nivel
		{
			// calcula ponto intermediario entre (xA, yA) e (xB, yB)
			int xC = (xA + xB) / 2;
			int yC = (yA + yB) / 2;
			
			// calcula o quarto ponto (xD, yD) que forma um
			// triangulo isosceles entre (xA, yA) e (xC, yC)
			// onde o angulo direito esta a (xD, yD)
			int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
			int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;
			
			// desenha recursivamente o Fractal
			drawFractal(level - 1, xD, yD, xA, yA, g);
			drawFractal(level - 1, xD, yD, xC, yC, g);
			drawFractal(level - 1, xD, yD, xB, yB, g);
		}
	}
	
	// comeca a desenhar o fractal
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// desenha o padrao de fractal
		g.setColor(color);
		drawFractal(level, 100, 90, 290, 200, g);
	}
	
	// configura a cor de desenho como c
	public void setColor(Color c)
	{
		color = c;
	}
	
	// configura o novo nivel de recursao
	public void setLevel(int currentLevel)
	{
		level = currentLevel;
	}
	
	// retorna o nivel de recursao
	public int getLevel()
	{
		return level;
	}
} // fim da classe FractalJPanel
