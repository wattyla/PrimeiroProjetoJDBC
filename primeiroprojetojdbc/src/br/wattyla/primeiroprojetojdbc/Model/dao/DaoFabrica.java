package br.wattyla.primeiroprojetojdbc.Model.dao;

import br.wattyla.primeiroprojetojdbc.Model.dao.impl.VendedorDaoJDBC;
import br.wattyla.primeiroprojetojdbc.db.DB;

public class DaoFabrica {
	
	public static VendedorDao criaVendedorDao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
}
