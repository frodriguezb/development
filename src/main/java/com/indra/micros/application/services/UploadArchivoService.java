package com.indra.micros.application.services;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class UploadArchivoService {
	private String uploadFolder = ".//src//main//resources//files//";
	public void saveArchivo(MultipartFile file) throws IOException{
        if(!file.isEmpty()){
            byte[] bytes = file.getBytes();
            Path path = Paths.get(uploadFolder + file.getOriginalFilename());
            Files.write(path,bytes);
        }
	}
}