/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Ratix
 */
public class Pedido {
    
    
    private String dnicli;
    private String estado;
    private String fvisita;
    private String fentrega;
    private String direccion;
    private String descri;
    private int precio; 
    private int cantidad; 
    private String alto;
    private String largo;
    private String ancho; 

    public Pedido() {
    }

    public Pedido(String dnicli, String estado, String fvisita, String fentrega, String direccion, String descri, int precio, int cantidad, String alto, String largo, String ancho) {
        this.dnicli = dnicli;
        this.estado = estado;
        this.fvisita = fvisita;
        this.fentrega = fentrega;
        this.direccion = direccion;
        this.descri = descri;
        this.precio = precio;
        this.cantidad = cantidad;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getDnicli() {
        return dnicli;
    }

    public void setDnicli(String dnicli) {
        this.dnicli = dnicli;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFvisita() {
        return fvisita;
    }

    public void setFvisita(String fvisita) {
        this.fvisita = fvisita;
    }

    public String getFentrega() {
        return fentrega;
    }

    public void setFentrega(String fentrega) {
        this.fentrega = fentrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Pedido{" + "dnicli=" + dnicli + ", estado=" + estado + ", fvisita=" + fvisita + ", fentrega=" + fentrega + ", direccion=" + direccion + ", descri=" + descri + ", precio=" + precio + ", cantidad=" + cantidad + ", alto=" + alto + ", largo=" + largo + ", ancho=" + ancho + '}';
    }

    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
}
