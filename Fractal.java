// Figura 18.18: Fractal.java
// Interface com o usuario do fractal

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

public class Fractal extends JFrame
{

	private static final int WIDTH = 400; // define a largura de GUI
	private static final int HEIGHT = 480; // defina a altura de GUI
	private static final int MIN_LEVEL = 0;
	private static final int MAX_LEVEL = 15;
	
	// configura a GUI
	public Fractal()
	{
		super("Fractal");
		
		// configura levelJLabel para adicionar ao controlJPanel
		final JLabel levelJLabel = new JLabel("Level: 0");
		
		final FractalJPanel drawSpace = new FractalJPanel(0);
		
		// configura o painel de controle
		final JPanel controlJPanel = new JPanel();
		controlJPanel.setLayout(new FlowLayout());
		
		// configura o botao de cor e registra o ouvinte
		final JButton changeColorJButton = new JButton("Color");
		controlJPanel.add(changeColorJButton);
		changeColorJButton.addActionListener(
				new ActionListener() // classe interna anonima
				{
					// processa o evento changeColorJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						Color color = JColorChooser.showDialog(Fractal.this, "Choose a color", Color.BLUE);
						
						// configura a cor padrao, se nenhuma cor for retornada
						if(color == null)
							color = Color.BLUE;
						
						drawSpace.setColor(color);
					}
				} // fim da classe interna anonima
			); // fim de addActionListener
		
			// configura o botao decrease level para adicionar painel de controle e
			// ouvinte registrado
		
			final JButton decreaseLevelJButton = new JButton("Decrease Level");
			controlJPanel.add(decreaseLevelJButton);
			decreaseLevelJButton.addActionListener(
					new ActionListener() // classe interna anonima
					{
						// processa o evento decreaseLevelJButton
						@Override
						public void actionPerformed(ActionEvent event)
						{
							int level = drawSpace.getLevel();
							-- level;
								
							// modifica o nivel se possivel
							if((level >= MIN_LEVEL) && (level <= MAX_LEVEL))
							{
								levelJLabel.setText("Level: " + level);
								drawSpace.setLevel(level);
								repaint();
							}
						}
					}// fim da classe interna anonima
				); // fim de addActionListener
					
				// configura o botao increase level para adicionar painel de controle
				// e registra o ouvinte
				final JButton increaseLevelJButton = new JButton("Increase Level");
				controlJPanel.add(increaseLevelJButton);
				increaseLevelJButton.addActionListener(
						new ActionListener() // classe interna anonima
						{
							// processa evento increaseLevelJButton
							@Override
							public void actionPerformed(ActionEvent event)
							{
								int level = drawSpace.getLevel();
								++ level;
								
								// modifica o nivel se possivel
								if((level >= MIN_LEVEL) && (level <= MAX_LEVEL))
								{
									levelJLabel.setText("Level: " + level);
									drawSpace.setLevel(level);
									repaint();
								}
							}
						} // fim da classe interna anonima
					); // fim de addActionListener
					
					controlJPanel.add(levelJLabel);
					
					// cria mainJPanel para conter controlJPanel e drawSpace
					final JPanel mainJPanel = new JPanel();
					mainJPanel.add(controlJPanel);
					mainJPanel.add(drawSpace);
					
					add(mainJPanel); // adiciona JPanel ao JFrame
					setSize(WIDTH, HEIGHT); // configura o tamanho de JFrame
					setVisible(true); // exibe JFrame
				} // fim do construtor Fractal
				
				public static void main(String[] args)
				{
					Fractal demo = new Fractal();
					demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
	
}
