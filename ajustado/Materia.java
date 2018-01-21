package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String nome;
	private List<Nota> notas = new ArrayList<>();
	private List<Materia> materias = new ArrayList<>();
	
	public Materia(String nome) {
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

	public List<Materia> setMateria(float f) {
		return materias;
	}
}
