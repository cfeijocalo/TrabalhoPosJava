package org.ufpr.sistemapedidos.dao;

import java.sql.SQLException;
import java.util.List;

import org.ufpr.sistemapedidos.dao.generic.GenericDAO;
import org.ufpr.sistemapedidos.model.Produto;

public class ProdutoDAO implements GenericDAO<Produto> {

	@Override
	public Produto selectById(Long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> selectAll(String condition) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Produto entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Produto entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Produto entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
