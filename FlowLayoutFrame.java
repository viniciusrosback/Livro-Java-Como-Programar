// Figura 12.39:
// FlowLayout permite que os componentes fluam ao longo de multiplas linhas

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{

	private final JButton leftJButton; // botao para configurar alinhamento a esquerda
	private final JButton centerJButton; // botao para configurar alinhamento centralizado
	private final JButton rightJButton; // botao para configurar alinhamento a direita
	private final FlowLayout layout; // objeto de layout
	private final Container container; // conteiner para configurar layout
	
	// configura GUI e registra listeners de botao
	public FlowLayoutFrame()
	{
		super("FlowLayout Demo");
		
		layout = new FlowLayout();
		container = getContentPane(); // obtem conteiner para layout
		setLayout(layout);
		
		// configura leftJButton e registra listener
		leftJButton = new JButton("Left");
		add(leftJButton); // adiciona o botao Left ao frame
		leftJButton.addActionListener(
				new ActionListener() // classe interna anonima
				{
					// processa o evento leftJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.LEFT);
						
						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				}
			);
		
		// configura centerJButton e registra o listener
		centerJButton = new JButton("Center");
		add(centerJButton); // adiciona botao Center ao frame
		centerJButton.addActionListener(
				new ActionListener() // classe interna anonima
				{
					// processa evento centerJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.CENTER);
						
						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				}
			);
		// configura rightJButton e registra o listener
		rightJButton = new JButton("Right");
		add(rightJButton); // adiciona botao Right ao frame
		rightJButton.addActionListener(
				new ActionListener() // classe interna anonima
				{
					// processa evento rightJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.RIGHT);
						
						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				}
			);
	} // fim do construtor FlowLayoutFrame
} // fim da classe FlowLayoutFrame
