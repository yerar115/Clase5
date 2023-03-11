package ejercicio_Uno;

import java.time.LocalDateTime;

public class Carrito {
	
	private String persona;
	private String producto1;
	private String producto2;
	private String producto3;
	private LocalDateTime fechaCompra;
	private float totalCarrito;
	
	public Carrito() {
		
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getProducto1() {
		return producto1;
	}

	public void setProducto1(String producto1) {
		this.producto1 = producto1;
	}

	public String getProducto2() {
		return producto2;
	}

	public void setProducto2(String producto2) {
		this.producto2 = producto2;
	}

	public String getProducto3() {
		return producto3;
	}

	public void setProducto3(String producto3) {
		this.producto3 = producto3;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public float costoFinal() {
		return totalCarrito;
		
	}

}
