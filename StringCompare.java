// Figura 14.3: StringCompare.java
// Metodos String equals, equalsIgnoreCase, compareTo e regionMatches

public class StringCompare 
{

	public static void main(String[] args) 
	{
		String s1 = new String("hello"); // s1 e uma copia de "hello"
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birthday";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
		
		// teste para igualdade
		if(s1.equals("hello")) // true
			System.out.println("s1 equals \"hello\"");
		else
			System.out.println("s1 does not equal \"hello\"");
		
		// testa quanto a igualdade com ==
		if(s1 == "hello") // false; eles nao sao os mesmos objetos
			System.out.println("s1 is the same object as \"hello\"");
		else
			System.out.println("s1 is not the same object as \"hello\"");
		
		// testa quanto a igualdade (ignora maiusculas e minusculas)
		if(s3.equalsIgnoreCase(s4)) // true
			System.out.printf("%s equals %s with case ignored%n", s3, s4);
		else
			System.out.println("s3 does not equal s4");
		
		// testa compareTo
		
	}
}
