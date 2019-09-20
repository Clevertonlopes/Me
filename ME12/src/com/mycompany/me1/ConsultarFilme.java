package com.mycompany.me1;

public class ConsultarFilme extends ItemDeMenu {

    @Override
    public String getDescricao() {
        return "Consultar Filme";
    }

    @Override
    public boolean executar() {
        String nomeFilme = leitor.lerString("Nome do Filme: ");

        Filme filme = dao.pesquisar(nomeFilme);

        if (filme == null) {
            System.out.println("Filme não encontrado!");
        } else {
            System.out.println("Nome do Filme: " + filme.getNomeFilme());
            for (int i = 0; i < filme.getNota().size(); i++) {
                System.out.print(filme.getNota().get(i));
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
        return false;
    }

}
