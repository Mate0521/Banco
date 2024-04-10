package A2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Clase Movimientos
public abstract class Movimientos {
	public abstract void consignar(double monto);

	public abstract void retirar(double monto);

	public abstract void pagar(double monto);
	
	public void registrarMovimiento(Cliente_1 cliente, String movimiento) {
		try {
		            File file = new File(cliente.getId() + ".txt");
		            FileWriter fw = new FileWriter(file, true); // Establezca true para agregar al archivo
		            BufferedWriter bw = new BufferedWriter(fw);

		            bw.write(movimiento);
		            bw.newLine();

		            bw.close();
		            fw.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
	

}

