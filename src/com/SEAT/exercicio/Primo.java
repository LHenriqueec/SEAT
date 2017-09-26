package com.SEAT.exercicio;

public class Primo {
	
	private final static int[] primos = {2, 3, 5, 7, 11, 13};

	
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
	
	public boolean isPrimo(long numero) {
		for (int primo : primos) {
			if(primo == numero) return true;
			
			if(numero % primo == 0) return false;
		}
		
		return true;
	}
}
