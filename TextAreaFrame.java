// Figura 12.47: TextAreaFrame.java
// Copiando texto selecionado de uma area de JText para outra

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame
{

	private final JTextArea textArea1; // exibe a string demo
	private final JTextArea textArea2; // texto destacado e copiado aqui
	private final JButton copyJButton; // comeca a copiar o texto
	
	// construtor sem argumento
	public TextAreaFrame()
	{
		super("TextArea Demo");
		Box box = Box.createHorizontalBox(); // cria box
		String demo = "This is a demo string to \n" + "another textarea using an\nexternal event\n";
		
		textArea1 = new JTextArea(demo, 10, 15);
		box.add(new JScrollPane(textArea1)); // adiciona scrollpane
		
		copyJButton = new JButton("Copy >>>"); // cria botao de copia
		box.add(copyJButton); // adiciona o botao de copia a box
		copyJButton.addActionListener(
				new ActionListener() // classe interna anonima
				{
					// configura texto em textArea2 como texto selecionado de textArea1
					@Override
					public void actionPerformed(ActionEvent event)
					{
						textArea2.setText(textArea1.getSelectedText());
					}
				}
			);
		textArea2 = new JTextArea(10, 15);
		textArea2.setEditable(false);
		box.add(new JScrollPane(textArea2)); // adiciona scrollpane
		
		add(box); // adiciona box ao Frame
	}
	
} // fim da classe TextAreaFrame
