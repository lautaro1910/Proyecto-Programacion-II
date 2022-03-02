package Modelo;

import java.util.Date;

public class ProductoFresco extends Producto{
    private Date fechaEnvasado;
    private String paisDeOrigen;
    
    public ProductoFresco(){
        super();
        this.fechaEnvasado = new Date();
        this.paisDeOrigen="";
    }
    
    public ProductoFresco(String nombre, String descripcion, Date fechaCaducidad, int numeroDeLote, int precio, Date fechaEnvasado, String paisDeOrigen) {
        super(nombre, descripcion, fechaCaducidad , numeroDeLote, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }
    
    public Date getFechaDeEnvasado() {
        return fechaEnvasado;
    }
    
    public void setFechaDeEnvasado(Date fechaDeEnvasado) {
        this.fechaEnvasado = fechaDeEnvasado;
    }
    
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }
    
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoFresco{" + "fechaDeEnvasado=" + fechaEnvasado + ", paisDeOrigen=" + paisDeOrigen + '}';
    }
    
}

