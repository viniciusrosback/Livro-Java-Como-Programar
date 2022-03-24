// Figura 22.23: GridBagFrame2.java
// Demonstrando as constantes GridBagLayout

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class GridBagFrame2 extends JFrame
{

	private final GridBagLayout layout; // layout desse frame
	private final GridBagConstraints constraints; // restricoes de layout
	
	// configura a GUI
	public GridBagFrame2()
	{
		super("GridBagLayout");
		layout = new GridBagLayout();
		setLayout(layout); // configura o layout de frame
		constraints = new GridBagConstraints(); // instancia restricoes
		
		// cria componentes GUI
		String[] metals = {"Copper", "Aluminium", "Silver"};
		JComboBox comboBox = new JComboBox(metals);
		
		JTextField textField = new JTextField("TextField");
		
		String[] fonts = {"Serif", "Monospaced"};
		JList list = new JList(fonts);
		
		String[] names = {"zero", "one", "two", "three", "four"};
		JButton[] buttons = new JButton[names.length];
		
		for(int count = 0; count < buttons.length; count ++)
			buttons[count] = new JButton(names[count]);
		
		// define restricoes dos componentes GUI para textField
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(textField);
		
		// buttons[0] -- weightx e weighty sao 1: fill e BOTH
		constraints.gridwidth = 1;
		addComponent(buttons[0]);
		
		// buttons[1] -- weightx e weighty sao 1: fill e BOTH
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		addComponent(buttons[1]);
		
		// buttons[2] -- weightx e weighty sao 1: fill e BOTH
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(buttons[2]);
		
		// comboBox -- weightx e 1: fill e BOTH
		constraints.weighty = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(comboBox);
		
		// buttons[3] -- weightx e 1: fill e BOTH
		constraints.weighty = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(buttons[3]);
		
		// buttons [4] -- weightx e weighty sao 1: fill e BOTH
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		addComponent(buttons[4]);
		
		// list -- weightx weighty sao 1: fill e BOTH
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(list);
	} // fim do construtor GridBagFrame2
	
	// adiciona um componente ao conteiner
	private void addComponent(Component, constraints)
	{
		layout.setConstraints(component, constraints);
		add(component); // adiciona componente
	}
} // fim da classe GridBagFrame2
