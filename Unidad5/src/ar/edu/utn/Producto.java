package ar.edu.utn;

public class Producto {

	// Declaramos atributos
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidad;
	private static final Double minPrecio = 0.1;

	// Constructores, con todos los parametros
	public Producto(String nombre, String descripcion, double precio, int cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	// Constructor con nombre, precio y cantidad
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	// Constructor con solo el parametro nombre
	public Producto(String nombre) {
		this.nombre = nombre;
		this.precio = minPrecio;
	}

	// Metodos para obtener los atributos
	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// En caso de que haya stock
	public boolean hayStock() {
		if (cantidad > 0)
			return true;
		else
			return false;
	}

	public double getPrecio() {
		return precio;
	}

}
