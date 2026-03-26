public class Main {
    public static void main(String[] args) {
        System.out.println("===== Bienvenido a la Tienda Digital =====");
        System.out.println();

        // ── Integrante 1: Producto ──────────────────────────────
        Producto producto1 = new Producto("Laptop", 1200.0, 10, "Electrónica");
        producto1.mostrarInfo();
        producto1.aplicarDescuento(10); // ejemplo: 10% descuento
        producto1.verificarStock(5);    // verificamos si hay stock para 5 unidades

        // ── Integrante 2: Cliente ───────────────────────────────
        Cliente cliente1 = new Cliente("David", "david@email.com", 2000.0);
        cliente1.mostrarPerfil();
        cliente1.realizarCompra(1200.0); // monto de la compra
        cliente1.mostrarSaldo();

        // ── Integrante 3: Carrito ───────────────────────────────
        Carrito carrito = new Carrito("Carrito de David");
        carrito.agregarProducto("Mouse", 25.0);
        carrito.agregarProducto("Teclado", 45.0);
        carrito.calcularTotal();
        carrito.mostrarResumen();

        System.out.println();
        System.out.println("===== Fin de la ejecución =====");
    }
}