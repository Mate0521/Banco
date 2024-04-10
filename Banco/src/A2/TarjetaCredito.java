package A2;

//Clase TarjetaCredito
public class TarjetaCredito extends Tarjeta {
//Constructor
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
		} else {
			System.out.println("Fondos insuficientes.");
		}
	}

	@Override
	public void pagar(double monto) {
		if (monto <= deuda) {
			deuda -= monto;
		} else {
			System.out.println("Monto de pago inválido.");
		}
	}
}
