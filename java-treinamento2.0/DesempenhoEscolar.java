package caio.treinamento;

import caio.treinamento.MediaTurmas.NotasEscolares;

public class DesempenhoEscolar {
	public static void main(String [] args) {
		Aluno aluno = new Aluno();
		MediaTurmas alunoNovo = new MediaTurmas();
		aluno.setNome("Caio");
		aluno.setDataNascimento("09/12/1996");
		
		
		System.out.println("Nome do Aluno: " + aluno.getNome());
	}
}