package Modelo;

import java.util.Date;

public abstract class Producto{
    private String nombre;
    private String descripcion;
    private Date fechaCaducidad;
    private int numeroDeLote;
    private int precio;
    
    //Constructores
    public Producto(){
        this.nombre="";
        this.descripcion="";
        this.fechaCaducidad = new Date();
        this.numeroDeLote=0;
        this.precio=0;
    }

    public Producto(String nombre, String descripcion, Date fechaCaducidad, int numeroDeLote, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroDeLote = numeroDeLote;
        this.precio = precio;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaDeCaducidad() {
        return this.fechaCaducidad;
    }
    public void setFechaDeCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getNumeroDeLote() {
        return numeroDeLote;
    }
    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre: " + nombre + ", descripcion: " + descripcion + ", fecha de caducidad: " + fechaCaducidad.toString() + ", numero de lote: " + numeroDeLote + ", precio: " + precio + '}';
    }
    
    public int compareTo(Producto p){
     return this.nombre.compareTo(p.getNombre());
    }
}
