package com.indra.micros.application.services;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.indra.micros.dominio.model.Archivo;

@Service
public class ArchivoManagementService implements ArchivoService {

	@Override
	public Archivo cargarArchivo(Archivo request) {
		Archivo archivoResponse = new Archivo(null, null, null);
		archivoResponse.setId(UUID.randomUUID());
		return archivoResponse;
	}

	@Override
	public Archivo getArchivo(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Archivo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deletArchivo(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateArchivo(Archivo request) {
		// TODO Auto-generated method stub
		return null;
	}

}