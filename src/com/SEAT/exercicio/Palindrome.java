package com.SEAT.exercicio;

/**
 * Classe que verifica numeros Palindromos
 * 
 * @author Luiz Henrique
 **/
public class Palindrome {

	private long digitos;

	/**
	 * @param digits Número
	 *            de digitos que será utilizado
	 * @return O próprio objecto de contexto
	 **/
	public Palindrome setDigitos(long digits) {
		this.digitos = digits;
		return this;
		
	}
	
	/**
	 * @return O menor número com a quantidade de digitos definidos
	 * **/
	private long menorValor() {
		return (long) Math.pow(10, digitos - 1);
	}

	/**
	 * @return O maior número com a quantidade de digitos definidos
	 **/
	private long maiorValor() {
		String value = "";
		for (long i = 0; i < digitos; i++) {
			value = value.concat("9");
		}
		return Long.parseLong(value);
	}

	/**
	 * Verifica se o número é Palíndromo
	 * 
	 * @param number Número
	 *            que será verificado como palíndromo
	 * @return true caso o número for palíndromo
	 **/
	private boolean isPalindrome(long number) {
		String s = String.valueOf(number);
		char[] c = s.toCharArray();

		String v = "";
		for (int i = c.length - 1; i >= 0; i--) {
			v = v.concat(String.valueOf(c[i]));
		}
		return Math.subtractExact(Long.valueOf(v), Long.valueOf(s)) == 0;
	}
	
	/**
	 * Formata a saída para: fator * fator = produto
	 * @param fator1 Primeiro fator
	 * @param fator2 Segundo fator
	 * @param palindrome Palindrome
	 * @return String formatada
	 * **/
	private String formatar(long fator1, long fator2, long palindrome) {
		StringBuilder build = new StringBuilder();
		build.append(fator1).append(" x ").append(fator2).append(" = ").append(palindrome);
		return build.toString();
	}
	
	/**
	 * @return A operação com os  Fatores e o Produto
	 * **/
	public String maiorPalindromo() {
		long n1 = maiorValor();
		long n2 = maiorValor();
		
		while (n1 >= menorValor()) {
			while (n2 > menorValor()) {
				long result = Math.multiplyExact(n1, n2);
				if (isPalindrome(result)) {
					return formatar(n1, n2, result);
					
				}
				n2--;
			}
			n2 = maiorValor();
			n1--;
		}
		
		return null;
	}
}














