package com.slimesoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slimesoft.model.Producto;
import com.slimesoft.service.IProductosService;

@Controller
@RequestMapping("/productos")
public class ProductosController {

	@Autowired
	private IProductosService productosService;
	
	@GetMapping("/index")
	private String mostrarIndex(Model model) {
		List<Producto> lista = productosService.buscarTodos();
		model.addAttribute("productos", lista);
		return "/productos/listProductos";
	}
	
	@GetMapping("/create")
	public String crear() {
		return "/productos/formProductos";
	}
	
	@PostMapping("/save")
	public String guardar(Producto producto, RedirectAttributes attributes) {
		productosService.guardar(producto);
		attributes.addFlashAttribute("msg", "Producto guardado!");
		return "redirect:/productos/index";
	}
}
