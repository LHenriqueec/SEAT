package com.SEAT.exercicio.teste;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.SEAT.exercicio.Adjacente;

public class AdjacenteTeste {
	
	private Adjacente adj;
	
	@Before
	public void init() {
		adj = new Adjacente("resource/numero.txt");
	}

	
	@Test
	public void mostra_valores_encontrados() {
		System.out.println(adj.processar(13));
	}
	
	@Test
	public void teste() throws Exception {
		Stream<String> lines = Files.lines(Paths.get("resource/numero.txt"));

		Iterator<String> iterator = lines.iterator();

		while (iterator.hasNext()) {
			String line = iterator.next();
			int beginIndex = 0;
			int endIndex = 4;

			for (int i = 4; i <= line.length(); i++) {
				char[] buff = line.subSequence(beginIndex, endIndex).toString().toCharArray();

//				calcular(buff);
				System.out.println(buff[0] + "x" + buff[1] + "x" + buff[2] + "x" + buff[3] + " = " + calcular(buff));
				beginIndex++;
				endIndex++;
			}

		}

	}
	
	private long calcular(char[] values) {
		long value = -1;
		for (char v : values) {
			value = value < 0 ? convertCharToLong(v) : value * convertCharToLong(v);
		}

		return value;
	}
	
	private long convertCharToLong(char c) {
		return Long.parseLong(String.valueOf(c));
	}
}
