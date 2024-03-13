package com.indra.micros.dominio;
import java.util.UUID;

public class ArchivoItems {
	private UUID id;
	private String nombre;
	private String typo;
	
	public ArchivoItems(UUID id, String nombre, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.typo = tipo;
	}

	public UUID getId() {return id;}
	public void setId(UUID id) {this.id = id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getTypo() {return typo;}
	public void setTypo(String typo) {this.typo = typo;}

	@Override
	public String toString() {
		return "ArchivoItems [id=" + id + ", nombre=" + nombre + ", typo=" + typo + "]";
	}	
}