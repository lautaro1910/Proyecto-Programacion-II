package Modelo;

import java.util.Date;

public class ProductoCongelado extends Producto {
    private float temperaturaDeCongelacionRecomendada;
    public ProductoCongelado(){
        super();
        this.temperaturaDeCongelacionRecomendada = 0;
    }
    public ProductoCongelado(String nombre, String descripcion, Date fechaCaducidad, int numeroDeLote, int precio, float temperaturaDeCongelacionRecomendada) {
        super(nombre, descripcion, fechaCaducidad, numeroDeLote, precio);
        this.temperaturaDeCongelacionRecomendada = temperaturaDeCongelacionRecomendada;
    }
    public float getTemperaturaDeCongelacionRecomendada() {
        return temperaturaDeCongelacionRecomendada;
    }
    public void setTemperaturaDeCongelacionRecomendada(float temperaturaDeCongelacionRecomendada) {
        this.temperaturaDeCongelacionRecomendada = temperaturaDeCongelacionRecomendada;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "temperaturaDeCongelacionRecomendada=" + temperaturaDeCongelacionRecomendada + '}';
    }
}