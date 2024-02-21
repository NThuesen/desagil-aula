package br.edu.insper.desagil.aula2;

public class Inversa {

	public String constroi(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;
		}
		return r;
	}

}
