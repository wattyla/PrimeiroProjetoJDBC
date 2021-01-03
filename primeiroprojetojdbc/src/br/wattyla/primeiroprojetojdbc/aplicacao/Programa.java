package br.wattyla.primeiroprojetojdbc.aplicacao;

import java.util.Calendar;
import java.util.Date;

import br.wattyla.primeiroprojetojdbc.Model.Entidades.Departamento;
import br.wattyla.primeiroprojetojdbc.Model.Entidades.Vendedor;
import br.wattyla.primeiroprojetojdbc.Model.dao.DaoFabrica;
import br.wattyla.primeiroprojetojdbc.Model.dao.VendedorDao;

public class Programa {

	public static void main(String[] args) {
		//Aula de recupera dos dados do Banco (consulta).
		//new RecuperacaoDados().recuperaDadosBanco();
		//Aula de insercão de dados no Banco (insert).
		//new InsercaoDados().insercaoDados();
		VendedorDao vendedorDao = DaoFabrica.criaVendedorDao();
		
		Vendedor vendedor = vendedorDao.consultaPeloId(3);
		
		System.out.println(vendedor);
	}

}
