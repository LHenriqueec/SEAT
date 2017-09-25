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
	
	
}
