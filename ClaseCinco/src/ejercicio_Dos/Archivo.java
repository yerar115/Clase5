package ejercicio_Dos;

import java.nio.file.Files;

import java.nio.file.Paths;

public class Archivo {
	
	private String ruta;
	private String File;
	
	public String getFile() {
		return File;
	}

	public void setFile(String file) {
		File = file;
	}

	public Archivo() {
		
	}
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public void leerArchivo() {
		
		try {
			
			for (String linea: Files.readAllLines(Paths.get(getRuta()))) {
				setFile(linea);
				System.out.println(linea);
				
			}
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}
	
	
	public void array() {
		
		String array[] = getFile().split(",");
		System.out.println(array[1]);
		
	}

}
