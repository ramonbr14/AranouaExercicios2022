package br.edu.ifam.aranoura.questao01;

public enum Cidades {
	RioDeJaneiro("Rio de Janeiro"),
	Curitiba("Curitiba"),
	SaoPaulo("São Paulo"),
	BeloHorizonte("Belo Horizonte");

	private String cidade;
	
	Cidades(String cidade) {
		this.cidade = cidade;
	}
	Cidades() {
		
	}
	
	public String getCidade() {
		return cidade;
	}
	
	
	
}
