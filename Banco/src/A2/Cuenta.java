package A2;

public abstract class Cuenta extends Movimientos {
	protected double saldo;
	protected double limite;

	public Cuenta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public Cuenta(int id, String clave, String nombre, String numeroTelefono, String direccion) {
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
