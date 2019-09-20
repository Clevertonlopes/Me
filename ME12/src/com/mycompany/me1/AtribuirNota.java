package com.mycompany.me1;

public class AtribuirNota extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Adicionar Nota";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Nome do filme: ");

		Filme filme = dao.pesquisar(matricula);

		if (filme == null) {
			System.out.println("Filme não encontrado!");
		}
		else {
			System.out.println("Nome do Filme: " + filme.getNomeFilme());
			System.out.println("Nome do Autor: " + filme.getNomeAutor());
			
			
			double nota = leitor.lerDouble("Adicionar Notar de 0 a 5: ");
			
			
			
			dao.atualizar(filme.getNomeFilme(),nota);
		}

		return false;
	}

}
