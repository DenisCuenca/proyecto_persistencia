
package Presentacion;

import Clases.Mascota;
import Logica.LogMascotaDB;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class DataBase {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList<Mascota> arrayMascotas = new ArrayList<Mascota>();
        LogMascotaDB objLogMascotaDB = new LogMascotaDB();
        //entrada
        arrayMascotas.add(new Mascota(1,"raton","apodo1"));
        arrayMascotas.add(new Mascota(2,"gato","apodo2"));
        arrayMascotas.add(new Mascota(3,"perro","apodo3"));
        
        objLogMascotaDB.InsertarMascota(arrayMascotas);
        
        //limpiando arrayList
        arrayMascotas = new ArrayList<Mascota>();
        arrayMascotas.removeAll(arrayMascotas);
        
        objLogMascotaDB.RecuperarMascota(arrayMascotas);
        
        for (Mascota objMascota : arrayMascotas)
            System.out.println(objMascota.toString());
                    
                
    }
}
