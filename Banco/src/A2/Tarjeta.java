package A2;

//Clase Tarjeta
public abstract class Tarjeta extends Movimientos {
protected double saldo;
protected double deuda;
protected double limite;

//Constructor
public Tarjeta(double saldo, double deuda, double limite) {
this.saldo = saldo;
this.deuda = deuda;
this.limite = limite;
}

//Métodos getters y setters
public double getSaldo() {
return saldo;
}

public void setSaldo(double saldo) {
this.saldo = saldo;
}

public double getDeuda() {
return deuda;
}

public void setDeuda(double deuda) {
this.deuda = deuda;
}

public double getLimite() {
return limite;
}

public void setLimite(double limite) {
this.limite = limite;
}
}




