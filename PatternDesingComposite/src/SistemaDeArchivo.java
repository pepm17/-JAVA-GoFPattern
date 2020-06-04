/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Emilio
 */
public abstract class SistemaDeArchivo {
    
    protected String name;
    protected int size;

    public SistemaDeArchivo(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
   
    public abstract boolean guardarArchivo(SistemaDeArchivo sda);
    
    public abstract SistemaDeArchivo buscar(String nombre);
    
    public abstract String propiedades(String nombre);
    
    public abstract void tamaño();
    
}
