package com.treinamento;

public class App {
	public static void main(String args[]) {
		Desempenho desempenho = new Desempenho();
		Aluno aluno = new Aluno();
		aluno.adicionarNome("Caio");
		aluno.adicionarNota(new Nota(8.2f));
		desempenho.exibir(aluno);
	}
}