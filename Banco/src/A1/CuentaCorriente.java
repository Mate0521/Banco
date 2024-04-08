package A1;

public class CuentaCorriente implements ProductoFinanciero {
    private double saldo;
    private double creditoDisponible;
    private Cliente cliente;

    public CuentaCorriente(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.creditoDisponible = 0;
    }

    @Override
    public void consignar(double monto) {
        this.saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else if (monto <= this.saldo + this.creditoDisponible) {
            this.creditoDisponible -= (monto - this.saldo);
            this.saldo = 0;
        } else {
            System.out.println("Saldo insuficiente");
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