package br.edu.ifam.aranoura.questao01;

import javax.swing.JOptionPane;

/*
 * Exercício 1
Desenvolver uma classe Java chamada Apolice com os seguintes atributos: nomeSegurado, 
	idade e valorPremio. A classe Apolice deverá conter os seguintes métodos:
Método:
	
	- imprimir(): Este método não retorna valor e deverá mostrar na tela todos os
		atributos da classe Apolice.

	- calcularPremioApolice(): Este método não retorna valor e deverá calcular o valor do prêmio
		seguindo as seguintes regras: caso a idade seja maior ou igual a 18 e
		menor ou igual a 25 anos, use a fórmula: valorPremio +=
		(valorPremio*20)/100. Quando a idade for superior a 25 e menor ou
		igual a 36 anos, use a fórmula: valorPremio += (valorPremio*15)/100.
		Quando a idade for superior a 36, use a fórmula: valorPremio +=
		(valorPremio*10)/100.
 
	- oferecerDesconto(): Este método não retorna valor, mas recebe o parâmetro cidade, que irá
		conter o nome da cidade para o cálculo do desconto. Caso a cidade
		seja Curitiba, dê um desconto no valor do prêmio de 20%. Caso seja Rio
		de Janeiro, dê um desconto no valor do prêmio de 15%. Caso seja São
		Paulo, dê um desconto no valor do prêmio de 10%. Caso seja Belo
		Horizonte dê um desconto no valor do prêmio de 5%. Para realizar a
		comparação de strings neste exercício utilizar o método equals().
 
*/

public class Apolice {
	//Variaveis da classe Apolice
	private String nomeSegurado = "";
	private int	idade;
	private double valorPremio;
	private String cidade;
	String title = "ARENDELLE SEGUROS S/A";
	
	//Construtores
	public Apolice() {
		super();
	}
	public Apolice(String nomeSegurado, int idade, double valorPremio) {
		super();
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}

	//Metodos Manuais: São metodos criados manualmente.
	public void imprimir(String nome, int idade, double valor){
		String message = "Nome do Segurado: "+nomeSegurado+",\ntem "+idade+" anos, "
				+"\n Tem um premio no valor atual de \nR$ "+valorPremio;
		String title = "ARENDELLE SEGUROS S/A";
		JOptionPane.showConfirmDialog(null, message, title, 0);
		System.out.println(message);
	}
	//Calculando o valor do premio conforme a idade
	public void calcularValorPremio(Apolice apolice){
		Apolice ap = apolice;
		if(ap.getIdade()>36) {
			ap.setValorPremio(valorPremio+=(valorPremio*10)/100);
		}else if(ap.getIdade()>25) {
			ap.setValorPremio(valorPremio+=(valorPremio*15)/100);
		}else if(ap.getIdade()>=18) {
			ap.setValorPremio(valorPremio+=(valorPremio*20)/100);
		}
		else {
			JOptionPane.showConfirmDialog(null,"Não se paga premio a menores de idade");
			System.out.println("Não se paga premio a menores de idade");
		}
		String message = "Nome do Segurado: "+nomeSegurado+",\ntem "+idade+" anos, "
				+"\n teve o valor do premio atualizao \nR$ "+valorPremio;
		String title = "ARENDELLE SEGUROS S/A";
		JOptionPane.showConfirmDialog(null, message, title, 0);
		System.out.println(message);
	}
	//Define o Desconto a ser aplicado a apolice conforme a cidade
	public void Desconto(Apolice apolice){
		 Apolice ap = apolice;
		 switch (ap.getCidade()) {
		 	case "Curitiba":
				apolice.setValorPremio(apolice.getValorPremio()-(apolice.getValorPremio()*0.2));
				mensagem(apolice);
			break;
			
		 	case "Rio de Janeiro":
		 		apolice.setValorPremio(apolice.getValorPremio()-(apolice.getValorPremio()*0.15));
		 		mensagem(apolice);
		 	break;
		 	
		 	case "São Paulo":
			apolice.setValorPremio(apolice.getValorPremio()-(apolice.getValorPremio()*0.1));
			mensagem(apolice);
		break;
		case "Belo Horizonte":
			apolice.setValorPremio(apolice.getValorPremio()-(apolice.getValorPremio()*0.05));
			mensagem(apolice);
		break;
		default:
			JOptionPane.showConfirmDialog(null,apolice.getCidade()+" não possui desconto", title, 0);
			System.out.println(apolice.getCidade()+" não possui desconto");
			break;
		}
	}
	//Impress�o padr�o para as mensagens
	@SuppressWarnings("unused")
	private void mensagem(Apolice apolice) {
		String message = "Para "+apolice.getNomeSegurado()+",\nPor morar em "+apolice.getCidade()
							+", o premio será de: R$ "+apolice.getValorPremio();
		String title = "ARENDELLE SEGUROS S/A";
		JOptionPane.showConfirmDialog(null, message, title, 0);
		System.out.println(title+" informa: "+message);
	}

	//getter e setter
	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}