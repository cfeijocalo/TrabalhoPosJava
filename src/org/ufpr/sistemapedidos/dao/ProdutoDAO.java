package org.ufpr.sistemapedidos.dao;

import java.util.List;

import org.ufpr.sistemapedidos.dao.generic.GenericDAO;
import org.ufpr.sistemapedidos.model.Produto;

public class ProdutoDAO implements GenericDAO<Produto> {

	@Override
	public Produto selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> selectAll(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Produto entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Produto entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Produto entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
