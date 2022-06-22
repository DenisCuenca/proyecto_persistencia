/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Mascota;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class MascotaTxt {
    
    public boolean AgregarMascota(Mascota objMascota) throws IOException{
       File f = new File("mascota.txt");
       FileWriter fw = new FileWriter(f,false);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(Integer.toString(objMascota.getId())+",");
       bw.write(objMascota.getNombre()+",");
       bw.write(String.valueOf(objMascota.getApodo())+"\n");
       bw.close();
       fw.close();
       return true;
    }
    
    
     public  ArrayList<Mascota>
     LeerMascota(ArrayList<Mascota> arrayMascotas){
        File f = new File("mascota_test.txt");
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Mascota Objtmp = new Mascota(
                             Integer.valueOf(st.nextToken()),
                             st.nextToken(),
                             st.nextToken()
                     );                     
                     arrayMascotas.add(Objtmp);
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return arrayMascotas;
    }
}
