package A2;

import java.util.HashMap;

//Clase abstracta Cliente_1
public abstract class Cliente_1 {
	protected int id;
	protected String clave;
	protected String nombre;
	protected String numeroTelefono;
	protected String direccion;

	// Constructor
	public Cliente_1(int id, String clave, String nombre, String numeroTelefono, String direccion) {
		this.id = id;
		this.clave = clave;
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Método abstracto para crear el archivo TXT
	public abstract void crearArchivoTXT();
	
	public static HashMap<Integer,String> Banco =new HashMap<> ();
}

