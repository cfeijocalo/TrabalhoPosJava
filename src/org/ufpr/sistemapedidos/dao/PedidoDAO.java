package org.ufpr.sistemapedidos.dao;

import java.sql.SQLException;
import java.util.List;

import org.ufpr.sistemapedidos.dao.generic.GenericDAO;
import org.ufpr.sistemapedidos.model.Pedido;

public class PedidoDAO implements GenericDAO<Pedido> {

	@Override
	public Pedido selectById(Long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> selectAll(String condition) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Pedido entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pedido entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Pedido entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
