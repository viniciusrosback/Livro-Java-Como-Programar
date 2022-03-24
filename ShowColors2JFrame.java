// Figura 13.7: ShowColors2JFrame.java
// Escolhendo cores com JColorChooser

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame
{

	private final JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private final JPanel colorJPanel;
	
	// configura a GUI
	public ShowColors2JFrame()
	{
		super("Using JColorChooser");
		
		// cria JPanel para exibir as cores
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		
		// configura changeColorJButton e registra sua rotina de tratamento
		changeColorJButton = new JButton("Change Color");
		changeColorJButton.addActionListener(
				new ActionListener()
				// classe interna anonima
				{
					// exibe JColorChooser quando o usuario clica no botao
					@Override
					public void actionPerformed(ActionEvent event)
					{
						color = JColorChooser.showDialog(ShowColors2JFrame.this, "Chooser a color", color);
						
						// configur a cor padrao, se nenhuma cor for retornada
						if(color == null)
								color = Color.LIGHT_GRAY;
						
						// muda a cor de fundo do painel de conteudo
						colorJPanel.setBackground(color);
					} // fim do metodo actionPerformed
				} // fim da classe interna anonima
			); // fim da chamada para addActionListener
						
			add(colorJPanel, BorderLayout.CENTER);
			add(changeColorJButton, BorderLayout.SOUTH);
			
			setSize(400, 130);
			setVisible(true);
	} // fim do construtor ShowColor2JFrame
} // fim da classe ShowColors2JFrame
