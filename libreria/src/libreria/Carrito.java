package libreria;

import java.util.ArrayList;

public class Carrito {

	// Instanciamos un ArrayList para ItemCarrito
	private ArrayList<ItemCarrito> items;

	// Constructor del Arraylist
	public Carrito() {
		this.items = new ArrayList<ItemCarrito>();
	}

	// Metodos agregar y quitar items de ItemCarrito
	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	// Metodo para mostrar en el carrito el total y subtotal de productos.
	public void mostrarProductos() {
		double total = 0.0;
		for (ItemCarrito item : items) {
			System.out.println(item.producto.getTitulo() + " - Editorial: " + item.producto.getEditor()
					+ " - Publicacion: " + item.producto.getFechaPublicacion());
			System.out.println("Copia " + item.getCopia());
			System.out.println("Codigo: " + item.producto.getCodigo() + " - Cantidad: " + item.cantidad);
			System.out.printf("Subtotal: %.2f\n", item.precio());
			System.out.println("-----------------------------------------------------------------");
			total += item.precio();
		}
		System.out.printf("Total: %.2f\n", total);
	}

}
