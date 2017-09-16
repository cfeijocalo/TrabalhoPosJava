package org.ufpr.sistemapedidos.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ufpr.sistemapedidos.dao.generic.GenericDAO;
import org.ufpr.sistemapedidos.model.ItemDoPedido;
import org.ufpr.sistemapedidos.util.ConnectionFactory;

public class ItemDoPedidoDAO implements GenericDAO<ItemDoPedido> {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	@Override
	public ItemDoPedido selectById(Long id) throws SQLException {
		ItemDoPedido item = null;
		String query = "";

		try {
			conn = ConnectionFactory.create();
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();

			ProdutoDAO pDao = new ProdutoDAO();
			if (rs.next()) {
				item = new ItemDoPedido(rs.getInt("quantidade"), 
						pDao.selectById(rs.getLong("id_produto")));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
			conn.close();
		}

		return item;
	}

	@Override
	public List<ItemDoPedido> selectAll(String condition) throws SQLException {
		List<ItemDoPedido> itens = new ArrayList<ItemDoPedido>();
		String query = "";

		try {
			conn = ConnectionFactory.create();
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();

			ProdutoDAO pDao = new ProdutoDAO();
			while (rs.next()) {
				ItemDoPedido item = new ItemDoPedido(rs.getInt("quantidade"), 
						pDao.selectById(rs.getLong("id_produto")));
				itens.add(item);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
			rs.close();
			stmt.close();
			conn.close();
		}

		return itens;
	}

	@Override
	public boolean insert(ItemDoPedido entity) throws SQLException {
		boolean result = false;
		String query = "";

		try {
			conn = ConnectionFactory.create();
			stmt = conn.prepareStatement(query);

			if (stmt.execute()) {
				result = true;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			conn.close();
		}
		return result;
	}

	@Override
	public boolean update(ItemDoPedido entity) throws SQLException {
		boolean result = false;
		String query = "";

		try {
			conn = ConnectionFactory.create();
			stmt = conn.prepareStatement(query);

			if (stmt.execute()) {
				result = true;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			conn.close();
		}
		return result;
	}

	@Override
	public boolean delete(ItemDoPedido entity) throws SQLException {
		boolean result = false;
		String query = "";

		try {
			conn = ConnectionFactory.create();
			stmt = conn.prepareStatement(query);

			if (stmt.execute()) {
				result = true;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			conn.close();
		}
		return result;
	}

}
