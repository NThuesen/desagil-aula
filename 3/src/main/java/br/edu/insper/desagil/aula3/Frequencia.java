package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class Frequencia {

	public Map<Character, Integer> conta(String s) {
		Map<Character, Integer> frequencia = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!frequencia.containsKey(c)) {
				frequencia.put(c, 0);
			}
			frequencia.put(c, frequencia.get(c) + 1);
		}
		return frequencia;
	}
}
