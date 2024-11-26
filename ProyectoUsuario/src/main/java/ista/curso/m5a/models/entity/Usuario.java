package ista.curso.m5a.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	@Column(length = 15)
	private String Nombre;
	private String Clave;
	private String Email;
	private Boolean Estado;
	
	
	
	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getClave() {
		return Clave;
	}



	public void setClave(String clave) {
		Clave = clave;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public Boolean getEstado() {
		return Estado;
	}



	public void setEstado(Boolean estado) {
		Estado = estado;
	}



	private static  final long serialVersionUID=1L;
}
