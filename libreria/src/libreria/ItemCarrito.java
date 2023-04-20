package libreria;

public class ItemCarrito {
	// Declaro clase Producto y cantidad
	Producto producto;
	int cantidad;
	boolean esFisica;

	// Constructor de la clase
	public ItemCarrito(Producto producto, int cantidad, boolean esFisica) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.esFisica = esFisica;
	}

	// Condicionamos si la copia es fisica o digital
	public String getCopia() {
		return esFisica ? "Fisica" : "Digital";
	}

	// Hacemos el calculo con los porcentajes dados
	public double precio() {
		if (producto instanceof Libro) {
			// es libro
			if (esFisica) {
				return producto.getPrecio() * 1.18 * cantidad;

			} else {
				return producto.getPrecio() * 1.08 * cantidad;
			}
		} else {
			// es revista
			if (esFisica) {
				return producto.getPrecio() * 1.22 * cantidad;

			} else {
				return producto.getPrecio() * 1.12 * cantidad;
			}
		}
	}

}
