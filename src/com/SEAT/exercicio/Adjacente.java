package com.SEAT.exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Classe que verifica o maior produto de um número com mil digitos
 * @author Luiz Henrique
 **/
public class Adjacente {
	
	private Stream<String>  lines;
	
	/**
	 * Construtor que recebe o caminho do arquivo
	 *@param path Caminho onde está o arquivo com o Nº de mil digitos
	 **/
	public Adjacente(String path) {
		try {
			lines = Files.lines(Paths.get(path));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	/**
	 *@param intervalo Define o range de números que será utilizado
	 *@return  O maior produto encontrado
	 **/
	public String processar(int intervalo) {
		String resultado = null;
		Iterator<String> iterator = lines.iterator();
		long maiorValor = 0;
		
		while (iterator.hasNext()) {
			String line = iterator.next();
			int beginIndex = 0;
			int endIndex = intervalo;

			for (int i = intervalo; i <= line.length(); i++) {
				char[] buff = line.subSequence(beginIndex, endIndex).toString().toCharArray();
				long valor = calcular(buff);
				
				if(valor > maiorValor) {
					maiorValor = valor;
					resultado = formatar(buff, valor);
				}
				beginIndex++;
				endIndex++;
			}

			
		}
		if(resultado == null) {
			resultado = "Resultado: " + maiorValor;
		}
		return resultado;
	}
	
	/**
	 * Encontra o produto do intevalo
	 * @param values Números encontrados no intervalo definido
	 * @return Produto do intervalo
	 */
	private long calcular(char[] values) {
		long value = -1;
		for (char v : values) {
			value = value < 0 ? convertCharToLong(v) : value * convertCharToLong(v);
		}

		return value;
	}
	
	/**
	 * Converte 'char' para 'long'
	 * @param c Caractere que deseja converter
	 * @return 'long' convertido do 'char'
	 */
	private long convertCharToLong(char c) {
		return Long.parseLong(String.valueOf(c));
	}
	
	/**
	 * Formata a saída.<br>
	 * Exemplo: 9x9x9 = 759
	 * @param buff Sequência de caracteres
	 * @param resultado Valor do produto
	 * @return String formatada
	 */
	private String formatar(char[] buff, long resultado) {
		StringBuffer buffer = new StringBuffer();
		
		for (char c : buff) {
			buffer.append(c).append("x");
		}
		
		buffer.deleteCharAt(buff.length * 2 - 1);
		buffer.append(" = ");
		buffer.append(resultado);
		
		return buffer.toString();
	}
}












