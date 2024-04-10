package A2;


public class CreditoHipotecario extends Credito {

	private Object cliente;



	public CreditoHipotecario(double limite, double deuda, int plazo) {
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
