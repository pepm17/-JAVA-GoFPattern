
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Emilio
 */
public class Carpeta extends SistemaDeArchivo{
    private int tamañoTotalCarpeta;
    private final ArrayList<SistemaDeArchivo> listSistemaArchivo;

    public Carpeta(String name, int size) {
        super(name, size);
        this.listSistemaArchivo = new ArrayList();
    }

    @Override
    public boolean guardarArchivo(SistemaDeArchivo sda) {
        return this.listSistemaArchivo.add(sda);
    }
    
    @Override
    public SistemaDeArchivo buscar(String nombre) {
        for (SistemaDeArchivo lsa : this.listSistemaArchivo){
            if(lsa.name.equals(nombre)) return lsa;
        }
        return null;
    }

    @Override
    public String propiedades(String nombre) {
        String n= nombre;
        if(n.equals(this.name)){
            tamaño();
            return "Tipo: Carpeta \n" +
                "Nombre: " + this.name + 
                "\nPeso: " + this.tamañoTotalCarpeta + " MB" +
                "\nTotal de archivos disponibles: " + this.listSistemaArchivo.size();
        }else {
            for (SistemaDeArchivo lsa : this.listSistemaArchivo) {
                if(lsa.name.equals(n)) return lsa.propiedades(nombre);
            }
        }    
        
        return null;
    }
    
    @Override
    public void tamaño(){
        this.tamañoTotalCarpeta = 0;
        for (SistemaDeArchivo lsa : this.listSistemaArchivo) {
            this.tamañoTotalCarpeta+= lsa.getSize();
        }
        this.tamañoTotalCarpeta += this.size;
    }
}
