package caio.treinamento;

import java.util.ArrayList;


public class MediaTurmas {
	public class NotasEscolares{
		double nota;
		
		void notaAluno(double nota) {
			this.nota += nota;
		}
		void apresentaNota() {
			System.out.println("Nota: "+ this.nota);
		}
	}
	
	public  class AlunoNovo{
		ArrayList<NotasEscolares> listaNotas = new ArrayList<NotasEscolares>();
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		public  void cadastrarAluno(Aluno aluno) {
			listaAlunos.add(aluno);
			System.out.println("Novo Aluno: "+ aluno);
		}
		void inserirNotas(NotasEscolares novaNota) {
			// Aluno precisa ter duas notas
			listaNotas.add(novaNota);
		}
	}
	
	public class DesempenhoSemestral{
		double media;
		AlunoNovo alunoNovo;
		
		public AlunoNovo getAlunoNovo() {
			return alunoNovo;
		}
		public void setAlunoNovo(AlunoNovo alunoNovo) {
			this.alunoNovo = alunoNovo;
		}
		
	}
}
