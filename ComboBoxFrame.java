// Figura 12.21: ComboBoxFrame.java
// JComboBox que exibe uma lista de nomes de imagem

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{

	private final JComboBox<String> imagesJComboBox; // contem nomes de icones
	private final JLabel label; // exibe o icone selecionado
	
	private static final String[] names = {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
	private final Icon[] icons = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3]))};
	
	// construtor ComboBoxFrame adiciona JComboBox ao JFrame
	public ComboBoxFrame()
	{
		super("Testing JComboBox");
		setLayout(new FlowLayout()); // configura o layout de frame
		
		imagesJComboBox = new JComboBox<String>(names); // configura JComboBox
		imagesJComboBox.setMaximumRowCount(3); // exibe tres linhas
		
		imagesJComboBox.addItemListener(
				new ItemListener() // classe interna anonima
				{
					// trata evento JComboBox
					@Override
					public void itemStateChanged(itemEvent event)
					{
						// determina se o item esta selecionado
						if(event.getStateChange() == ItemEvent.SELECTED)
							label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
					}
					
				} // fim da classe interna anonima
			); // fim da chamada para addItemListener
		
		add(imagesJComboBox); // adiciona caixa de combinacao ao JFrame
		label = new JLabel(icons[0]); // exibe primeiro icone
		add(label); // adiciona rotulo ao JFrame
	}
	
} // fim da classe ComboBoxFrame
