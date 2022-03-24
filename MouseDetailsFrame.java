// Figura 12.31: MouseDetailsFrame.java
// Demonstrando cliques de mouse e distinguindo entre botoes do mouse

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame
{

	private String details; // String exibida na statusBar
	private final JLabel statusBar; // JLabel na parte inferior da janela
	
	// construtor configura String de barra de titulo e registra o listener de mouse
	public MouseDetailsFrame()
	{
		super("Mouse clicks and buttons");
		
		statusBar = new JLabel("Click the mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler()); // adiciona tratamento de evento
	}
	
	// classe interna para tratar eventos de mouse
	private class MouseClickHandler extends MouseAdapter
	{
		// trata evento de clique de mouse e determina qual botao foi pressionado
		@Override
		public void mouseClicked(MouseEvent event)
		{
			int xPos = event.getX(); // obtem a posicao x do mouse
			int yPos = event.getY(); // obtem a posicao y do mouse
			
			details = String.format("Cklicked %d time(s)", event.getClickCount());
			
			if(event.isMetaDown()) // botao direito do mouse
				details += " with right mouse button";
			else if(event.isAltDown()) // bota do meio do mouse
				details += " with left mouse button";
			else // botao esquerdo do mouse
				details += " with left mouse button";
			
			statusBar.setText(details); // exibe mensagem em statusBar
		}
	}
} // fim da classe MouseDetailsFrame
