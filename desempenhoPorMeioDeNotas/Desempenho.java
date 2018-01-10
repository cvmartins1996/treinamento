package com.treinamento;

public class Desempenho {
	Aluno aluno = new Aluno();
	public void displayNome() {
		System.out.println("Nome: "+aluno.nome);
	}
	public void displayDisciplina() {
		System.out.println("Disciplina: "+ aluno.disciplina);
	}
}
