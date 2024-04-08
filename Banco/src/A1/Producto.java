package A1;

public abstract class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private double descuento;

    public Producto(String codigo, String nombre, double precio, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public abstract double calcularPrecioFinal();
}