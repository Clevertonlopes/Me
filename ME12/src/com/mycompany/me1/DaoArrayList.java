/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.me1;

import java.util.ArrayList;

/**
 *
 * @author 1171143394
 */
 public class DaoArrayList implements Dao {

	private static ArrayList<Filme> bd = new ArrayList<Filme>();

	@Override
	public void inserir(Filme filme) {
		bd.add(filme);
	}

	@Override
	public ArrayList<Filme> listar() {
		return bd;
	}

	@Override
	public Filme pesquisar(String nomeFilme) {
		Filme resultado = null;

		for (int i = 0; i < bd.size(); i++) {
			Filme atual = bd.get(i);
			
			if (atual.getNomeFilme().equals(nomeFilme)) {
				resultado = atual;
				break;
			}
		}

		return resultado;
	}
	
	@Override
	public void atualizar(String nome,Double nota) {
            Filme filme = new Filme("",nome,0.0);
            Filme pesquisado = pesquisar(filme.getNomeFilme());
		
		pesquisado.setNota(nota);
	}
	
	public void remover(Filme filme) {
		bd.remove(filme);
	}

   

       
}
