package com.treinamento;

public class Regras {
	GerenciamentoNotas nota1 = new GerenciamentoNotas();
	GerenciamentoNotas nota2 = new GerenciamentoNotas();
	GerenciamentoNotas media = new GerenciamentoNotas();
	GerenciamentoNotas mensagem = new GerenciamentoNotas();
	GerenciamentoNotas escolha = new GerenciamentoNotas();
	GerenciamentoNotas recuperacao = new GerenciamentoNotas();
	GerenciamentoNotas sub = new GerenciamentoNotas();
	
	public void Calculo() {
		double prova1;
		double prova2;
		double recuperar;
		
		prova1 = nota1.getNota1();
		prova2 = nota2.getNota2();
		
		media.setMedia((prova1 + prova2)/2 );
		/* 
		 * 
		 * Subsituir os IF's
		 * 
		 * */
		if (media.getMedia() <= 6.0) {
			mensagem.setMensagem("Aluno Reprovado, M�dia do Aluno: " + media.getMedia() + "\n"+ "Aluno Movido para recupera��o");
			if (escolha.getEscolha().equals("sim") || escolha.getEscolha().equals("Sim")) {
				if (sub.getSub().equals("P1")) {
					recuperar = recuperacao.getRecuperacao();
					prova1 = recuperar;
					media.setMedia((prova1 + prova2)/ 2);
					if (media.getMedia() <= 6.0) {
						mensagem.setMensagem("Aluno Reprovado, M�dia do Aluno: " + media.getMedia() + "\n"+ "Aluno dever� refazer o semestre");
					} else {
						mensagem.setMensagem("Aluno Aprovado, M�dia do Aluno: " + media.getMedia());
					}
				} else {
					recuperar = recuperacao.getRecuperacao();
					prova2 = recuperar;
					media.setMedia((prova1 + prova2) / 2);
					if (media.getMedia() <= 6.0) {
						mensagem.setMensagem("Aluno Reprovado, M�dia do Aluno: " + media.getMedia() + "\n"+ "Aluno dever� refazer o semestre");
					} else {
						mensagem.setMensagem("Aluno Aprovado, M�dia do Aluno: " + media.getMedia());
					}
				}
			}
		} else {
			mensagem.setMensagem("Aluno Aprovado, M�dia do Aluno: " + media.getMedia());
		}
	}
}
