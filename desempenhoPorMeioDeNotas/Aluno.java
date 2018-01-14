package com.treinamento;
import java.util.ArrayList;
import java.util.List;


class Aluno{
	
	private String nome;
	private List <Nota> notas = new ArrayList<>();
	private List <Materia> materias = new ArrayList<>();
	
	public void nomeDoAluno(String nome) {
		this.nome = nome;
	}
	
	public float somatoriaDeTodasNotas() {
		float somatoriaDeNotas = 0;
		for (Nota nota : notas) {
			somatoriaDeNotas = somatoriaDeNotas + nota.getValor(); 
		}			
		return somatoriaDeNotas;
	}
	
	public String listarTodasAsMaterias() {
		StringBuilder nomeDaMateriaBuilder = new StringBuilder();
		for (Materia materia : materias) {
			nomeDaMateriaBuilder.append(materia.getMateria().concat(" "));
		}
		String nomeDaMateria = nomeDaMateriaBuilder.toString();
		
		return nomeDaMateria;
	}
	
	public void adicionarNotasEMaterias(Nota nota, Materia materia) {
		notas.add(nota);
		materias.add(materia);
	}
	
	public float getMediaTodas() {
		return (somatoriaDeTodasNotas()/notas.size());
	}
	

	public String getNome() {
		return nome;
	}

	public float MediaPorMateria(int codMateria) {
		for (int i = 0; i < this.materias.size(); i++) {
			if (this.materias.get(i).getCodigo() == codMateria) {
				System.out.println(codMateria+ " " + " " +this.materias.get(i).getCodigo() );
			}
		}
		return 8.2f;
	}
	
}