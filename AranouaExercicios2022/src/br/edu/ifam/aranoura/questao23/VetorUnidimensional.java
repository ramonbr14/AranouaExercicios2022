package br.edu.ifam.aranoura.questao23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VetorUnidimensional implements InterfaceDimensao{

	private Vector<Integer> dim1;
	protected int linha;
	
	//Construtores
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
	@SuppressWarnings("null")
	public void adicionar(int valor) throws MyClassException {
		//Descobrir como adicionar o Valor no vector
	}
	/*
	 public void adicionar(@SuppressWarnings("rawtypes") VetorUnidimensional vex,int valor) throws MyClassException {
	 
		if(((List<Integer>) vex).size()>=linha) {
			System.out.println("Aviso: Risco de sobreposi��o de valores");
		}else {
			((List<Integer>) vex).add(valor);
		}
	}*/

	public void imprimir(Vector<Integer> vex) {
		System.out.print("Vetor: ");
		for(int i=0;i<=vex.size();i++) {
		}
	}
	public Array getDim1() {
		return dim1;
	}
	public void setDim1(Array dim1) {
		this.dim1 = dim1;
	}


}



