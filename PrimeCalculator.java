// Figura 23.26: PrimeCalculator.java
// Calcula os primeiros n numeros primos, exibindo-os a medida que os encontra

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingWorker;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class PrimeCalculator extends SwingWorker<Integer, Integer>
{

	private static final SecureRandom generator = new SecureRandom();
	private final JTextArea intermediateJTextArea; // exibe os numeros primos encontrados
	private final JButton getPrimesJButton;
	private final JButton cancelJButton;
	private final JLabel statusJLabel; // exibe o status do calculo
	private final boolean[] primes; // array booleano para encontrar numeros primos
	
	// construtor
	public PrimeCalculator(int max, JTextArea intermediateJTextArea, JLabel statusJLabel, JButton getPrimesJButton, JButton cancelJButton)
	{
		this.intermediateJTextArea = intermediateJTextArea;
		this.statusJLabel = statusJLabel;
		this.getPrimesJButton = getPrimesJButton;
		this.cancelJButton = cancelJButton;
		primes = new boolean[max];
		
		Arrays.fill(primes, true); // inicializa todos os elementos de numero primo como true
	}
	
	// encontra todos os numeros primos ate max usando o Crivo de Erastostenes
	public Integer doInBackground()
	{
		int count = 0; // o numero de primos enconstrados
		
		// comecando no terceiro valor, circula pelo array e coloca
		// falso como o valor de qualquer numero maior que for um multiplo
		for(int i = 2; i < primes.length; i ++)
		{
			if(isCancelled()) // se o calculo foi cancelado
				return count;
			else
			{
				setProgress(100 * (i + 1) / primes.length);
				
				try
				{
					Thread.sleep(generator.nextInt(5));
				}
				
				catch(InterruptedException ex)
				{
					statusJLabel.setText("Worker thread interrupted");
					return count;
				}
				
				if(primes[i]) // i e primo
				{
					publish(i); // torna i disponivel para exibicao na lista de numeros primos
					++count;
					
					for(int j = i + i; j < primes.length; j += i)
						primes[j] = false; // i nao e primo
					
				}
			}
		}
		
		return count;
	}
	
	// exibe os valores publicados na lista de numeros primos
	protected void process(List<Integer> publishedVals)
	{
		for(int i = 0; i < publishedVals.size(); i ++)
			intermediateJTextArea.append(publishedVals.get(i) + "\n");
	}
	
	// codigo para executar quando doInBackground completa
	protected void done()
	{
		getPrimesJButton.setEnabled(true); // ativa o botao Get Primes
		cancelJButton.setEnabled(false); // desativa o botao Cancel
		
		try
		{
			// recupera e exibe o valor de retorno doInBackground
			statusJLabel.setText("Found " + get() + " primes.");
		}
		
		catch(InterruptedException | ExecutionException | CancellationException ex)
		{
			statusJLabel.setText(ex.getMessage());
		}
	}
} // fim da classe PrimeCalculator
