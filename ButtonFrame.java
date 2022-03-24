// Figura 12.15: ButtonFrame.java
// Botoes de comando e eventos de acao

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{

	private final JButton plainButton; // botao apenas com texto
	private final JButton fancyJButton; // botao com icones
	
	// ButtonFrame adiciona JButtons ao JFrame
	public ButtonFrame()
	{
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Plain Button"); // botao com texto
		add(plainJButton); // adiciona plainJButton ao JFrame
		
		Icon bug1 = new ImageIcon(getClass().getRessource("bug1.gif"));
		Icon bug2 = new ImageIcon(getClass().getRessource("bug2.gif"));
		fancyJButton = new JButton("Fancy Button", bug1); // configura imagem
		fancyJButton.setRolloverIcon(bug2); // configura imagem de rollover
		add(fancyJButton); // adiciona fancyJButton ao JFrame
		
		// cria novo ButtonHandler de tratamento para tratamento de evento de botao
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	}
	
	// classe interna para tratamento de evento de botao
	private class ButtonHandler implements ActionListener
	{
		// trata evento de botao
		@Override
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
		}
	}
} // fim da classe ButtonFrame
