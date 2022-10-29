package br.edu.ifam.aranoura.questao03equestao04;

public class PrincipalAcampamento {
	public static void main(String[] args){
		Acampamento aluno1 = new Acampamento("Rainha Elsa",23);
		Acampamento aluno2 = new Acampamento("Princesa Anna",20);
		Acampamento aluno3 = new Acampamento("Princesa Rapunzel",18);
		Acampamento aluno4 = new Acampamento("Rainha Eleonor",14);
		Acampamento aluno5 = new Acampamento("Rainha Astrid",10);
		Acampamento aluno6 = new Acampamento("Princesa Merida",8);
		Acampamento aluno7 = new Acampamento("Princesa Diana",9);
		Acampamento aluno8 = new Acampamento("Princesa Sofia",5);

		//Imprimir antes da atribuição da Equipe
		aluno1.imprimir(aluno1);
		aluno2.imprimir(aluno2);
		aluno3.imprimir(aluno3);
		aluno4.imprimir(aluno4);
		aluno5.imprimir(aluno5);
		aluno6.imprimir(aluno6);
		aluno7.imprimir(aluno7);
		aluno8.imprimir(aluno8);
		
		//Atrubuição da Equipe
		aluno1.separarGrupo(aluno1);
		aluno2.separarGrupo(aluno2);
		aluno3.separarGrupo(aluno3);
		aluno4.separarGrupo(aluno4);
		aluno5.separarGrupo(aluno5);
		aluno6.separarGrupo(aluno6);
		aluno7.separarGrupo(aluno7);
		aluno8.separarGrupo(aluno8);
		//Imprimir Depois da Atribuição da Equipe
		aluno1.imprimir(aluno1);
		aluno2.imprimir(aluno2);
		aluno3.imprimir(aluno3);
		aluno4.imprimir(aluno4);
		aluno5.imprimir(aluno5);
		aluno6.imprimir(aluno6);
		aluno7.imprimir(aluno7);
		aluno8.imprimir(aluno8);
	}
}