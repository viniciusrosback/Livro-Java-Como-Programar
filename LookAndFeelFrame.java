// Figura 22.9: LookAndFeelFrame.java
// Alterando a aparencia e o comportamento

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class LookAndFeelFrame extends JFrame{

	
	private final UIManager.LookAndFeelInfo[] looks;
	private final String[] lookNames; // nomes da aparencia e do comportamento
	private final JRadioButton[] radio; // para selecionar a aparencia e o comportamento
	private final ButtonGroup group; // grupo para botoes de radio
	private final JButton button; // exibe a aparencia do botao
	private final JLabel label; // exibe a aparencia do rotulo
	private final JComboBox<String> comboBox; // exibe a aparencia da caixa de combinacao
	
	// configura a GUI
	public LookAndFeelFrame()
	{
		super("Look and Feel Demo");
		
		// obtem as informacoes sobre a aparencia e comportamento instaladas
		looks = UIManager.getInstalledLookAndFeels();
		lookNames = new String[looks.length];
		
		// obtem os nomes das aparencias e comportamentos instalados
		for(int i = 0; i < looks.length; i ++)
			lookNames[i] = looks[i].getName();
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(3, 1, 0, 5));
		
		label = new JLabel("This is a " + lookNames[0] + " look-and-feel", SwingConstants.CENTER);
		northPanel.add(label);
		
		button = new JButton("JButton");
		northPanel.add(button);
		
		comboBox = new JComboBox<String>(lookNames);
		northPanel.add(comboBox);
		
		// cria um array para botoes de opcao
		radio = new JRadioButton[looks.length];
		
		JPanel southPanel = new JPanel();
		
		// usa um GridLayout com tres botoes em cada linha
		int rows = (int) Math.ceil(radio.length / 3.0);
		southPanel.setLayout(new GridLayout(rows, 3));
		
		group = new ButtonGroup(); // grupo de botoes para aparencias e comportamentos
		ItemHandler handler = new ItemHandler(); // rotina de tratamento de aparencia e comportamento
		
		for(int count = 0; count <radio.length; count ++) 
		{
			radio[count] = new JRadioButton(lookNames[count]);
			radio[count].addItemListener(handler); // adiciona rotina de tratamento
			group.add(radio[count]); // adiciona botao de opcoes ao grupo
			southPanel.add(radio[count]); // adiciona bota de opcoes ao painel
		}
		
		add(northPanel, BorderLayout.NORTH); // adiciona o painel North
		add(southPanel, BorderLayout.SOUTH); // adiciona o painel South
		
		radio[0].setSelected(true); // configura a selecao padrao
	} // fim do construtor LookAndFeelFrame
	
	// utiliza UIManager para alterar a aparencia e comportamento da GUI
	private void changeTheLookAndFeel(int value)
	{
		try // muda a aparencia e comportamento
		{
			// configura a aparencia e comportamento para esse aplicativo
			UIManager.setLookAndFeel(looks[value].getClassName());
			
			// atualiza os componentes nesse aplicativo
			SwingUtilities.updateComponentTreeUI(this);
		}
		
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	// classe interna private para tratar eventos de botao de opcao
	private class ItemHandler implements ItemListener
	{
		// processa a selecao de aparencia e comportamento feita pelo usuario
		@Override
		public void itemStateChanged(ItemEvent event)
		{
			for(int count = 0; count < radio.length; count ++)
			{
				if(radio[count].isSelected())
				{
					label.setText(String.format(
							"This is a %s look-and-feel", lookNames[count]));
					comboBox.setSelectedIndex(count); // configura o indice da caixa de comnbinacao
					changeTheLookAndFeel(count); // muda a aparencia e comportamento
				}
			}
		}
	} // fim da classe interna privada ItemHandler
} // fim da classe LookAndFeelFrame
