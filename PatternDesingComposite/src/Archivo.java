/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Emilio
 */
public class Archivo extends SistemaDeArchivo {
    
    private String type;
    
    public Archivo(String name, int size, String type) {
        super(name, size);
        this.type = type;
    }


    @Override
    public String propiedades(String nombre) { 
        return "Tipo: Archivo \n" +
                "Nombre: " + this.name + 
                "\nPeso: " + this.size + " MB" +
                "\nTipo de archivo: ." + this.type;
    }    

    @Override
    public boolean guardarArchivo(SistemaDeArchivo sda) {return false;}

    @Override
    public SistemaDeArchivo buscar(String nombre) {return null;}

    @Override
    public void tamaño() {}
}
