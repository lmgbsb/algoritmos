package algoritmos.selectionSort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
		long tempoInicial = System.currentTimeMillis();
		assertEquals(3, selectionSort.makeArrayConsecutive2(statues));
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao = ((tempoFinal - tempoInicial) / 1000);
		assertTrue(tempoExecucao < 3);//tempo de execucao deve ser inferior a 3 segundos
	}
	@Test
	@DisplayName("Segundo teste")
	public void segundoteste() {
		int[] statues = {0, 3};
		long tempoInicial = System.currentTimeMillis();
		assertEquals(2, selectionSort.makeArrayConsecutive2(statues));
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao = ((tempoFinal - tempoInicial) / 1000);
		assertTrue(tempoExecucao < 3);//tempo de execucao deve ser inferior a 3 segundos		
	}
	@Test
	@DisplayName("Terceiro teste")
	public void terceiroTeste() {
		int[] statues = {5, 4, 6};
		long tempoInicial = System.currentTimeMillis();
		assertEquals(0, selectionSort.makeArrayConsecutive2(statues));
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao = ((tempoFinal - tempoInicial) / 1000);
		assertTrue(tempoExecucao < 3);//tempo de execucao deve ser inferior a 3 segundos			
	}
	@Test
	@DisplayName("Quarto teste")
	public void quartoTeste() {
		int[] statues = {6, 3};
		long tempoInicial = System.currentTimeMillis();
		assertEquals(2, selectionSort.makeArrayConsecutive2(statues));
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao = ((tempoFinal - tempoInicial) / 1000);
		assertTrue(tempoExecucao < 3);//tempo de execucao deve ser inferior a 3 segundos			
	}
	@Test
	@DisplayName("Quinto teste")
	public void quintoTeste() {
		int[] statues = {1};
		long tempoInicial = System.currentTimeMillis();
		assertEquals(0, selectionSort.makeArrayConsecutive2(statues));
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao = ((tempoFinal - tempoInicial) / 1000);
		assertTrue(tempoExecucao < 3);//tempo de execucao deve ser inferior a 3 segundos			
	}
}
