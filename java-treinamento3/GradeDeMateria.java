package com.treinamento;

import java.util.ArrayList;
import java.util.List;

class GradeDeMateria{
	private List<Materia> materias = new ArrayList<>();
	
	public void adicionarMateria(Materia materia) {
		materias.add(materia);
	}
}