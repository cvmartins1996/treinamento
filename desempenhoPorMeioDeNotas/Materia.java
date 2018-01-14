package com.treinamento;


public class Materia {

	private String materia;
	private int codigoMateria = 0;
	
	public Materia(String materia, int codigoMateria) {
		this.materia = materia;
		this.codigoMateria = codigoMateria;
	}

	public int getCodigo() {
		return codigoMateria;
	}
	
	public String getMateria() {
		return materia;
	}
}
