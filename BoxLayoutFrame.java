// Figura 22.16: BoxLayoutFrame.java
// Demonstrando BoxLayout

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BoxLayoutFrame extends JFrame
{

	// configura a GUI
	public BoxLayoutFrame()
	{
		super("Demonstrating BoxLayout");
		
		// cria conteineres Box com BoxLayout
		Box horizontal1 = Box.createHorizontalBox();
		Box vertical1 = Box.createVerticalBox();
		Box horizontal2 = Box.createHorizontalBox();
		Box vertical2 = Box.createVerticalBox();
		
		final int SIZE = 3; // numero de botoes em cada Box
		
		// adiciona botoes a Box horizontal
		for(int count = 0; count < SIZE; count ++)
			horizontal1.add(new JButton("Button " + count));
		
		// cria um suporte e adiciona botoes a Box vertical1
		for(int count = 0; count < SIZE; count ++)
		{
			vertical1.add(Box.createVerticalStrut(25));
			vertical1.add(new JButton("Button " + count));
		}
		
		// cria a cola horizontal e adiciona botoes a Box horizontal2
		for(int count = 0; count < SIZE; count ++)
		{
			horizontal2.add(Box.createHorizontalGlue());
			horizontal2.add(new JButton("Button " + count));
		}
		
		// cria uma area rigida e adiciona botoes a Box vertical2
		for(int count = 0; count < SIZE; count ++)
		{
			vertical2.add(Box.createRigidArea(new Dimension(12, 8)));
			vertical2.add(new JButton("Button " + count));
		}
		
		// cria vertical e adiciona botoes ao painel
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		for(int count = 0; count < SIZE; count ++)
		{
			panel.add(Box.createGlue());
			panel.add(new JButton("Button " + count));
		}
		
		// cria um JTabbedPane
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		
		// coloca cada conteiner no painel com guias
		tabs.addTab("Horizontal Box", horizontal1);
		tabs.addTab("Vertical Box with Struts", vertical1);
		tabs.addTab("Horizontal Box with Glue", horizontal2);
		tabs.addTab("Vertical Box with Rigid Areas", vertical2);
		tabs.addTab("Vertical Box with Glue", panel);
		
		add(tabs); // coloca o painel com guias no frame
	} // fim do construtor BoxLayoutFrame
} // fim da classe BoxLayoutFrame
