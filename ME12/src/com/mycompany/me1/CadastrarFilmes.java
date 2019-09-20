package com.mycompany.me1;

public class CadastrarFilmes extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Cadastrar Filme";
	}

	@Override
	public boolean executar() {
		String nomeFilme = leitor.lerString("Nome do Filme: ");
		String nomeAutor = leitor.lerString("Nome do Autor: ");

		Filme filme = new Filme(nomeFilme, nomeAutor);

		dao.inserir(filme);

		System.out.println("Filme cadastrado com sucesso!");

		return false;
	}

}
