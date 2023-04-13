
package ar.edu.utn;

public class ItemCarrito {

	Producto producto;
	int cantidad;

	public double precio() throws NoHayStockException {
		if (!producto.hayStock()) {
			throw new NoHayStockException(producto);
		}
		return this.cantidad * this.producto.getPrecio();
	}

	public ItemCarrito(Producto producto, int cantidad) {
		// if (producto.cantidad>=cantidad)
		this.producto = producto;
		this.cantidad = cantidad;

	}

	public void mostrarItem() {
		System.out.println("Producto: " + producto.getNombre() + " - cantidad: " + cantidad);
		try {
			System.out.println("Subtotal: " + precio());
		} catch (NoHayStockException e) {
			System.out.println("No hay stock del producto");
		}
		System.out.println("-----------------------------------------------------------------");
	}

}
//}
