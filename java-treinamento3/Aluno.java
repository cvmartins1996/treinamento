package com.treinamento;

import java.util.ArrayList;
import java.util.List;

class Aluno{
	private String nome;
	private List<Nota> notas = new ArrayList<>();
	
	public void adicionarNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarNota(Nota nota) {
		notas.add(nota);
	}
	
	public String getNome() {
		return nome;
	}
	
	public float somatoriaDasNotas() {
		float somatoriaDeNotas = 0;
		for (Nota nota : notas) {
			somatoriaDeNotas =  somatoriaDeNotas + nota.getValor();
		}
		return (somatoriaDeNotas/notas.size());
	}

	public float getMedia() {
		return somatoriaDasNotas();
	}
}