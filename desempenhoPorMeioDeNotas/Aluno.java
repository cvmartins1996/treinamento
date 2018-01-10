package com.treinamento;
import java.util.ArrayList;
import java.util.List;


class Aluno{
	String nome;
	String disciplina;
	private List <Nota> nota = new ArrayList<>();
	
	public void nomeDoAluno(String nomeDoAluno) {
		this.nome = nomeDoAluno;
	}
	public void displayNome() {
		System.out.println("Nome: "+nome);
	}
	public void disciplinaCursada(String disciplinaCursada) {
		this.disciplina = disciplinaCursada;
	}
	public void displayDisciplina() {
		System.out.println("Disciplina: "+ disciplina);
	}
	/*public void mediaDasNotas(float f) {
		float somatoriaDeNotas = 0;
		for (Nota notaDoAluno : nota) {
			somatoriaDeNotas = somatoriaDeNotas + nota; 
		}
		System.out.println(nota/somatoriaDeNotas);
	}*/
	
}