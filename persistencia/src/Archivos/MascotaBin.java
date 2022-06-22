/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Mascota;
import Logica.MiObjectOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class MascotaBin {
    static String fichero = "Mascotas_bin.dat";
    public static boolean GrabarMascotaBin(ArrayList<Mascota> arrayMascotas) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));
        for (Mascota objMascota : arrayMascotas){

            oos.writeObject(objMascota);
        }
        oos.close();
        return true;
    }
    
    public static void ImportarMascotaBin(ArrayList<Mascota> arrayMascotas) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Mascota aux = (Mascota) ois.readObject();
            while (aux!=null){
                if (aux instanceof Mascota) {

                    arrayMascotas.add((Mascota)aux);
                }
                aux = (Mascota) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {

        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        
    }
    
    public static void AddMascotaBin(ArrayList<Mascota> arrayMascotas)
    {
        try
        {

            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));

            for (Mascota objMascota : arrayMascotas){
                oos.writeUnshared(objMascota);
        }
        oos.close();
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
    
}