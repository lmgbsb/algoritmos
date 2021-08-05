package algoritmos.selectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import algoritmos.instacart.Instacart;

class SelectionSortTest {
	

	private static SelectionSort selectionSort;
	
	
	@BeforeAll
	public static void setup() {
		selectionSort = new SelectionSort();
	}
	@Test
	@DisplayName("Primeiro teste")
	public void primeiroTeste() {		
		int[] statues = {6, 2, 3, 8};
		assertEquals(3, selectionSort.makeArrayConsecutive2(statues));
	}
	@Test
	@DisplayName("Segundo teste")
	public void segundoteste() {
		int[] statues = {0, 3};
		assertEquals(2, selectionSort.makeArrayConsecutive2(statues));
	}
	@Test
	@DisplayName("Terceiro teste")
	public void terceiroTeste() {
		int[] statues = {5, 4, 6};
		assertEquals(0, selectionSort.makeArrayConsecutive2(statues));
	}
	@Test
	@DisplayName("Quarto teste")
	public void quartoTeste() {
		int[] statues = {6, 3};
		assertEquals(2, selectionSort.makeArrayConsecutive2(statues));
	}
	@Test
	@DisplayName("Quinto teste")
	public void quintoTeste() {
		int[] statues = {1};
		assertEquals(0, selectionSort.makeArrayConsecutive2(statues));
	}
}
