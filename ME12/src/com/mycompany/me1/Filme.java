/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.me1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author 1171143394
 */
public class Filme {

	private String nomeAutor, nomeFilme;
	private ArrayList<Double> nota;

	public Filme(String nomeFilme) {
		this(nomeFilme, null);
	}
	
	public Filme(String nomeAutor, String nomeFilme) {
		this(nomeFilme, nomeAutor, 0);
	}

	public Filme(String nomeAutor, String nomeFilme, double nota) {
		this.nomeAutor = nomeAutor;
		this.nomeFilme = nomeFilme;
		this.nota = new ArrayList<>();
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public ArrayList<Double> getNota() {
            return this.nota;
        }

	public void setNota(double nota) {
		this.nota.add(nota);
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filme other = (Filme) obj;
       
        return other.nomeFilme.equals(this.nomeFilme);
    }
        
        
	
}
