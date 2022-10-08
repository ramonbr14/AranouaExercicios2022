package br.edu.ifam.aranoura.questao23;

import java.beans.ExceptionListener;

public interface InterfaceDimensao{
	int tamanho = 2;
	public static void imprimir() {
		
	}
	public static void adicionar(int valor) throws MyClassException {
		throw new MyClassException(valor);
		
		
	}
}
