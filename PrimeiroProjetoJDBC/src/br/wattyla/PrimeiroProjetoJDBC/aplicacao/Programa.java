package br.wattyla.PrimeiroProjetoJDBC.aplicacao;

import java.util.Calendar;
import java.util.Date;

import br.wattyla.PrimeiroProjetoJDBC.Model.Entidades.Departamento;
import br.wattyla.PrimeiroProjetoJDBC.Model.Entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		//Aula de recupera dos dados do Banco (consulta).
		//new RecuperacaoDados().recuperaDadosBanco();
		//Aula de insercão de dados no Banco (insert).
		//new InsercaoDados().insercaoDados();
		Departamento obj = new Departamento(1, "Livraria");
		System.out.println(obj);
		
		//Data de nacimento
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1989);
		cal.set(Calendar.MONTH, Calendar.OCTOBER);
		cal.set(Calendar.DAY_OF_MONTH, 13);
		Date dataNacimento = cal.getTime();
		
		Vendedor vendedor = new Vendedor(1,"wattyla","wattylaa@hotmail.com", dataNacimento,3500.0,obj);
		System.out.println(vendedor);
	}

}
