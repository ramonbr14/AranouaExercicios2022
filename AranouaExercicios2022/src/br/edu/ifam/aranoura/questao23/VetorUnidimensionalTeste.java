package br.edu.ifam.aranoura.questao23;

import java.lang.reflect.Array;
import java.util.Vector;

public class VetorUnidimensionalTeste implements InterfaceDimensao {

	public static void main(String[] args) throws MyClassException {
		int valor = 10;
		VetorUnidimensional vex1 = new VetorUnidimensional();
		VetorUnidimensional vex2 = new VetorUnidimensional(valor);
		
		vex1.adicionar(valor);
	}

}
