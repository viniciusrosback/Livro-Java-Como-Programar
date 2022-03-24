// Figura 13.12: Fonts.java
// Utilizando fontes

import javax.swing.JFrame;

public class Fonts {
	
	// executa o aplicativo
	public static void main(String[] args) {
		
		// cria frame para FontJPanel
		JFrame frame = new JFrame("Using fonts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontJPanel fontJPanel = new FontJPanel();
		frame.add(fontJPanel);
		frame.setSize(420, 150);
		frame.setVisible(true);
	}
} // fim da classe Fonts
