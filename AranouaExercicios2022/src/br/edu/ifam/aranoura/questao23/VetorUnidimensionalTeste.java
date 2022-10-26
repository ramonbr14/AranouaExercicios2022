package br.edu.ifam.aranoura.questao23;

public class VetorUnidimensionalTeste implements InterfaceDimensao {

	public static void main(String[] args) throws MyClassException {
		int valor = 10;
		//int[] dim;
		VetorUnidimensional vex1 = new VetorUnidimensional();
		VetorUnidimensional vex2 = new VetorUnidimensional(valor);
		
		vex1.adicionar(10);
		vex1.adicionar(20);
		vex1.adicionar(30);
		
		vex2.adicionar(40);
		vex2.adicionar(50);
		vex2.adicionar(60);
		
		System.out.println("ENCERRADO"); 
	}

}
