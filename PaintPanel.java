// Figura 12.34: PaintPanel.java
// Classe de adaptadores utilizada para implementar rotinas de tratamento de evento

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel
{

	// lista das referencias Point
	private final ArrayList<Point> points = new ArrayList<>();
	public PaintPanel()
	{
		// trata evento de movimento de mouse do frame
		addMouseMotionListener(
				new MouseMotionAdapter() // classe interna anonima
				{
					// armazena coordenadas da acao de arrastar e repinta
					@Override
					public void mouseDragged(MouseEvent event)
					{
						points.add(event.getPoint());
						repaint(); // repinta JFrame
					}
				}
			);
	}
	
	// desenha ovais em um quadro delimitador de 4 x 4 nas localizacoes especificadas
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); // limpa a area de desenho
		
		// desenha todos os pontos
		for(Point point : points)
			g.fillOval(point.x, point.y, 4, 4);
	}
} // fim da classe PaintPanel
