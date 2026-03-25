public class Cliente {
    private String nombre;
    private String correo;
    private double saldo;
    private int totalCompras;

// Constructor: 
public Cliente(String nombre, String correo, double saldo) {
    this.nombre = (nombre == null || nombre.trim().isEmpty())
            ? "Sin nombre"
            : nombre.trim();

    this.correo = (correo != null && correo.contains("@") && correo.indexOf("@") < correo.lastIndexOf("."))
            ? correo
            : "sin@email.com";

    this.saldo = (saldo < 0) ? 0 : saldo;

    this.totalCompras = 0;
}

}