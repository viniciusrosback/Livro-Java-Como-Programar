// Figura 9.13: LabelDemo.java
// Demonstra o uso de rotulos

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo 
{

	public static void main(String[] args) 
	{
	
		// Cria um rotulo com texto simples
		JLabel northLabel = new JLabel("North");
		
		// cria um icone de uma imagem para podermos colocar em um JLabel
		ImageIcon labelIcon = new ImageIcon("GUItip.gif");
		
		// cria um rotulo com um Icon em vez de texto
		JLabel centerLabel = new JLabel(labelIcon);
		
		// cria um rotulo com um Icon
		JLabel southLabel = new JLabel(labelIcon);
		
		// configura o rotulo para exibir texto (bem como um icone)
		southLabel.setText("South");
		
		// cria um quadro para armazenar os rotulos
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// adiciona os rotulos ao frame; o segundo argumento especifica
		// onde adicionar o rotulo no fframe
		
		application.add(northLabel, BorderLayout.NORTH);
		application.add(centerLabel, BorderLayout.CENTER);
		application.add(southLabel, BorderLayout.SOUTH);
		
		application.setSize(300, 300);
		application.setVisible(true);
	} // fim de main
} // fim da classe LabelDemo
