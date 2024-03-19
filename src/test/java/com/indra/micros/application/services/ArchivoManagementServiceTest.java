package com.indra.micros.application.services;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.multipart.MultipartFile;

@ExtendWith(MockitoExtension.class)
class ArchivoManagementServiceTest {

	@InjectMocks
	ArchivoManagementService archivoManagementService;
	
	@Mock
	UploadArchivoService uploadArchivoService;
	
	@Test
	void whenCargarImagen_then_ok() throws IOException {
		MultipartFile file = mock(MultipartFile.class);
		//Mockito.when(uploadArchivoService.saveArchivo(file));
		boolean resp = archivoManagementService.cargarImagen(file);
		assertTrue(resp);
	}

	@Test
	void whenCargarImagen_then_false() throws IOException {
		MultipartFile file = mock(MultipartFile.class);
		//Mockito.when(uploadArchivoService.saveArchivo(file)).doThrow();
		Mockito.doThrow(new IOException()).when(uploadArchivoService).saveArchivo(file);
		boolean resp = archivoManagementService.cargarImagen(file);
		assertFalse(resp);
	}
}