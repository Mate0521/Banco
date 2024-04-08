package A1;

public class Transaccion {
    private double monto;
    private ProductoFinanciero productoFinanciero;
    private String tipo;

    public Transaccion(double monto, ProductoFinanciero productoFinanciero, String tipo) {
        this.monto = monto;
        this.productoFinanciero = productoFinanciero;
        this.tipo = tipo;
    }

    public void registrarTransaccion() {
        if(this.tipo.equalsIgnoreCase("consignacion")) {
            this.productoFinanciero.consignar(this.monto);
        } else if (this.tipo.equalsIgnoreCase("retiro")) {
            this.productoFinanciero.retirar(this.monto);
        } else if (this.tipo.equalsIgnoreCase("pago de credito")) {
            this.productoFinanciero.pagarCredito(this.monto);
        }
    }
}