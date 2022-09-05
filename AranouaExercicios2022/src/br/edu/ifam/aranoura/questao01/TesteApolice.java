package br.edu.ifam.aranoura.questao01;

public class TesteApolice {

	public static void main(String[] args) {
		Apolice apolice1 = new Apolice();
		Apolice apolice2 = new Apolice();
		Apolice apolice3 = new Apolice();
		Apolice apolice4 = new Apolice();
		
		apolice1.setNomeSegurado("Rainha Elsa");
		apolice1.setIdade(36);
		apolice1.setValorPremio(15000.01);
		
		apolice2.setNomeSegurado("Rainha Anna");
		apolice2.setIdade(25);
		apolice2.setValorPremio(10000.01);
		
		
		apolice3.setNomeSegurado("Princesa Merida");
		apolice3.setIdade(18);
		apolice3.setValorPremio(8000.01);
		
		apolice4.setNomeSegurado("Princesa Sofia");
		apolice4.setIdade(6);
		apolice4.setValorPremio(15.01);
		
		apolice1.imprimir(apolice1.getNomeSegurado(),apolice1.getIdade(),apolice1.getValorPremio());
		apolice1.calcularValorPremio(apolice1);
		apolice2.imprimir(apolice2.getNomeSegurado(),apolice2.getIdade(),apolice2.getValorPremio());
		apolice2.calcularValorPremio(apolice2);
		apolice3.imprimir(apolice3.getNomeSegurado(),apolice3.getIdade(),apolice3.getValorPremio());
		apolice3.calcularValorPremio(apolice3);
		apolice4.imprimir(apolice4.getNomeSegurado(),apolice4.getIdade(),apolice4.getValorPremio());
		apolice4.calcularValorPremio(apolice4);
	}

}
