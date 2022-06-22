/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Archivos.MascotaBin;
import Clases.Mascota;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 /**
 * 21/06/2021
 * @author Denis Cuenca
 */

public class LogMascotaBin {
    MascotaBin objMascotaBin = new MascotaBin();
    
    public boolean ValidarId(Mascota objMascota) throws IOException {
        ArrayList<Mascota> arrayMascotas = new ArrayList<Mascota>();

        if (objMascota.getId() > 0){

            arrayMascotas.add(objMascota);
            return objMascotaBin.GrabarMascotaBin(arrayMascotas);
        }
        return false;
    }

    public void ListarMascotas(ArrayList<Mascota> arrayMascotas) throws IOException, FileNotFoundException, ClassNotFoundException{
        objMascotaBin.ImportarMascotaBin(arrayMascotas);
    
    }
    
}
