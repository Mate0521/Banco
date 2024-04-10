package A2;

//Clase TarjetaDebito
public class TarjetaDebito extends Tarjeta {
private Cliente_1 cliente;

//Constructor
	public TarjetaDebito(double saldo, double deuda, double limite) {
		super(saldo, deuda, limite);
	}

//Implementación de los métodos consignar y retirar
	@Override
	public void consignar(double monto) {
		saldo += monto;
		registrarMovimiento(this.cliente, "Consignar: " + monto);
	}

	@Override
	public void retirar(double monto) {
		if (monto <= saldo) {
			saldo -= monto;
			registrarMovimiento(this.cliente, "Retirar: " + monto);
		} else {
			System.out.println("Fondos insuficientes.");
		}
	}

	@Override
	public void pagar(double monto) {
		// TODO Auto-generated method stub

	}
}
