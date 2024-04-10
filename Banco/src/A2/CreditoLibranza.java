package A2;

public class CreditoLibranza extends Credito {

	public CreditoLibranza(double limite, double deuda, int plazo) {
		super(limite, deuda, plazo);
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
