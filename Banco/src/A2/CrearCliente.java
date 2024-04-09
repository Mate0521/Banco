package A2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Clase CrearCliente
public class CrearCliente extends Cliente_1 {
// Constructor
public CrearCliente(int id, String clave, String nombre, String numeroTelefono, String direccion) {
   super(id, clave, nombre, numeroTelefono, direccion);
}

// Implementación del método crearArchivoTXT
@Override
public void crearArchivoTXT() {
   try {
       // Crear el archivo TXT con el nombre del ID del cliente
       File archivo = new File(id + ".txt");
       FileWriter escritor = new FileWriter(archivo);
       BufferedWriter buffer = new BufferedWriter(escritor);

       // Escribir la clave en el archivo
       buffer.write(clave);
       buffer.newLine();

       // Escribir el resto de la información en el archivo separada por comas
       buffer.write(nombre + "," + numeroTelefono + "," + direccion);

       // Cerrar el archivo
       buffer.close();
       escritor.close();
   } catch (IOException e) {
       e.printStackTrace();
   }
}
}

