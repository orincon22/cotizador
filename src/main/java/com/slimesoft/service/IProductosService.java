package com.slimesoft.service;

import java.util.List;

import com.slimesoft.model.Producto;

public interface IProductosService {

	List<Producto> buscarTodos();
	void guardar(Producto producto);
}
