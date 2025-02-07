package com.hlc.cliente_uno_a_muchos_pedido.entidad;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProd;
	
	@NotBlank(message = "El nombre de usuario no puede estar vacío")
	@Column(nullable = false, unique = true)
	private String nombre;
	
	@NotBlank(message = "La descripción no puede estar vacía")
	@Column(nullable = false)
	private String descripcion;
	
	@NotBlank(message = "El peso no puede estar vacío")
	@Column(nullable = false)
	private float peso;
	
	@NotBlank(message = "El stock no puede estar vacío")
	@Column(nullable = false)
	private int stock;
	
	@ManyToMany(mappedBy = "productos")
	private List<Pedido> pedidos;
}
