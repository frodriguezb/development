package com.indra.micros.dominio;
import java.util.Arrays;
import java.util.UUID;

public class ArchivoItems {
	private UUID id;
	private String nombre;
	private String typo;
	private byte[] Imagen;
	
	public ArchivoItems(UUID id, String nombre, String tipo, byte[] imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.typo = tipo;
		Imagen = imagen;
	}

	public UUID getId() {return id;}
	public void setId(UUID id) {this.id = id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getTypo() {return typo;}
	public void setTypo(String typo) {this.typo = typo;}

	public byte[] getImagen() { return Imagen;}
	public void setImagen(byte[] imagen) { Imagen = imagen;}
	
	@Override
	public String toString() {
		return "ArchivoItems [id=" + id + ", Nombre=" + nombre+ ", Tipo=" + typo + ", Imagen="
				+ Arrays.toString(Imagen) + "]";
	}
}