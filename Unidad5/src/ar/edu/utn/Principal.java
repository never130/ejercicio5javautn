package ar.edu.utn;

public class Principal {

	public static void main(String[] args) {

		// GENERO PRODUCTOS EN EL MERCADO (Nombre, descripcion, precio y cantidad)
		Producto p1 = new Producto("LECHE", "Leche entera", 20, 20);
		Producto p2 = new Producto("CAFE", "Cafe instantaneo", 10, 50);
		Producto p3 = new Producto("MATE", "Yerba mate", 8, 50);
		Producto p4 = new Producto("AZUCAR", "Azucar de mesa", 22, 100);
		Producto p5 = new Producto("SAL", "Sal fina de mesa", 150.0, 100);
		Producto p6 = new Producto("Aceite", "Aceite de cocina", 550.50, 20);

		// CREO EL CARRITO DE COMPRAS
		CarritoCompra c = new CarritoCompra();

		// GENERAR ITEMS DE LOS PRODUCTOS Y LA CANTIDAD
		ItemCarrito i1 = new ItemCarrito(p4, 2);
		ItemCarrito i2 = new ItemCarrito(p1, 3);

		// AGREGO ITEMS AL CARRITO
		c.agregarItem(i1);
		c.agregarItem(i2);

		// MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
		c.mostrarCarrito();

		// TOTAL
		c.getTotal();
	}
}
