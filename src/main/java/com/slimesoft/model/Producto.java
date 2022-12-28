package com.slimesoft.model;

public class Producto {
	
	private int id;
	private String nombre;
	private String codigo;
	private Float precio;
	private Float existencia;
	
	public Producto(String nombre, String codigo, Float precio, Float existencia, Integer id) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
        this.id = id;
    }

    public Producto(String nombre, String codigo, Float precio, Float existencia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    public Producto() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Float getExistencia() {
		return existencia;
	}

	public void setExistencia(Float existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio
				+ ", existencia=" + existencia + "]";
	}
	

}
