package A1;

public class TarjetaCredito implements ProductoFinanciero {
    private double creditoDisponible;
    private Cliente cliente;

    public TarjetaCredito(Cliente cliente) {
        this.cliente = cliente;
        this.creditoDisponible = 0;
    }

    @Override
    public void consignar(double monto) {
        throw new UnsupportedOperationException("No se puede consignar en una tarjeta de crédito");
    }

    @Override
    public void retirar(double monto) {
        if (monto <= this.creditoDisponible) {
            this.creditoDisponible -= monto;
        } else {
            System.out.println("Monto a retirar mayor al crédito disponible");
        }
    }

    @Override
    public void pagarCredito(double monto) {
        if (monto <= this.creditoDisponible) {
            this.creditoDisponible -= monto;
        } else {
            System.out.println("Monto a pagar mayor al crédito disponible");
        }
    }
}
