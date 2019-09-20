package com.mycompany.me1;



public class Removerfilme extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Remover filme";
	}

	@Override
	public boolean executar() {
		String nomeFilme = leitor.lerString("Nome do Filme: ");
		
		Filme aluno = dao.pesquisar(nomeFilme);
		
		if (aluno == null) {
			System.out.println("Filme não encontrado!");
		}
		else {
			Filme filmeParaRemover = new Filme(nomeFilme);
			
			dao.remover(filmeParaRemover);
		}
		
		return false;
	}

}
