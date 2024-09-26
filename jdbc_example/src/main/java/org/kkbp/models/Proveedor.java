package org.kkbp.models;

public class Proveedor {
    private String id_proveedor;
    private String nombre_proveedor;
    private String direccion_proveedor;
    private Boolean estado;

    public Proveedor() {}

    public Proveedor(String id_proveedor, String nombre_proveedor, String direccion_proveedor, Boolean estado) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        this.estado = estado;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
