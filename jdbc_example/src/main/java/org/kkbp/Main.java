package org.kkbp;

import org.kkbp.dao.ProveedorDAO;
import org.kkbp.models.Proveedor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProveedorDAO proveedorDAO = new ProveedorDAO();
        ArrayList<Proveedor> proveedores = proveedorDAO.obtenerProveedor();

        if (proveedores.isEmpty()) {
            System.out.println("No se encontraron proveedores.");
        } else {
            System.out.println("Lista de Proveedores:");
            for (Proveedor proveedor : proveedores) {

                System.out.println("ID: " + proveedor.getId_proveedor());
                System.out.println("Nombre: " + proveedor.getNombre_proveedor());
                System.out.println("Direccion: " + proveedor.getDireccion_proveedor());
                System.out.println("Estado: " + proveedor.getEstado());
                System.out.println("------------------------");
            }
        }
    }
}