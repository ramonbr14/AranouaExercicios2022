package br.edu.ifam.aranoura.questao23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VetorUnidimensional implements InterfaceDimensao{

	private int[] dim1;
	protected int linha;
	int i = 0;
	
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
		
		try {
			dim1 = new int[tamanho];
			dim1[i]=valor;
			i++;
			System.out.println("PASSOU"+ dim1[i-1]);
			//throw new Exception();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		imprimir(dim1);
	}

	public void imprimir(int[] vex) {
		dim1 = vex;
		System.out.print("Vetor: ");
		for(int i=0;i<vex.length;i++) {
			 System.out.print(dim1[i]+", ");
		}
	}
	public int[] getDim1() {
		return dim1;
	}
	public void setDim1(int[] dim1) {
		this.dim1 = dim1;
	}

	

}



