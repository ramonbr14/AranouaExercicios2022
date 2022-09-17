package br.edu.ifam.aranoura.questao23;

public class MyClassException extends Exception {
	private int valor;
	
	public MyClassException(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
