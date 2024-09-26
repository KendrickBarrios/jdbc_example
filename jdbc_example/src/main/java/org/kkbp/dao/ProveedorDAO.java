package org.kkbp.dao;

import org.kkbp.models.Proveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProveedorDAO {
    public ArrayList<Proveedor> obtenerProveedor() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();

        try (Connection conexion = Conexion.obtenerConexion();
             // crea el query de SQL
             PreparedStatement statement = conexion.prepareStatement("SELECT * FROM Tb_Proveedor");
             ResultSet resultSet = statement.executeQuery()) {


            while (resultSet.next()) {
                // Guarda los valores de las columnas de cada registro
                String id_proveedor = resultSet.getString("id_proveedor");
                String nombre_proveedor = resultSet.getString("nombre_proveedor");
                String direccion_proveedor = resultSet.getString("direccion_proveedor");
                Boolean estado_proveedor = resultSet.getBoolean("estado_proveedor");

                // Crea el objeto proveedor y lo guarda en lista
                Proveedor proveedor = new Proveedor(id_proveedor, nombre_proveedor, direccion_proveedor, estado_proveedor);
                proveedores.add(proveedor);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los datos del proveedor: " + e.getMessage());
        }
        return proveedores;
    }
}
