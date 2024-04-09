package A2;

//Clase CreditoHipotecario
public class CreditoHipotecario extends Credito {
//Constructor
public CreditoHipotecario(double limite, double deuda, int plazo) {
super(limite, deuda, plazo);
}

//Implementación del método pagar
@Override
public void pagar(double monto) {
if (monto <= deuda) {
deuda -= monto;
} else {
System.out.println("Monto de pago inválido.");
}
}
}


