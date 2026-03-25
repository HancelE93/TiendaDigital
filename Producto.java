public class Producto {

    // Atributos
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    // Constructor
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Método mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

    // Método aplicarDescuento()
    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        double precioFinal = precio - descuento;

        System.out.println("Descuento del " + porcentaje + "%: -$" + descuento);
        System.out.println("Precio con descuento: $" + precioFinal);
    }

    // Método verificarStock()
    public void verificarStock(int cantidad) {
        if (cantidad <= stock) {
            System.out.println("Disponible: " + stock);
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}