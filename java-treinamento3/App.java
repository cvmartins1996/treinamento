package com.treinamento;

public class App {
	public static void main(String args[]) {
		Grade grade = new Grade();
		Materia ingles = new Materia("ingles");
		ingles.adiconarNota(new Nota(8.2f));
		ingles.adiconarNota(new Nota(9.6f));
		Desempenho desempenho = new Desempenho();
		Aluno aluno = new Aluno();
		aluno.adicionarNome("Caio");
		//desempenho.exibir(aluno);
		desempenho.exibirPorMateria(aluno);
	}
}