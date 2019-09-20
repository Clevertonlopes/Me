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
public interface Dao {

	void inserir(Filme filme);

	ArrayList<Filme> listar();

	Filme pesquisar(String nomeFilme);
	
	void atualizar(String nome,Double nota);
	
	void remover(Filme filme);

}
