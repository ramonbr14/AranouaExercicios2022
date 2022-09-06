package br.edu.ifam.aranoura.questao01;

public class TesteApolice {

	public static void main(String[] args) {
		Apolice apolice1 = new Apolice();
		Apolice apolice2 = new Apolice();
		Apolice apolice3 = new Apolice();
		Apolice apolice4 = new Apolice();
		Apolice apolice5 = new Apolice();
		Cidades cidade = null;
		apolice1.setNomeSegurado("Rainha Elsa");
		apolice1.setIdade(36);
		apolice1.setValorPremio(15000.01);
		apolice1.setCidade(cidade.BeloHorizonte.getCidade());
		
		apolice2.setNomeSegurado("Rainha Anna");
		apolice2.setIdade(25);
		apolice2.setValorPremio(10000);
		apolice2.setCidade(cidade.RioDeJaneiro.getCidade());
				
		apolice3.setNomeSegurado("Princesa Merida");
		apolice3.setIdade(18);
		apolice3.setValorPremio(8000);
		apolice3.setCidade(cidade.SaoPaulo.getCidade());
		
		apolice4.setNomeSegurado("Princesa Sofia");
		apolice4.setIdade(6);
		apolice4.setValorPremio(15);
		apolice4.setCidade("Manaus");
		
		apolice5.setNomeSegurado("Princesa Astrid");
		apolice5.setIdade(35);
		apolice5.setValorPremio(9000);
		apolice5.setCidade(cidade.Curitiba.getCidade());
		
		apolice1.imprimir(apolice1.getNomeSegurado(),apolice1.getIdade(),apolice1.getValorPremio());
		apolice1.calcularValorPremio(apolice1);
		apolice2.imprimir(apolice2.getNomeSegurado(),apolice2.getIdade(),apolice2.getValorPremio());
		apolice2.calcularValorPremio(apolice2);
		apolice3.imprimir(apolice3.getNomeSegurado(),apolice3.getIdade(),apolice3.getValorPremio());
		apolice3.calcularValorPremio(apolice3);
		apolice4.imprimir(apolice4.getNomeSegurado(),apolice4.getIdade(),apolice4.getValorPremio());
		apolice4.calcularValorPremio(apolice4);
		
		apolice1.Desconto(apolice1);
		apolice2.Desconto(apolice2);
		apolice3.Desconto(apolice3);
		apolice4.Desconto(apolice4);
		apolice5.Desconto(apolice5);
	}

}
