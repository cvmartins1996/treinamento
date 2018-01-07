package com.treinamento;

import javax.swing.JOptionPane;

public class Interface extends Regras {
	
	public void Visualizar() {
		nota1.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null, "Nota da P1: ")));
		nota2.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null, "Nota da P2: ")));
		escolha.setEscolha(JOptionPane.showInputDialog(null, "Aluno fez a recuperação: "));
		sub.setSub(JOptionPane.showInputDialog(null, "Prova a ser substituida: "));
		recuperacao.setRecuperacao(Double.parseDouble(JOptionPane.showInputDialog(null, "Nota da Recuperação: ")));
		
		Calculo();
		
		JOptionPane.showMessageDialog(null, mensagem.getMensagem());
	}
}
