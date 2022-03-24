// Figura 16.10: DeckOfCards.java
// Embaralhamento e distribuicao de cartas com metodo shuffle de Collections

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// classe para representar uma Card de um baralho
class Card
{
	public static enum Face{Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
	public static enum Suit{Clubs, Diamonds, Hearts, Spades};
	
	
	private final Face face;
	private final Suit suit;
	
	// construtor
	public Card(Face face, Suit suit)
	{
		this.face = face;
		this.suit = suit;
	}
	
	// retorna face da carta
	public Face getFace()
	{
		return face;
	}
	
	// retorna naipe de Card
	public Suit getSuit()
	{
		return suit;
	}
	
	// retorna representacao String de Card
	public String toString()
	{
		return String.format("%s of %s", face, suit);
	}
} // fim da classe Card

	// declaracao da classe DeckOfCards
	public class DeckOfCards()
	{
		private List<Card> list; // declara List que armazenara Cards
		
		// configura baralho de Cards e embaralha
		public DeckOfCards()
		{
			Card[] deck = new Card[52];
			int count = 0; // numero de cartas
			
			// preenche baralho com objetos Card
			for(Card.Face suit: Card.Suit.values())
			{
				for(Card.Face face : Card.Face.values())
				{
					deck[count] = new Card(face, suit);
					++count;
				}
			}
			
			list = Arrays.asList(deck); // obtem List
			Collections.shuffle(list); // embaralha as cartas
		} // fim do construtor DeckOfCards
		
		// gera saida de baralho
		public void printCards()
		{
			// exibe 52 cartas em duas colunas
			for(int i = 0; i < list.size(); i++)
				System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "%n" : "");
		}
		
		public static void main(String[] args)
		{
			DeckOfCards cards = new DeckOfCards();
			cards.printCards();
		}
} // fim da classe DeckOfCards



/*
// Figura 7.10: DeckOfCards.java
// classe DeckOfCards representa um baralho

import java.security.SecureRandom;

public class DeckOfCards 
{
	private Card[] deck; // array de objetos Card
	private int currentCard; // indice da proxima Card a ser distribuida (0-51)
	private static final int NUMBER_OF_CARDS = 52; // numero constante de Cards
	// gerador de numero aleatorio
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// construtor preenche baralho de cartas
	public DeckOfCards()
	{
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Card[NUMBER_OF_CARDS]; // cria array de objetos Card
		currentCard = 0; // a primeira Card distribuida sera o deck[0]
		
		// preenche baralho com objetos Card
		for(int count = 0; count < deck.length; count ++)
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}
	
	// embaralha as cartas com um algoritmo de uma passagem
	public void shuffle()
	{
		// a proxima chamada para o metodo dealCard deve comecar no decj[0] novamente
		currentCard = 0;
		
		// para cada Card, seleciona outra Card aleatoria (0-51) e as compara
		for(int first = 0; first < deck.length; first ++)
		{
			// seleciona um numero aleatoria entre 0 e 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// compara Card atual com Card aleatoriamente selecionada
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	// distribui uma Card
	public Card dealCard()
	{
		// determina se ainda ha Cards a serem distribuidas
		if(currentCard < deck.length)
			return deck[currentCard++]; // retorna Card atual no array
		else
			return null; // retorna nulo para indicar que todos as Cards foram distribuidas
	}
} // fim da classe DeckOfCards

*/
