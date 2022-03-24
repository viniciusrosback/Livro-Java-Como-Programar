// Figura 7.9: Card.java
// Classe Card representa uma carta de baralho

public class Card 
{

	private final String face; // face da carta ("Ace", "Deuce", ...)
	private final String suit; // naipe da carta ("Hearts", "Diamonds", ...)
	
	//construtor de dois argumentos inicializa face e naipe da carta
	public Card(String cardFace, String cardSuit)
	{
		this.face = cardFace; // incializa face da carta
		this.suit = cardSuit; // incializa naipe da carta
	}
	
	// retorna representacao String de Card
	public String toString()
	{
		return face + " of " + suit;
	}
}  // fim da classe Card
