package com.indra.micros.dominio.model;
import java.util.Arrays;
import java.util.UUID;

public class Archivo {
	private UUID id;
	private String NombreArchivo;
	private String Tipo;
	private byte[] Imagen;
	
	public Archivo(UUID id, String nombreArchivo, String tipo, byte[] imagen) {
		super();
		this.id = id;
		NombreArchivo = nombreArchivo;
		Tipo = tipo;
		Imagen = imagen;
	}
	
	public UUID getId() {return id;}
	public void setId(UUID id) {this.id = id;}

	public String getNombreArchivo() {return NombreArchivo;}
	public void setNombreArchivo(String nombreArchivo) { NombreArchivo = nombreArchivo;}

	public String getTipo() { return Tipo;}
	public void setTipo(String tipo) { Tipo = tipo;}

	
	public byte[] getImagen() { return Imagen;}
	public void setImagen(byte[] imagen) { Imagen = imagen;}

	@Override
	public String toString() {
		return "Archivo [id=" + id + ", NombreArchivo=" + NombreArchivo + ", Tipo=" + Tipo + ", Imagen="
				+ Arrays.toString(Imagen) + "]";
	}
}