package com.indra.micros.application.services;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.indra.micros.dominio.model.Archivo;

@Service
public class ArchivoManagementService implements ArchivoService {

    @Autowired
    private UploadArchivoService uploadFileService;
    
	@Override
	public Archivo cargarArchivo(Archivo request) {
		Archivo archivoResponse = new Archivo(null, null, null, null);
		archivoResponse.setId(UUID.randomUUID());
		archivoResponse.setNombreArchivo(request.getNombreArchivo());
		archivoResponse.setTipo(request.getTipo());
		archivoResponse.setImagen(request.getImagen());
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

	public boolean cargarImagen(MultipartFile file) throws IOException {
		if (!file.isEmpty()) {
			try {
				uploadFileService.saveArchivo(file);
			} catch(IOException err) {
				System.out.println("Err: " + err);
				return false;
			}
		}
		return true;
	}
	
	public boolean validaFechaFile(String fecha) {
		boolean validaFecha = valiDate(fecha.substring(fecha.length()-10, fecha.length()-4));
		return validaFecha;
	}
	
	private boolean valiDate(String fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		sdf.setLenient(false);
		try {
			sdf.parse(fecha);
			System.out.println("Fecha Válida: " + fecha);
		} catch(Exception e) {
			System.out.println("Fecha No Válida: " + fecha);
			return false;
		}
		return true;
	}
}