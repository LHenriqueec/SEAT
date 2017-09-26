package com.SEAT.exercicio.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.SEAT.exercicio.Primo;

public class PrimoTeste {
	
	private Primo primo;
	
	@Before
	public void init() {
		primo = new Primo();
	}
	
	@Test
	public void busca_nEsimo() {
		int n = 56835;
		assertEquals(296287, primo.foundNPrimo(n));
	}

	@Test
	public void verifica_se_eh_primo() {
		assertFalse(primo.isPrimo(18524));
		assertTrue(primo.isPrimo(19));
	}
}
