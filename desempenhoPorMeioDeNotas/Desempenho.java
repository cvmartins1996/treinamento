package com.treinamento;

public class Desempenho {
	public void exibir(Aluno aluno) {
		System.out.println("Nome do Aluno: " + aluno.getNome() +"\n M�dia: "+aluno.getMediaTodas() + "\n Disciplina: " + aluno.listarTodasAsMaterias());
	}
	
	public void exibirPorMateria(Aluno aluno) {
		System.out.println("Exibir M�dia por Mat�ria: ");
		System.out.println("Nome do Aluno: " + aluno.getNome() + "\n M�dia: " + aluno.MediaPorMateria(2) + "\n Disciplina: " + aluno.listarTodasAsMaterias());
	}
}
