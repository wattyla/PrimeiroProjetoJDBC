package br.wattyla.primeiroprojetojdbc.Model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.wattyla.primeiroprojetojdbc.Model.Entidades.Departamento;
import br.wattyla.primeiroprojetojdbc.Model.Entidades.Vendedor;
import br.wattyla.primeiroprojetojdbc.Model.dao.VendedorDao;
import br.wattyla.primeiroprojetojdbc.db.DB;
import br.wattyla.primeiroprojetojdbc.db.DbException;

public class VendedorDaoJDBC implements VendedorDao {
	
	private Connection conn;
	
	public VendedorDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Vendedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Vendedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPeloId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor consultaPeloId(Integer id) {
		PreparedStatement preparedStatement = null;
		ResultSet resultado = null;
		try {
			preparedStatement = conn.prepareStatement(""
					+ "SELECT t1.*, t2.Name as DepName"
					+ " FROM coursejdbc.vendedor as t1,"
					+ " coursejdbc.departamento as t2"
					+ " WHERE t1.DepartamentoId = t2.Id and"
					+ "	   t1.Id = ?; ");
			preparedStatement.setInt(1, id);
			
			resultado = preparedStatement.executeQuery();
			if (resultado.next()) {
				Vendedor vendedor = new Vendedor(resultado.getInt("id"),
						resultado.getString("Name"),
						resultado.getString("Email"),
						resultado.getDate("DataNascimento"),
						resultado.getDouble("SalarioBase"),
						new Departamento(
								resultado.getInt("DepartamentoId"),
								resultado.getString("DepName")));
				return vendedor;
			}
			return null;
		} catch (Exception e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.fecharResultSet(resultado);
			DB.fecharStatement(preparedStatement);
		}
	}

	@Override
	public List<Vendedor> cunsultaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
