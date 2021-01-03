package br.wattyla.primeiroprojetojdbc.Model.dao;

import java.util.List;

import br.wattyla.primeiroprojetojdbc.Model.Entidades.Departamento;
import br.wattyla.primeiroprojetojdbc.Model.Entidades.Vendedor;

public interface VendedorDao {
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deletarPeloId(Integer id);
	Vendedor consultaPeloId(Integer id);
	List<Vendedor> cunsultaTodos();
	List<Vendedor> cunsultaPeloDepartamento(Departamento departamento);
	List<Vendedor> cunsultaPeloIdDepartamento(Integer id);
}
