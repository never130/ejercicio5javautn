package libreria;

public class Revista extends Producto {
	// Constructor de la clase Revista
	public Revista(double precio, int cantidad, int codigo, String titulo, String editor, String fechaPublicacion) {
		super(precio, cantidad, codigo, titulo, editor, fechaPublicacion);
	}

	// Metodos heredados de Producto.
	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String getEditor() {
		return editor;
	}

}
