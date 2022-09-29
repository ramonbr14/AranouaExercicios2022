package br.edu.ifam.aranoura.questao23;

import java.lang.reflect.Array;
import java.util.Vector;

public class VetorUnidimensionalTeste implements InterfaceDimensao {

	public static void main(String[] args) throws MyClassException {
		int valor = 10;
		//int[] dim;
		VetorUnidimensional vex1 = new VetorUnidimensional();
		VetorUnidimensional vex2 = new VetorUnidimensional(valor);
		
		vex1.adicionar(10);
		vex1.adicionar(20);
		vex1.adicionar(30);
		//dim = vex1.getDim1();
		//vex1.imprimir(dim);
		System.out.println("ENCERRADO"); 
	}

}
