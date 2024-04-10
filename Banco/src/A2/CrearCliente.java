package A2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearCliente extends Cliente_1 {

	public CrearCliente( int id, String clave, String nombre, String numeroTelefono, String direccion) {
		super(id, clave, nombre, numeroTelefono, direccion);
	}

// Implementación del método crearArchivoTXT
	@Override
	public void crearArchivoTXT() {
        try {
            File file = new File(id + ".txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(clave);
            bw.newLine();
            bw.write(nombre);
            bw.newLine();
            bw.write(numeroTelefono);
            bw.newLine();
            bw.write(direccion);
            bw.newLine();
            bw.write("#011=false");
            bw.newLine();
            bw.write("#012=false");
            bw.newLine();
            bw.write("#021=false");
            bw.newLine();
            bw.write("#022=false");
            bw.newLine();
            bw.write("#031=false");
            bw.newLine();
            bw.write("#032=false");
            

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Cliente_1.Banco.put(id,(id + ".txt"));
    }
}

