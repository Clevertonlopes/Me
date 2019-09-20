/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.me1;

import java.util.Scanner;

/**
 *
 * @author 1171143394
 */
  public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		ItemDeMenu[] principal = new ItemDeMenu[] { 
				new CadastrarFilmes(),
				new AtribuirNota(),
                                new ConsultarFilme(),
				new Removerfilme(),
				new Sair() 
		};

		boolean sair = false;
		do {
			for (int i = 0; i < principal.length; i++) {
				System.out.println(i + " - " + principal[i].getDescricao());
			}
			System.out.print("Qual a opção desejada: ");
			int opcao = Integer.parseInt(console.nextLine());

			sair = principal[opcao].executar();
		} while (!sair);
	}

}
