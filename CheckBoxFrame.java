// Figura 12.17: CheckBoxFrame.java
// JCheckBoxes e eventos de item

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{

	private final JTextField textField; // exibe o texto na alteracao de fontes
	private final JCheckBox boldJCheckBox; // para marcar/desmarcar estilo negrito
	private final JCheckBox italicJCheckBox; // para marcar/desmarcar estilo italico
	
	// construtor CheckBoxFrame adiciona JCheckBoxes ao JFrame
	public CheckBoxFrame()
	{
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		// configura JTextField e sua fonte
		textField = new JTextField("Watch the font style change", 20);
		add(textField); // adiciona textField ao JFrame
		
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox); // adiciona caixa de selecao de estilo negrito ao JFrame
		add(italicJCheckBox); // adiciona caixa de selecao de italico ao JFrame
		
		// listeners registradores para JCheckBoxes
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italicJCheckBox.addItemListener(handler);
	}
	
	// classe interna private para tratamento de evento ItemListener
	private class CheckBoxHandler implements ItemListener
	{
		// responde aos eventos de caixa de selecao
		@Override
		public void itemStateChanged(ItemEvent event)
		{
			Font font = null; // armazena a nova Font
			
			// determina quais CheckBoxes estao marcadas e cria Font
			if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if(boldJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if(italicJCheckBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			textField.setFont(font);
		}
	}
} // fim da classe CheckBoxFrame
