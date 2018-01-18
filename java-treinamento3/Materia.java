package com.treinamento;

import java.util.ArrayList;
import java.util.List;

class Materia{

	private String materia;
	private List<Nota> notas = new ArrayList<>();

	public Materia(String materia) {
		this.materia = materia;
	}

	public void adiconarNota(Nota nota) {
		notas.add(nota);
		System.out.println(nota.getValor());
	}

	public String getMateria() {
		return materia;
	}

	public float getMedia() {
		return 0f;
	}
	
}