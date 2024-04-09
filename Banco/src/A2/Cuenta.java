package A2;

//Clase Cuenta
public abstract class Cuenta extends Movimientos {
protected double saldo;
protected double limite;

//Constructor
public Cuenta(double saldo, double limite) {
this.saldo = saldo;
this.limite = limite;
}

//Métodos getters y setters
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

