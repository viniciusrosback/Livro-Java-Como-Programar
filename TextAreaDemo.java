// Figura 12.48: TextAreaDemo.java
// testando TextAreaFrame

import javax.swing.JFrame;

public class TextAreaDemo 
{

	public static void main(String[] args) 
	{
	
		TextAreaFrame textAreaFrame = new TextAreaFrame();
		textAreaFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		textAreaFrame.setSize(425, 200);
		textAreaFrame.setVisible(true);
	}
} // fim da classe TextAreaDemo
