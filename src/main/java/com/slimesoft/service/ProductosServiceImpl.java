package com.slimesoft.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.slimesoft.model.Producto;

@Service
public class ProductosServiceImpl implements IProductosService {

	private List<Producto> lista = null;
	
	public ProductosServiceImpl() {
lista = new LinkedList<Producto>();
		
		Producto producto1 = new Producto();
		producto1.setId(1);
		producto1.setNombre("L15");
		producto1.setCodigo("123");
		producto1.setPrecio(300f);
		producto1.setExistencia(10f);
		
		Producto producto2 = new Producto();
		producto2.setId(2);
		producto2.setNombre("P54");
		producto2.setCodigo("123456");
		producto2.setPrecio(400f);
		producto2.setExistencia(20f);
		
		Producto producto3 = new Producto();
		producto3.setId(3);
		producto3.setNombre("KEIA1");
		producto3.setCodigo("123456789");
		producto3.setPrecio(500f);
		producto3.setExistencia(30f);
		
		lista.add(producto1);
		lista.add(producto2);
		lista.add(producto3);
	}
	@Override
	public List<Producto> buscarTodos() {
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		lista.add(producto);
	}

}
