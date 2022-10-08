package br.edu.ifam.aranoura.questao23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VetorUnidimensional implements InterfaceDimensao{

	private int[] dim1 = new int[tamanho];
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
			
			dim1[i]=valor;
			System.out.println("\nPASSOU: "+ dim1[i]);
			i++;
			System.out.println("\nvalor do i: "+ i);
			//throw new Exception();
			
		}catch (Exception e) {
			System.out.println("Alerta Risco de Sopreposição de valores no veto");
		}
		imprimir(dim1);
	}

	public void imprimir(int[] vex) {
		System.out.print("VetorB"+i+": ");
		for(int i=0;i<vex.length;i++) {
			 System.out.print(vex[i]+", ");
		}
	}
	public int[] getDim1() {
		return dim1;
	}
	public void setDim1(int[] dim1) {
		this.dim1 = dim1;
	}

	

}



