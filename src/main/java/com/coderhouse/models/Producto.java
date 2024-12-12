package com.coderhouse.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Producto {
	
	private Long id;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String marca;
	private String proveedor;
	private String imgUrl;
	
	
	private int cantidadStock;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private BigDecimal descuento;
	private String moneda;
	 
	
	private Date fechaAlta;
	private Date fechaModificacion;
	
	private boolean estadoActivo;
	
	
}
