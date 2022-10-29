package br.edu.ifam.aranoura.questao03equestao04;

import javax.swing.JOptionPane;

public class Acampamento {
	//Valiable Class
	private String nome;
	private char equipe;
	private int idade;
	
	String message = "";
	String title = "Acampamento das Amazonas";
	
	//Construtores //Constructors
	public Acampamento() {
		super();
	}

	public Acampamento(String nome, char equipe, int idade) {
		super();
		this.nome = nome;
		this.equipe = equipe;
		this.idade = idade;
	}


	public Acampamento(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	//Manual Metods
	
	public void imprimir(Acampamento aluno){
		if(equipe==0){
		message = "A Princesa Guerreira: "+aluno.nome+" \n tem "+aluno.idade+" de idade";
		}else{
		message = "A Princesa Guerreira: "+aluno.nome+" \n tem "+aluno.idade+" de idade \n "+
		"e pertence a equipe: "+aluno.equipe;	
		}
		JOptionPane.showConfirmDialog(null, message, title, 0, JOptionPane.WARNING_MESSAGE);
		System.out.println(message);
	}
	
	public void separarGrupo(Acampamento aluno){
		if(aluno.getIdade()>=21) {
			aluno.setEquipe('C');
		}else if(aluno.getIdade()>=11) {
			aluno.setEquipe('B');
		}else if(aluno.getIdade()>=6) {
			aluno.setEquipe('A');
		}else{
			message = "A Princesa Guerreira: "+aluno.nome+" \n não tem idade para integrar uma equipe";
			JOptionPane.showConfirmDialog(null, message, title, 0, JOptionPane.WARNING_MESSAGE);
			System.out.println(message);
		} 
		
	}


	public Acampamento cadastraAcampamento(Acampamento aluno){
		return aluno;
	}


	//getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getEquipe() {
		return equipe;
	}

	public void setEquipe(char equipe) {
		this.equipe = equipe;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}