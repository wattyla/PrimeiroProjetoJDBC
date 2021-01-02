package br.wattyla.PrimeiroProjetoJDBC.aplicacao;

import br.wattyla.PrimeiroProjetoJDBC.Model.Entidades.Departamento;

public class Programa {

	public static void main(String[] args) {
		//Aula de recupera dos dados do Banco (consulta).
		//new RecuperacaoDados().recuperaDadosBanco();
		//Aula de insercão de dados no Banco (insert).
		//new InsercaoDados().insercaoDados();
		Departamento obj = new Departamento(1, "Livraria");
		System.out.println(obj);
	}

}
