// Figura 12.41: BorderLayoutFrame.java
// BorderLayout contendo cinco botoes

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener 
{

	private final JButton[] buttons; // array de botoes para ocultar partes
	private static final String[] names = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
	private final BorderLayout layout;
	
	// configura GUI e tratamento de evento
	public BorderLayoutFrame()
	{
		super("BorderLayout Demo");
		
		layout = new BorderLayout(5, 5); // espacos de 5 pixels
		setLayout(layout);
		buttons = new JButton[names.length];
		
		// cria JButtons e registra ouvintes para eles
		for(int count = 0; count < names.length; count ++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
		}
		
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);
	}
	
	// trata os eventos de botao
	@Override
	public void actionPerformed(ActionEvent event)
	{
		// verifica a origem de evento e o painel de conteudo de layout de acordo
		for(JButton button : buttons)
		{
			if(event.getSource() == button)
				button.setVisible(false); // oculta o botao que foi clicado
			else
				button.setVisible(true); // mostra outros botoes
		}
		
		layout.layoutContainer(getContentPane()); // define o layout do painel de conteudo
	}
} // fim da classe BorderLayoutFrame
