/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Mascota;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class MascotaDB {
    DATConexion con = new DATConexion();
    ResultSet rs;
    PreparedStatement ps = null;
    public boolean InsertarMascotaDB(Mascota objMascota) {
        String sql = "INSERT INTO mascota (nombre, apodo, id ) "
                + "VALUES (?,?, ?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);

            ps.setString(1, objMascota.getNombre());
            ps.setString(2, objMascota.getApodo());
            ps.setInt(3, objMascota.getId());
            ps.execute();

            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(3);
            }
        } 
    }

    public ResultSet RecuperarMascota() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM mascotas";
        rs = st.executeQuery(sentencia);
        return rs;
    }

    
    
}
