package Muestra;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("Bienvenido al Banco XYZ");
        System.out.println("1. Crear cliente");
        System.out.println("2. Acceder a cuenta");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public int obtenerOpcionMenuPrincipal() {
        int opcion = scanner.nextInt();
        return opcion;
    }

    public void mostrarMenuCuenta() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Pagar crédito");
        System.out.println("4. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }

    public int obtenerOpcionMenuCuenta() {
        int opcion = scanner.nextInt();
        return opcion;
    }

    public void mostrarMenuProducto() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Cuenta de ahorros");
        System.out.println("2. Cuenta corriente");
        System.out.println("3. Tarjeta de crédito");
        System.out.println("4. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }

    public int obtenerOpcionMenuProducto() {
        int opcion = scanner.nextInt();
        return opcion;
    }

    public void cerrarScanner() {
        scanner.close();
    }
}