
package Presentacion;

import Clases.Mascota;
import Logica.LogMascotaBin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 21/06/2021
 * @author Denis Cuenca
 */
public class ArchivoBin {
    static LogMascotaBin objLogMascotaBin = new LogMascotaBin();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarMascotaBin();
        ListarMascotaBin();
    }
            
    
    
    
    
    
    
    
    
    
    
    
    void menuArhivoTexto() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarMascotaBin(); break;
                case 2: EliminarMascotaBin(); break;
                case 3: ListarMascotaBin(); break;
            }
        }
    }

    static private void AgregarMascotaBin() throws IOException {
        
        Mascota objMascota = new Mascota();
        // entrada
        objMascota.setId(1);
        objMascota.setNombre("nombre1");
        objMascota.setApodo("apodo1");
        
        if (objLogMascotaBin.ValidarId(objMascota))
            System.out.println("mascota agregado");
        else
            System.out.println("error");
    
    }

    private void EliminarMascotaBin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static private void ListarMascotaBin() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Mascota> arrayMascotas = new ArrayList<Mascota>();
        objLogMascotaBin.ListarMascotas(arrayMascotas);
        for (Mascota tmpMascota : arrayMascotas)
            System.out.println(tmpMascota.toString());
    
    }
}
