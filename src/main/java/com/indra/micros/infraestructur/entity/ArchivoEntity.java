package com.indra.micros.infraestructur.entity;
import java.util.UUID;

public class ArchivoEntity {
	private UUID id;
	private String NombreArchivo;
	private String Tipo;
	
	public ArchivoEntity(UUID id, String nombreArchivo, String tipo) {
		super();
		this.id = id;
		NombreArchivo = nombreArchivo;
		Tipo = tipo;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNombreArchivo() {
		return NombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		NombreArchivo = nombreArchivo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Archivo [id=" + id + ", NombreArchivo=" + NombreArchivo + ", Tipo=" + Tipo + "]";
	}
}