package A2;

//Clase AccederCuenta
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AccederCuenta {
	

	public AccederCuenta() {
	    // Cargar el hashmap con los clientes

	}

	// Método para buscar el cliente en el hashmap
	public String buscarCliente(int id) {
	    return CrearCliente.Banco.get(id);
	}

	// Método para verificar la clave del cliente
	public boolean verificarClave(Cliente_1 cliente, String clave) {
	    try {
	        // Abrir el archivo TXT del cliente
	        FileReader lector = new FileReader(cliente.getId() + ".txt");
	        BufferedReader buffer = new BufferedReader(lector);

	        // Leer la clave del archivo
	        String claveArchivo = buffer.readLine();

	        // Cerrar el archivo
	        buffer.close();
	        lector.close();

	        // Comprobar si la clave ingresada es correcta
	        return clave.equals(claveArchivo);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

//Método para mostrar el menú de opciones
	public void mostrarMenu() {
		System.out.println("Bienvenido a la banca virtual!");
		System.out.println("Seleccione una opción:");
		System.out.println("1. Hacer un movimiento");
		System.out.println("2. Comprar un producto");
		
		
	}
	 
}
