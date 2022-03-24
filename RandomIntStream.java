// Figura 17.19: RandomIntStream.java
// Rolando um dado 6.000.000 vezes com fluxos

import java.security.SecureRandom;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class RandomIntStream 
{

	public static void main(String[] args) 
	{
	
		SecureRandom random = new SecureRandom();
		
		// rolando um dado 6.000.000 vezes e resumindo os resultados
		System.out.printf("%-6s%s%n", "Face", "Frequency");
		random.ints(6_000_000, 1, 7).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));
	}
} // fim da classe RandomIntStream
