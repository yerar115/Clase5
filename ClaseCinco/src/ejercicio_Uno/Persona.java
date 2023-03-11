package ejercicio_Uno;

import java.time.LocalDateTime;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDateTime fechaNacimiento;
	private int edad;
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int Edad() {
		
		return edad;
	}

}
