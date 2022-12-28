package com.slimesoft.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slimesoft.model.Producto;
import com.slimesoft.service.IProductosService;

@RestController
public class ProductosRestController {

	@Autowired
	private IProductosService serviceProductos;
	
	@GetMapping("/api/productos")
	public List<Producto> buscarTodos() {
		return serviceProductos.buscarTodos();
	}
}
