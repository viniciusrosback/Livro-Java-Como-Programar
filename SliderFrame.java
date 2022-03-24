// Figura 22.3: SliderFrame.java
// Utilizando JSliders para dimensionar um oval

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame
{

	private final JSlider diameterJSlider; // slider para selecionar o diametro
	private final OvalPanel myPanel; // painel para desenhar um circulo
	
	// construtor sem argumento
	public SliderFrame()
	{
		super("Slider Demo");
		
		myPanel = new OvalPanel(); // cria o painel para desenhar um circulo
		myPanel.setBackground(Color.YELLOW);
		
		// configura o JSlider para controlar o valor do diametro
		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		diameterJSlider.setMajorTickSpacing(10); // cria uma marca de medida a cada 10
		diameterJSlider.setPaintTicks(true); // pinta as marcas de medida no slider
		
		// registra o ouvinte de evento do JSlider
		diameterJSlider.addChangeListener(
				new ChangeListener() // classe interna anonima
				{
					@Override
					public void stateChanged(ChangeEvent e)
					{
						myPanel.setDiameter(diameterJSlider.getValue());
					}
				}
		);
		
		add(diameterJSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
} // fim da classe SliderFrame
