package Modelo;

import java.util.Date;

public class Pedido {
    private String []productoR;
    private int  cantidadDePR;
    private  String [] productosC;
    private int  cantidadDePC;
    private  String [] productosF;
    private int  cantidadDePF;
    private Date fechaDeEntrega;
    private Date fechaDePedido;
    private int montoTotal;
    public Pedido(){
        int i;
        for(i=0;i<100;i++){
        this.productoR[i]="";
        }
        this.cantidadDePR=0;
        for(i=0;i<100;i++) {
            this.productosC [i]="";
        }
        this.cantidadDePC=0;
        for(i=0;i<100;i++) {
            this.productosF[i]="";
        }
        this.fechaDeEntrega.setYear(0);
        this.fechaDeEntrega.setDate(0);
        this.fechaDeEntrega.setMonth(0);
        this.fechaDePedido.setMonth(0);
        this.fechaDePedido.setDate(0);
        this.fechaDePedido.setYear(0);
        this.montoTotal=0;
    }

    public Pedido(String[] productoR, int cantidadDePR, String[] productosC, int cantidadDePC, String[] productosF, int cantidadDePF, Date fechaDeEntrega, Date fechaDePedido, int montoTotal) {
        this.productoR = productoR;
        this.cantidadDePR = cantidadDePR;
        this.productosC = productosC;
        this.cantidadDePC = cantidadDePC;
        this.productosF = productosF;
        this.cantidadDePF = cantidadDePF;
        this.fechaDeEntrega = fechaDeEntrega;
        this.fechaDePedido = fechaDePedido;
        this.montoTotal = montoTotal;
    }
    public String[] getProductoR() {
        return productoR;
    }
    public void setProductoR(String[] productoR) {
        this.productoR = productoR;
    }
    public int getCantidadDePR() {
        return cantidadDePR;
    }
    public void setCantidadDePR(int cantidadDePR) {
        this.cantidadDePR = cantidadDePR;
    }
    public String[] getProductosC() {
        return productosC;
    }
    public void setProductosC(String [] productosC) {
        this.productosC = productosC;
    }
    public int getCantidadDePC() {
        return cantidadDePC;
    }
    public void setCantidadDePC(int cantidadDePC) {
        this.cantidadDePC = cantidadDePC;
    }
    public String[] getProductosF() {
        return productosF;
    }
    public void setProductosF(String[] productosF) {
        this.productosF = productosF;
    }
    public int getCantidadDePF() {
        return cantidadDePF;
    }
    public void setCantidadDePF(int cantidadDePF) {
        this.cantidadDePF = cantidadDePF;
    }
    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }
    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }
    public Date getFechaDePedido() {
        return fechaDePedido;
    }
    public void setFechaDePedido(Date fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }
    public int getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
