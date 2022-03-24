// Figura 12.19: RadioButtonFrame.java
// Criando botoes de opcao utilizando ButtonGroup e JRadioButotn

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{

	private final JTextField textField; // utilizando para exibir alteracoes de fonte
	private final Font plainFont; // fonte para texto simples
	private final Font boldFont; // fonte para texto em negrito
	private final Font italicFont; // fonte para texto em italico
	private final Font boldItalicFont; // fonte para texto em negrito e italico
	private final JRadioButton plainJRadioButton; // seleciona texto simples
	private final JRadioButton boldRadioButton; // seleciona texto em negrito
	private final JRadioButton italicJRadioButton; // seleciona texto em italico
	private final JRadioButton boldItalicJRadioButton; // negrito e italico
	private final ButtonGroup radioGroup; // contem botoes de opcao
	
	// construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
	public RadioButtonFrame()
	{
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 25);
		add(textField); // adiciona textField ao JFrame
		
		// cria botoes de opcao
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
		add(plainJRadioButton); // adiciona botao no estilo simples ao JFrame
		add(boldJRadioButton); // adiciona botao de negrito ao JFrame
		add(italicJRadioButton); // adiciona botao de italico ao JFrame
		add(boldItalicJRadioButton); // adiciona botao de negrito e italico
		
		// cria relacionamento logico entre JRadioButtons
		radioGroup = new ButtonGroup(); // cria ButtonGroup
		radioGroup.add(plainJRadioButton); // adiciona texto simples ao grupo
		radioGroup.add(boldJRadioButton); // adiciona negrito ao grupo
		radioGroup.add(italicJRadioButton); // adiciona italico ao grupo
		radioGroup.add(boldItalicRadioButton); // adiciona negrito e italico
		
		// cria fonte objetos
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		// registra eventos para JRadioButtons
		plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
	}
	
	// classe interna private para tratar eventos de botao de opcao
	private class RadioButtonHandler implements ItemListener
	{
		private Font font; // fonte associada com esse listener
		
		public RadioButtonHandler(Font f)
		{
			font = f;
		}
		
		// trata eventos de botao de opcao
		@Override
		public void itemStateChanged(ItemEvent event)
		{
			textField.setFont(font);
		}
		
	}
} // fim da classe RadioButtonFrame
