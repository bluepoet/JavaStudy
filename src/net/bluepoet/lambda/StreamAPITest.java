package net.bluepoet.lambda;

import java.util.stream.IntStream;

public class StreamAPITest {
	 public static void main(String[] args) {
		IntStream.range(1, 100).filter(n -> n % 2 == 0).map(n -> n*2).skip(10).limit(10).forEach(
				nbr -> System.out.println(nbr)
		);				
	}
}
