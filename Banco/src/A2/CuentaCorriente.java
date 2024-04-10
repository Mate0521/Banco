package A2;

public class CuentaCorriente extends Cuenta {
//Constructor
	public CuentaCorriente(double saldo, double limite) {
		super(saldo, limite);
	}
	
	private Cliente_1 cliente;

//Implementación de los métodos consignar y retirar, y por contrato pagar 
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
