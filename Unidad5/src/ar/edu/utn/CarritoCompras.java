package ar.edu.utn;

import java.util.ArrayList;

class CarritoCompra {

	private ArrayList<ItemCarrito> items;

	// Constructor del arraylist
	public CarritoCompra() {
		this.items = new ArrayList<ItemCarrito>();
	}

	// Metodos agregar y quitar item
	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	// Creamos una funcion para mostrar el carrito
	public void mostrarCarrito() {
		if (items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for (ItemCarrito i : items) {
				i.mostrarItem();
			}
		}

	}

	// Creo una funcion TOTAL
	public float getTotal() {
		float total = 0;
		for (ItemCarrito i : items) {
			try {
				total += i.precio();
			} catch (NoHayStockException e) {
				// No hacer nada si no hay stock
			}
		}
		System.out.println("Total: " + total);
		return total;
	}
}