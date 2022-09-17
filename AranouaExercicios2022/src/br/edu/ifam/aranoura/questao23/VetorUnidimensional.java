package br.edu.ifam.aranoura.questao23;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Vector;

public class VetorUnidimensional implements InterfaceDimensao{

	private Array dim1;
	protected int linha;
	
	
	public VetorUnidimensional() {
		super();
		Vector<Integer> vex = new Vector<Integer>();
		vex.setSize(tamanho);
	}
	public VetorUnidimensional(int valor) throws MyClassException{
		try{
			if(valor<=0||valor>=2000000)throw new MyClassException(valor);
			Vector<Integer> vex = new Vector<Integer>();
			vex.setSize(valor);
		}catch(MyClassException e) {
			System.out.print("Valor fora dos parametros");
		}
		
	}

	//Metodos Manuais
	public void adicionar(int valor) throws MyClassException {
		if(vex.size()>=linha) {
			System.out.println("Aviso: Risco de sobreposição de valores");
		}else {
			((Vector<Integer>) vex).add(valor);
		}
	}

	public void imprimir(Vector<Integer>vex) {
		String imp = "";
		System.out.print("Vetor: ");
		for(int i=0;i<=vex.size();i++) {
			imp += vex.get(i);
		}
	}
}
