package com.SEAT.exercicio.teste;
import org.junit.Before;
import org.junit.Test;

import com.SEAT.exercicio.Palindrome;

public class PalindromeTeste {
	
	private Palindrome palin;
	
	@Before
	public void init() {
		palin = new Palindrome();
	}

	@Test
	public void armazena_numeros_palindromos() {
		System.out.println(palin.setDigitos(3).maiorPalindromo());
	}
}













