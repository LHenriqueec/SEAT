package com.SEAT.exercicio;

/**
 * Classe que trabalha com números primos
 * @author Luiz Henrique
 **/
public class Primo {
	
	/**
	 * 6 primeiros números primos
	 */
	private final static int[] primos = {2, 3, 5, 7, 11, 13};

	
	/**
	 * 
	 * @param value N-ésimo valor que se deseja encontrar
	 * @return N-ésimo Nº primo encontrado
	 */
	public long foundNPrimo(int value) {
		if(value <= primos.length && value > 0) {
			return primos[value - 1];
		}
		
		value -= primos.length;
		int count = 13;
		while(value > 0) {
			count++;
			if(isPrimo(count)) value--;
		}
		
		return count;
	}
	
	/**
	 * 
	 * @param numero Valor que se deseja verificar se é primo
	 * @return <code>true</code> caso seja um número primo
	 */
	private boolean isPrimo(long numero) {
		for (int primo : primos) {
			if(primo == numero) return true;
			
			if(numero % primo == 0) return false;
		}
		
		return true;
	}
}
