public class Carrito {
	private String nombreCliente;
	private String[] productos;
	private double[] precios;
	private int cantidad;

    public Carrito(String nombreCliente){
        this.nombreCliente = nombreCliente;
        this.productos = new String[10];
        this.precios = new double[10];
        this.cantidad = 0;
    }

}