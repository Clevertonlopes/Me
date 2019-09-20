package com.mycompany.me1;

import Io.Leitor;

public abstract class ItemDeMenu {
	
	protected Leitor leitor;
	protected Dao dao;
	
	public ItemDeMenu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}
