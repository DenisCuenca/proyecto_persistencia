/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Mascota;
import Logica.LogMascotaTxt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class ArchivoTexto {
    static LogMascotaTxt objLogMascotaTxt = new LogMascotaTxt();
    
    public static void main(String[] args) throws IOException {
        
        AgregarMascotaTxt();
        ListarMascota();
    }
    
    void menuArhivoTexto() throws IOException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarMascotaTxt(); break;
                case 2: EliminarMascotaTxt(); break;
                case 3: ListarMascota(); break;
            }
        }
    }

    static private void AgregarMascotaTxt() throws IOException {
        LogMascotaTxt objLogMascotaTxt = new LogMascotaTxt();
        Mascota objMascota = new Mascota();
        // entrada
        objMascota.setId(2);
        objMascota.setNombre("2");
        objMascota.setApodo("2");
        if (objLogMascotaTxt.ValidarId(objMascota))
            System.out.println("Mascota agregado");
        else
            System.out.println("error");
    }
    
    private void EliminarMascotaTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarMascota() {
        ArrayList<Mascota> arrayMascotas = new ArrayList<Mascota>();
        objLogMascotaTxt.ListarMascotas(arrayMascotas);
        for (Mascota tmpMascota : arrayMascotas)
            System.out.println(tmpMascota.toString());
    }
}
