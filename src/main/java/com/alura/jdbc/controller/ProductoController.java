package com.alura.jdbc.controller;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;
import com.alura.jdbc.dao.ProductoDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoController {

	private ProductoDAO productoDAO;

	public ProductoController(){
		this.productoDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());
	}

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id){
		// TODO
		return productoDAO.modificar(nombre,descripcion,cantidad,id);
	}

	public int eliminar(Integer id){
		// TODO
		return productoDAO.eliminar(id);
	}

	public List<Producto> listar(){
		// TODO
		return productoDAO.listar();
	}

    public void guardar(Producto producto, Integer categoriaId){
		producto.setCategoriaId(categoriaId);
		productoDAO.guardar(producto);
	}
}
