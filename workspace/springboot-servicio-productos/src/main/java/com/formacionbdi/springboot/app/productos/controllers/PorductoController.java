package com.formacionbdi.springboot.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductosService;

@RestController // indica que es un controllador de spring
public class PorductoController {
	
	@Autowired // inyecta clase service
	private IProductosService productosService;
	
	@GetMapping("/listar") // mapea
	public List<Producto> listar(){
		return productosService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) { // pasa valor por ruta url
		return productosService.findById(id);
	}

}
