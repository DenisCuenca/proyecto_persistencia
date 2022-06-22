/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.MascotaDB;
import Clases.Mascota;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class LogMascotaDB {
    MascotaDB objMascotaDB = new MascotaDB();

    public void InsertarMascota(ArrayList<Mascota> arrayMascotas) {
        for(Mascota objMascota : arrayMascotas)
              objMascotaDB.InsertarMascotaDB(objMascota);
    }

    public void RecuperarMascota(ArrayList<Mascota> arrayMascotas) throws ClassNotFoundException, SQLException {
        ResultSet rs = objMascotaDB.RecuperarMascota();
        ResultSetMetaData rm = rs.getMetaData();
        int columnCount = rm.getColumnCount();
        ArrayList<String> columnas = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columnas.add(columnName);
        }
        while (rs.next()) {
            Mascota objAux = new Mascota();
            for (String columnName : columnas) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    objAux.setId(Integer.parseInt(value));
                }
                if (columnName.equals("nombre")) {
                    objAux.setNombre(value);
                }
                if (columnName.equals("Apodo")) {
                    objAux.setApodo(value);
                }
            }
            arrayMascotas.add(objAux);
        }

    }
    
}
