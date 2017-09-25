import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTeste {
	
	private Palindrome palin;
	
	@Before
	public void init() {
		palin = new Palindrome();
	}

	@Test
	public void gera_numero_com_digitos_solicitados() {
		assertEquals(100, palin.initialValue(3));
	}
	
	@Test
	public void gerando_numero() {
		long value = 9009;
		assertTrue(palin.isPalindrome(value));
	}
}
