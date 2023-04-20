package libreria;

public abstract class Producto {
	// Declaramos variables para las clases hijas, Libro y Revista
	protected double precio;
	protected int cantidad;
	protected int codigo;
	protected String titulo;
	protected String editor;
	protected String fechaPublicacion;

	// Constructor del producto con todos sus parametros
	public Producto(double precio, int cantidad, int codigo, String titulo, String editor, String fechaPublicacion) {
		this.precio = precio;
		this.cantidad = cantidad;
		this.codigo = codigo;
		this.titulo = titulo;
		this.editor = editor;
		this.fechaPublicacion = fechaPublicacion;
	}

	// Para modificar los parametros del titulo
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Obtencion del precio
	public double getPrecio() {
		return precio;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	// Metodos abstractos para implementar en Libro y Revista
	public abstract int getCodigo();

	public abstract String getEditor();

	public abstract String getTitulo();

}
