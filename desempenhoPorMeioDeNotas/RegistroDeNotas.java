package com.treinamento;


public class RegistroDeNotas {

	public static void main(String args[]) {
		
		Aluno aluno = new Aluno();
		aluno.nomeDoAluno("Caio");
		aluno.adicionarNotasEMaterias(new Nota(6f), new Materia("Matematica", 1));
		aluno.adicionarNotasEMaterias(new Nota(6f), new Materia("Portugues", 2));
		aluno.adicionarNotasEMaterias(new Nota(8f), new Materia("Portugues", 2));
		
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(aluno);
		desempenho.exibirPorMateria(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.nomeDoAluno("Martins");
		aluno2.adicionarNotasEMaterias(new Nota(6f), new Materia("Matematica", 2));
		aluno2.adicionarNotasEMaterias(new Nota(6f), new Materia("Ingles", 4));
		aluno2.adicionarNotasEMaterias(new Nota(6f), new Materia("Algoritmo", 1));
		
		desempenho.exibir(aluno2);
		
	}
}

 