package org.ufpr.sistemapedidos.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private int id;
	private Date data;
	private Cliente cliente;
	private ArrayList<ItemDoPedido> itens;

	public Pedido(int id, Date data, Cliente cliente, ArrayList<ItemDoPedido> itens) {
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		this.itens = itens;
	}

	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemDoPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemDoPedido> itens) {
		this.itens = itens;
	}

}
