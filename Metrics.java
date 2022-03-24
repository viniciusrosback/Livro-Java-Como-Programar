// Figura 13.16: Metrics.java
// Exibindo a metrica de Fonte

import javax.swing.JFrame;

public class Metrics 
{

	// executa o aplicativo
	public static void main(String[] args) {
		// cria o frame para MetricsJPanel
		JFrame frame = new JFrame("Demonstrating FontMetrics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MetricsJPanel metricsJPanel = new MetricsJPanel();
		frame.add(metricsJPanel);
		frame.setSize(510, 240);
		frame.setVisible(true);
	}
} // fim da classe Metrics
