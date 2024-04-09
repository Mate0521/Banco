package A2;

//Clase TarjetaDebito
public class TarjetaDebito extends Tarjeta {
//Constructor
public TarjetaDebito(double saldo, double deuda, double limite) {
super(saldo, deuda, limite);
}

//Implementación de los métodos consignar y retirar
@Override
public void consignar(double monto) {
saldo += monto;
}

@Override
public void retirar(double monto) {
if (monto <= saldo) {
saldo -= monto;} else {
System.out.println("Fondos insuficientes.");
}
}

@Override
public void pagar(double monto) {
	// TODO Auto-generated method stub
	
}
}

