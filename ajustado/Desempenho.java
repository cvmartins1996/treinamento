package com.treinamento;

import java.util.List;

public class Desempenho {

	Materia materia;
	public void exibir(Aluno aluno) {
		System.out.println("Nome do Aluno: " + aluno.getNome() + " Média de Notas: " + aluno.getMedia());
	}

	public void exibirPorMateria(Aluno aluno) {
		List<Materia> materias =materia.setMateria(materia.getMedia());
		for (Materia materia : materias) {
			System.out.println("Nome do Aluno: " + aluno.getNome() + "Media de Notas" + materia.getMedia());			
		}
	}

}
