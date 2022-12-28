package com.slimesoft.model;

public class ProductoVendido {
	private Integer id;
	private Float cantidad;
	private Float precio;
	//private Venta venta;
	
	public ProductoVendido(Float cantidad, Float precio, String nombre, String codigo) {
        this.cantidad = cantidad;
        this.precio = precio;
        //this.nombre = nombre;
        //this.codigo = codigo;
        //this.venta = venta;
    }

    public ProductoVendido() {
    }
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getCantidad() {
		return cantidad;
	}
	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ProductoVendido [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
}
