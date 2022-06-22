/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.MascotaTxt;
import Clases.Mascota;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class LogMascotaTxt {
    MascotaTxt objMascotaTxt = new MascotaTxt();
    public boolean ValidarId(Mascota objMascota) throws IOException {
        // valida si el codigo es correcto
        if (objMascota.getId() > 0){
            // agregar al archvio texto            
            return objMascotaTxt.AgregarMascota(objMascota);
        }
        return false;
    }

    public void ListarMascotas(ArrayList<Mascota> arrayMascotas){
        objMascotaTxt.LeerMascota(arrayMascotas);
    
    }
    
}
