package libreria;

public class Main {
	/*
	 * Clase principal del programa. Cosas pendientes: - Mejorar la variable
	 * booleana esFisica. - La clase Fecha. - Mostrar todos los atributos del
	 * producto en la consola. - Mejorar los metodos abstractos. - Hacerla lo mas
	 * corta y legible posible.
	 *
	 */
	public static void main(String[] args) {
		// GENERO PRODUCTOS EN DE LA LIBRERIA (Con todos los parametros)
		Producto revista1 = new Revista(1230.10, 100, 31242, "Amor de Fabrica", "Cafe Frio", "8 de Septiembre, 2022.");
		Producto revista2 = new Revista(920.50, 80, 31232, "Tendencias", "ChismeS", "3 de Enero, 2022.");
		Producto libro1 = new Libro(8300.40, 50, 543543, "La Planta", "Pat Johnson", "UTN", "2001.");

		// CREO EL CARRITO DE COMPRAS
		Carrito c = new Carrito();

		// GENERAR ITEMS DE LOS PRODUCTOS, LA CANTIDAD Y SI ES FISICA O NO (DIGITAL)
		ItemCarrito i1 = new ItemCarrito(revista1, 2, true);
		ItemCarrito i2 = new ItemCarrito(libro1, 1, false);
		ItemCarrito i3 = new ItemCarrito(revista1, 1, false);

		// AGREGO O QUITO ITEMS AL CARRITO
		c.agregarItem(i1);
		c.agregarItem(i2);
		c.agregarItem(i3);

		// TOTAL
		c.mostrarProductos();

	}

}
