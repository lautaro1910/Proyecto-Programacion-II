package Modelo;
public class Cliente {
    private String nombre;
    private String apellido;
    private String mail;
    private String domicilio;
    public Cliente(){
        this.nombre="";
        this.apellido="";
        this.mail="";
        this.domicilio="";
    }
    public Cliente(String nombre, String apellido, String mail, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
