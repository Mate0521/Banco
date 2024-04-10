package A2;

//Clase TarjetaCredito
public class TarjetaCredito extends Tarjeta {
	
private Cliente_1 cliente;


	public TarjetaCredito(double saldo, double deuda, double limite) {
		super(saldo, deuda, limite);
	}

//Implementación de los métodos consignar, ret8irar y pagar
	@Override
	public void consignar(double monto) {
		saldo += monto;
	}

	@Override
	public void retirar(double monto) {
		if (monto <= saldo) {
			saldo -= monto;
			registrarMovimiento(this.cliente, "retirar: " + monto);
		} else {
			System.out.println("Fondos insuficientes.");
		}
	}

	@Override
	public void pagar(double monto) {
		if (monto <= deuda) {
			deuda -= monto;
			registrarMovimiento(this.cliente, "Pagar: " + monto);
		} else {
			System.out.println("Monto de pago inválido.");
		}
	}
}
