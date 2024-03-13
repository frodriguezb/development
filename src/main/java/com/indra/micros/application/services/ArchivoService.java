package com.indra.micros.application.services;
import java.util.List;
import java.util.UUID;

import com.indra.micros.dominio.model.Archivo;

public interface ArchivoService {
	Archivo cargarArchivo(Archivo request);
	Archivo getArchivo(UUID id);
	List<Archivo> getAll();
	Integer deletArchivo(UUID id );
	Integer updateArchivo(Archivo request);
}