package A1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private List<ProductoFinanciero> productosFinancieros;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente(int id) {
        this.id = id;
        this.productosFinancieros = new ArrayList<>();
    }

    public void agregarProductoFinanciero(ProductoFinanciero productoFinanciero) {
        this.productosFinancieros.add(productoFinanciero);
    }
}