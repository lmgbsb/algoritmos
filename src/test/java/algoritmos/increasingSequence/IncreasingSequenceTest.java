package algoritmos.increasingSequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncreasingSequenceTest {

	
	private static IncreasingSequence increasingSequence;
	
	
	@BeforeAll
	public static void setup() {
		increasingSequence = new IncreasingSequence();
	}
	@Test
	@DisplayName("Primeiro Teste")
	public void pimeiroTeste() {
		int[] sequence = {1, 3, 2, 1};
		assertEquals(false, increasingSequence.almostIncreasingSequence(sequence));
	}
	@Test
	@DisplayName("Segundo Teste")
	public void segundoTeste() {
		int[] sequence = {1, 3, 2};
		assertEquals(true, increasingSequence.almostIncreasingSequence(sequence));
	}
	@Test
	@DisplayName("Terceiro Teste")
	public void terceiroTeste() {
		int[] sequence = {10, 1, 2, 3, 4, 5};
		assertEquals(true, increasingSequence.almostIncreasingSequence(sequence));
	}
	@Test
	@DisplayName("Quarto Teste")
	public void quartoTeste() {
		int[] sequence = {40, 50, 60, 10, 20, 30};
		assertEquals(false, increasingSequence.almostIncreasingSequence(sequence));
	}
	@Test
	@DisplayName("Quinto Teste")
	public void quintoTeste() {
		int[] sequence = {10, 1, 2, 3, 4, 5, 6, 1};
		assertEquals(false, increasingSequence.almostIncreasingSequence(sequence));
	}
	@Test
	@DisplayName("Sexto Teste")
	public void sextoTeste() {
		int[] sequence = {3, 6, 5, 8, 10, 20, 15};
		assertEquals(false, increasingSequence.almostIncreasingSequence(sequence));
	}
	@Test
	@DisplayName("Sétimo Teste")
	public void setimoTeste() {
		int[] sequence = {1, 2, 5, 5, 5};
		assertEquals(false, increasingSequence.almostIncreasingSequence(sequence));
	}
}
