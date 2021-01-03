package br.wattyla.primeiroprojetojdbc.aplicacao;

import java.util.Date;
import java.util.List;

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
		
		System.out.println("***** Teste: consultaPeloId *********");
		Vendedor vendedor = vendedorDao.consultaPeloId(3);
		System.out.println(vendedor);
		
		System.out.println("\n***** Teste: cunsultaPeloDepartamento *********");
		
		List<Vendedor> listaVendedores = vendedorDao.cunsultaPeloDepartamento(vendedor.getDepartamento());

		listaVendedores.forEach(System.out::println);
		
		System.out.println("\n***** Teste: cunsultaPeloIdDepartamento *********");
		
		List<Vendedor> listaVendedores2 = vendedorDao.cunsultaPeloIdDepartamento(1);

		listaVendedores2.forEach(System.out::println);
		
		System.out.println("\n***** Teste: cunsultaTodos *********");
		
		List<Vendedor> listaVendedores3 = vendedorDao.cunsultaTodos();

		listaVendedores3.forEach(System.out::println);
		
		System.out.println("\n***** Teste: insert *********");
		
		Vendedor vendedorGreg = new Vendedor(null, "João", "joao@gmail.com", new Date(), 4000.00, 
				new Departamento(1,"informatida"));
		vendedorDao.insert(vendedorGreg);
		System.out.println("Vendedor inserido com o id: "+ vendedorGreg.getId());
	}

}
