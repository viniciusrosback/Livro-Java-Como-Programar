// Figura 12.29: MouseTrackerFrame.java
// Testando MouseTrackerFrame

import javax.swing.JFrame;

public class MouseTracker
{
	public static void main(String[] args) 
	{
	
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseTrackerFrame.setSize(300, 100);
		mouseTrackerFrame.setVisible(true);
	}
} // fim da classe MouseTracker


// Figura 12.28: MousetrackerFrame.java
// Tratamento de evento de mouse

//import java.awt.Color;
//import java.awt.BorderLayout;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//import java.awt.event.MouseEvent;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;

//public class MouseTrackerFrame extends JFrame
//{

	//private final JPanel mousePanel; // painel em que os eventos de mouse ocorrem
	//private final JLabel statusBar; // exibe informacoes do evento
	
	// construtor MouseTrackerFrame configura GUI e
	// registra rotinas de tratamento de evento de mouse
	//public MouseTrackerFrame()
	//{
		//super("Demonstrating Mouse Events");
		
		//mousePanel = new JPanel();
		//mousePanel.setBackground(Color.WHITE);
		//add(statusBar, BorderLayout.SOUTH); // adiciona rotulo ao JFrame
		
		//statusBar = new JLabel("Mouse outside JPanel");
		//add(statusBar, BorderLayout.SOUTH); // adiciona rotulo ao JFrame
		
		// cria e registra listener para mouse e eventos de movimento de mouse
		//MouseHandler handler = new MouseHandler();
		//mousePanel.addMouseListener(handler);
		//mousePanel.addMouseMotionListener(handler);
	//}
	
	//private class MouseHandler implements MouseListener, MouseMotionListener
	//{
		// rotinas de tratamento de evento MouseListener
		// trata evento quando o mouse e liberado imediatamente depois de ter sido pressionado
		//@Override
		//public void mouseClicked(MouseEvent event)
		//{
			//statusBar.setText(String.format("Clicked at [%d, %d]", event.getX(), event.getY()));
		//}
		
		
		// trata o evento quando o mouse e pressionado
		//@Override
		//public void mousePressed(MouseEvent event)
		//{
			//statusBar.setText(String.format("Pressed at [%d, %d]", event.getX(), event.getY()));
		//}
		
		// trata o evento quando o mouse e liberado
		//@Override
		//public void mouseReleased(MouseEvent event)
		//{
			
			//statusBar.setText(String.format("Released at [%d, %d]", event.getX(), event.getY()));
		//}
			
		// trata evento quando mouse entra na area
		//@Override
		//public void mouseEntered(MouseEvent event)
		//{
			//statusBar.setText(String.format("Mouse entered at [%d, %d]", event.getX(), event.getY()));
			//mousePanel.setBackground(Color.GREEN);
		//}
		
		// trata evento quando mouse sai na area
		//@Override
		//public void mouseMoved(MouseEvent event)
		//{
			//statusBar.setText(String.format("Moved at [%d, %d]", event.getX(), event.getY()));
		//}
	//} // fim da classe interna MouseHandler
//} // fim da classe MouseTrackerFrame
