package com.slimesoft.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.slimesoft.model.ProductoParaVender;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@GetMapping("/")
	private String mostrarIndex() {
		return "home";
	}
	
	private ArrayList<ProductoParaVender> obtenerCarrito(HttpServletRequest request){
		ArrayList<ProductoParaVender> carrito = (ArrayList<ProductoParaVender>)request.getSession().getAttribute("carrito");
		if(carrito == null) {
			carrito = new ArrayList<>();
		}
		return carrito;
	}
	
	private void guardarCarrito(ArrayList<ProductoParaVender> carrito, HttpServletRequest request) {
		request.getSession().setAttribute("carrito", carrito);
		
	}
}
