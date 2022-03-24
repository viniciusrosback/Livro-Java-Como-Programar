// Figura 23.9: Buffer.java
// Interface Buffer especifica metodos chamados por Producer e Consumer

public interface Buffer 
{

	// coloca o valor int no Buffer
	public void blockingPut(int value) throws InterruptedException;
	
	// retorna o valor int a partir do Buffer
	public int blockingGet() throws InterruptedException;
} // fim da interface Buffer
