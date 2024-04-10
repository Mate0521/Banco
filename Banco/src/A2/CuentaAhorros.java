package A2;

public class CuentaAhorros extends Cuenta {

	private Cliente_1 cliente;

	public CuentaAhorros(double saldo, double limite) {
		super(saldo, limite);
		
	}

//Implementación de los métodos consignar y retirar, y por contrato el metodo pagar
	@Override
	public void consignar(double monto) {
		saldo += monto;
		registrarMovimiento(this.cliente, "Consignar: " + monto);
	}

	@Override
	public void retirar(double monto) {
		if (monto <= saldo) {
			saldo -= monto;
			registrarMovimiento(this.cliente, "Retiro: " + monto);
		} else {
			System.out.println("Fondos insuficientes.");
		}
	}

	@Override
	public void pagar(double monto) {
		// TODO Auto-generated method stub

	}
}
