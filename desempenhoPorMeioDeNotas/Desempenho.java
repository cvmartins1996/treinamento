package com.treinamento;

public class Desempenho {
	public void exibir(Aluno aluno) {
		System.out.println("Nome do Aluno: " + aluno.getNome() +"\n Média: "+aluno.getMediaTodas() + "\n Disciplina: " + aluno.listarTodasAsMaterias());
	}
	
	public void exibirPorMateria(Aluno aluno) {
		System.out.println("Exibir Média por Matéria: ");
		System.out.println("Nome do Aluno: " + aluno.getNome() + "\n Média: " + aluno.MediaPorMateria(2) + "\n Disciplina: " + aluno.listarTodasAsMaterias());
	}
}
