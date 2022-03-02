package Modelo;

import java.util.Date;


public class ProductoRefrigerado extends Producto {
    private String codigoDeSupervicionAlimentaria;
    
    public ProductoRefrigerado() {
        super();
        this.codigoDeSupervicionAlimentaria = "";
    }
    public ProductoRefrigerado(String nombre, String descripcion, Date fechaDeCaducidad, int numeroDeLote, int precio, String codigoDeSupervicionAlimentaria) {
        super(nombre, descripcion, fechaDeCaducidad, numeroDeLote, precio);
        this.codigoDeSupervicionAlimentaria = codigoDeSupervicionAlimentaria;
    }
    public String getCodigoDeSupervicionAlimentaria() {
        return codigoDeSupervicionAlimentaria;
    }
    public void setCodigoDeSupervicionAlimentaria(String codigoDeSupervicionAlimentaria) {
        this.codigoDeSupervicionAlimentaria = codigoDeSupervicionAlimentaria;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoRefrigerado{" + "codigoDeSupervicionAlimentaria=" + codigoDeSupervicionAlimentaria + '}';
    }
    
}
