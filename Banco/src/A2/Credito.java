package A2;

//Clase Credito
public abstract class Credito {
protected double limite;
protected double deuda;
protected int plazo;

//Constructor
public Credito(double limite, double deuda, int plazo) {
this.limite = limite;
this.deuda = deuda;
this.plazo = plazo;
}

//Métodos getters y setters
public double getLimite() {
return limite;
}

public void setLimite(double limite) {
this.limite = limite;
}

public double getDeuda() {
return deuda;
}

public void setDeuda(double deuda) {
this.deuda = deuda;
}

public int getPlazo() {
return plazo;
}

public void setPlazo(int plazo) {
this.plazo = plazo;
}

//Método abstracto para pagar
public abstract void pagar(double monto);
}


