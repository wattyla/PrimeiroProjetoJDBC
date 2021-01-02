package br.wattyla.primeiroprojetojdbc.Model.dao;

import java.util.List;

import br.wattyla.primeiroprojetojdbc.Model.Entidades.Departamento;

public interface DepartamentoDao {
	void insert(Departamento obj);
	void update(Departamento obj);
	void deletarPeloId(Integer id);
	Departamento consultaPeloId(Integer id);
	List<Departamento> cunsultaTodos();
	
}
