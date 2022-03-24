// Figura 22.5: MenuFrame.java
// Demonstrando menus

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

public class MenuFrame extends JFrame
{

	private final Color[] colorValues = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
	private final JRadioButtonMenuItem[] colorItems; // itens do menu Color
	private final JRadioButtonMenuItem[] fonts; // itens do menu Font
	private final JCheckBoxMenuItem[] styleItems; // itens do menu Font Style
	private final JLabel displayJLabel; // exibe texto de exemplo
	private final ButtonGroup fontButtonGroup; // gerencia itens do menu Font
	private final ButtonGroup colorButtonGroup; // gerencia itens do menu Color
	private int style; // utilizado para criar estilos de fontes
	
	// construtor sem argumento para configurar a GUI
	public MenuFrame()
	{
		super("Using JMenus");
		
		JMenu fileMenu = new JMenu("File"); // cria o menu File
		fileMenu.setMnemonic('F'); // configura o mnemonico como F
		
		// cria item de menu About...
		JMenuItem aboutItem = new JMenuItem("About ...");
		aboutItem.setMnemonic('A'); // configura o mnemonico com A
		fileMenu.add(aboutItem); // adiciona o item about ao menu File
		aboutItem.addActionListener(
				new ActionListener() // classe interna anonima
				{
					// exibe um dialogo de mensagem quando o usuario seleciona About...
					@Override
					public void actionPerformed(ActionEvent event)
					{
						JOptionPane.showMessageDialog(MenuFrame.this, "This is an example\nof using menus", "About", JOptionPane.PLAIN_MESSAGE);
					}
				}
			);
		
			JMenuItem exitItem = new JMenuItem("Exit"); // cria o item exit
			exitItem.setMnemonic('x'); // configura o mnemonico como x
			fileMenu.add(exitItem); // adiciona o item exit ao menu File
			exitItem.addActionListener(
					new ActionListener() // classe interna anonima
					{
						// termina o aplicativo quando o usuario clica exitItem
						@Override
						public void actionPerformed(ActionEvent event)
						{
							System.exit(0); // encerra o aplicativo
						}
					}
					
				);
				JMenuBar bar = new JMenuBar(); // cria a barra de menus
				setJMenuBar(bar); // adiciona uma barra de menus ao aplicativo
				bar.add(fileMenu); // adiciona o menu File a barra de menus
				
				JMenu formatMenu = new JMenu("Format"); // cria o menu Format
				formatMenu.setMnemonic('r'); // configura o mnemonico como r
				
				// array listando cores de string
				String[] colors = {"Black", "Blue", "Red", "Green"};
				
				JMenu colorMenu = new JMenu("Color"); // cria o menu Color
				colorMenu.setMnemonic('C'); // configura o mnemonico como C
				
				// cria itens de menu de botao de radio para cores
				colorItems = new JRadioButtonMenuItem[colors.length];
				colorButtonGroup = new ButtonGroup(); // gerencia cores
				ItemHandler itemHandler = new ItemHandler(); // rotina de tratamento para cores
				
				// cria itens do menu Color com botoes de opcao
				for(int count = 0; count < colors.length; count ++)
				{
					colorItems[count] =
							new JRadioButtonMenuItem(colors[count]); // cria o item
					colorMenu.add(colorItems[count]); // adiciona o item ao menu Color
					colorButtonGroup.add(colorItems[count]); // adiciona ao grupo
					colorItems[count].addActionListener(itemHandler);
				}
				
				colorItems[0].setSelected(true); // seleciona o primeiro item Color
				
				formatMenu.add(colorMenu); // adiciona o menu Color ao menu Format
				formatMenu.addSeparator(); // adiciona um separador no menu
				
				// array listando nomes de fonte
				String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
				
				JMenu.setMnemonic('n'); // configura o mnemonico como n
				
				// cria itens do menu radio button para nomes de fonte
				fonts = new JRadioButtonMenuItem[fontNames.length];
				fontButtonGroup = new ButtonGroup(); // gerencia os nomes das fontes
				
				// criar itens do menu Font com botoes de opcao
				for(int count = 0; count < fonts.length; count ++)
				{
					fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
					fontMenu.add(fonts[count]); // adiciona fonte ao menu Font
					fontButtonGroup.add(fonts[count]); // adiciona ao grupo de botoes
					fonts[count].addActionListener(itemHandler); // adiciona rotina de tratamento
				}
				
				fonts[0].setSelected(true); // seleciona o primeiro item do menu Font
				fontMenu.addSeparator(); // adiciona uma barra separadora ao menu Font
				
				String[] styleNames = {"Bold", "Italic"}; // nomes dos estilos
				StyleItems = new JCheckBoxMenuItem[styleNames.length];
				StyleHandler styleHandler = new Stylehandler(); // rotina de tratamento de estilo
				
				// cria itens do menu Style com caixas de selecao
				for(int count = 0; count < styleNames.length; count ++)
				{
					styleItems[count] =
							new JCheckBoxMenuItem(styleNames[count]); // para estilo
					fontMenu.add(styleItems[count]); // adiciona ao menu Font
					styleItems[count].addItemListener(styleHandler); // rotina de tratamento
				}
				
				formatMenu.add(fontMenu); // adiciona o menu Font ao menu Format
				bar.add(formatMenu); // adiciona o menu Format a barra de menus
				
				// configura o rotulo para exibir texto
				displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
				displayJLabel.setForeground(colorValues[0]);
				displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));
				
				getContentPane().setBackground(Color.CYAN); // configura o fundo
				add(displayJLabel, BorderLayout.CENTER); // adiciona displayJLabel
	} // fim do construtor de MenuFrame
	
	// classe interna para tratar eventos de acao dos itens de menu
	private class ItemHandler implements ActionListener
	{
		// processa selecoes de cor e fonte
		@Override
		public void actionPerformed(ActionEvent event)
		{
			
			// processa a selecao de cor
			for(int count = 0; count < colorItems.length; count ++)
			{
				if(colorItems[count].isSelected())
				{
					displayJLabel.setForeground(colorValues[count]);
					break;
				}
			}
			
			// processa a selecao de fonte
			for(int count = 0; count < fonts.length; count ++)
			{
				if(event.getSource() == fonts[count])
				{
					displayJLabel.setFont(new Font(fonts[count].getText(), style, 72));
				}
			}
			
			repaint(); // redesenha o aplicativo
		}
	} // fim da classe ItemHandler
	
	
	// classe interna para tratar eventos de itens dos itens de menu da caixa de verificacao
	private class StyleHandler implements ItemListener
	{
		// processa selecoes de estilo da fonte
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			String name = displayJLabel.getFont().getName(); // fonte atual
			Font font; // nova fonte com base nas selecoes pelo usuario
			
			// determina quais itens estao marcados e cria Font
			if(styleItems[0].isSelected() &&
					styleItems[1].isSelected())
				font = new Font(name, Font.BOLD + Font.ITALIC, 72);
			else if(styleItems[0].isSelected())
				font = new Font(name, Font.BOLD, 72);
			else if(styleItems[1].isSelected())
				font = new Font(name, Font.ITALIC, 72);
			else
				font = new Font(name, Font.PLAIN, 72);
			
			displayJLabel.setFont(font);
			repaint(); // redesenha o aplicativo
		}
	}
} // fim da classe MenuFrame
