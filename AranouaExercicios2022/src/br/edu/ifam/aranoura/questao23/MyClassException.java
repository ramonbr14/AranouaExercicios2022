package br.edu.ifam.aranoura.questao23;

public class MyClassException extends Exception {
	protected int valor;
	
	public MyClassException(int valor) {
		super();
		this.valor = valor;
	
	}

	@Override
	public String toString() {
		return "Erro na informação do Valor";
	}
	
	
}
