package algoritmos.instacart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InstacartTest {

	
	private static Instacart instacart;
	
	
	@BeforeAll
	public static void setup() {
		instacart = new Instacart();
	}
	@Test
	@DisplayName("Primeiro teste")
	public void primeiroTeste() {		
		double[] prices = {110, 95, 70};
		String[] notes = {"10.0% higher than in-store", 
				         "5.0% lower than in-store", 
				         "Same as in-store"};
		double x = 5;		
		assertEquals(true, instacart.isAdmissibleOverpayment(prices, notes, x));
	}
	@Test
	@DisplayName("Segundo teste")
	public void segundoTeste() {
		double[] prices = {48, 165};
		String[] notes = {"20.00% lower than in-store", 
		                  "10.00% higher than in-store"};
		double x = 2;		
		assertEquals(false, instacart.isAdmissibleOverpayment(prices, notes, x));	
	}
	@Test
	@DisplayName("Terceiro teste")
	public void terceiroTeste() {		
		double[] prices = {24.42, 24.42, 24.2424, 85.23};
		String[] notes = {"13.157% higher than in-store", 
		     			 "13.157% lower than in-store", 
		    			 "Same as in-store", 
		    			 "19.24% higher than in-store"};
		double x = 24.24;		
		assertEquals(true, instacart.isAdmissibleOverpayment(prices, notes, x));	
	}
	@Test
	@DisplayName("Quarto teste")
	public void quartoTeste() {		
		double[] prices = {110, 110, 110, 110, 110, 110, 110, 110, 110, 160};
		String[] notes = {"10.0% higher than in-store", 
		     			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "10.0% higher than in-store", 
		    			 "60.0% higher than in-store"};
		double x = 150;		
		assertEquals(true, instacart.isAdmissibleOverpayment(prices, notes, x));	
	}
	@Test
	@DisplayName("Quinto teste")
	public void quintoTeste() {		
		double[] prices = {40, 40, 40, 40};
		String[] notes = {"0.001% higher than in-store", 
		     			 "0.0% lower than in-store", 
		    			 "0.0% higher than in-store", 
		    			 "0.0% lower than in-store"};
		double x = 0;		
		assertEquals(false, instacart.isAdmissibleOverpayment(prices, notes, x));	
	}
	@Test
	@DisplayName("Sexto teste")
	public void sextoTeste() {
		double[] prices = {35000, 35000};
		String[] notes = {"35000.0% higher than in-store", 
		     			 "10000.0% lower than in-store"};
		double x = 150;		
		assertEquals(false, instacart.isAdmissibleOverpayment(prices, notes, x));	
	}	
}
