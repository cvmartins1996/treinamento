package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Nota> notas = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}


	public void adicionarNotas(Nota nota) {
		notas.add(nota);
	}
	
	public float somatoriaDeNotas() {
		float somatoriaDeNotas = 0;
		for (Nota nota : notas) {
			somatoriaDeNotas = somatoriaDeNotas + nota.getValor();
		}
		return (somatoriaDeNotas/notas.size());
	}
	
	public float getMedia() {
		return somatoriaDeNotas();
	}


	public String getNome() {
		return nome;
	}
}
