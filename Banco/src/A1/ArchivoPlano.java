package A1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoPlano {
    public void escribirCliente(Cliente cliente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.csv", true))) {
            bw.write(cliente.id + ",");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirProductoFinanciero(ProductoFinanciero productoFinanciero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productosFinancieros.csv", true))) {
            bw.write(productoFinanciero.cliente.nombre + ",");
            bw.write(productoFinanciero.getClass().getSimpleName() + ",");
            if(productoFinanciero instanceof CuentaAhorros) {
                bw.write(((CuentaAhorros) productoFinanciero).saldo + ",");
            } else if (productoFinanciero instanceof CuentaCorriente) {
                bw.write(((CuentaCorriente) productoFinanciero).saldo + ",");
                bw.write(((CuentaCorriente) productoFinanciero).creditoDisponible + ",");
            } else if (productoFinanciero instanceof TarjetaCredito) {
                bw.write(((TarjetaCredito) productoFinanciero).creditoDisponible + ",");
            }
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirTransaccion(Transaccion transaccion) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("transacciones.csv", true))) {
            bw.write(transaccion.productoFinanciero.cliente.nombre + ",");
            bw.write(transaccion.productoFinanciero.getClass().getSimpleName() + ",");
            bw.write(transaccion.tipo + ",");
            bw.write(String.valueOf(transaccion.monto) + ",");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}