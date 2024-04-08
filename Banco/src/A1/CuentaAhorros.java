package A1;

public class CuentaAhorros implements ProductoFinanciero {
    private double saldo;
    private Cliente cliente;

    public CuentaAhorros(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
    }

    @Override
    public void consignar(double monto) {
        this.saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void pagarCredito(double monto) {
        throw new UnsupportedOperationException("No se puede pagar crédito con una cuenta de ahorros");
    }
}