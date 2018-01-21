package com.treinamento;
public class App {

	public static void main(String[] a) {
		Aluno aluno = new Aluno("Caio");
		Materia ingles = new Materia("ingles");
		ingles.adicionarNotas(new Nota(9.2f));
		ingles.adicionarNotas(new Nota(10f));
		aluno.adicionarNotas(new Nota(8.2f));
		aluno.adicionarNotas(new Nota(9.5f));
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(aluno);
		desempenho.exibirPorMateria(aluno);
	}
}
