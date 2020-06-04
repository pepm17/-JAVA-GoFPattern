
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Emilio
 */
public class Cliente {    
    public static void main(String[] args) {
        SistemaDeArchivo sda, principal;
        //Se crea la carpeta principal donde estarán todos los archivos
        principal = new Carpeta("principal", 1);
        String hacer = "";
        String crear = "";
        String nombre;
        int tama;
        String tipo = "archivo";
        try {
            while(!"4".equals(hacer)){            
                hacer = JOptionPane.showInputDialog("¿Qué desea hacer? \n1. Crear \n2. Guardar archivo o carpeta en carpeta"
                       + "\n3. Propiedades \n4. Salir");
                 
                switch(hacer){
                    case "1":{
                        crear = JOptionPane.showInputDialog("¿Qué desea crear? \n1. Carpeta \n2. Archivo");
                        if(crear.equals("1") && crear.equals("2")){
                           if(crear.equals("1")) tipo = "carpeta";
                            nombre = JOptionPane.showInputDialog("Nombre de " + tipo + " (nombre único)");
                            tama = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de " + tipo + " en MB"));
                            if(crear.equals("1")) {
                                sda = new Carpeta(nombre, tama);
                                principal.guardarArchivo(sda);
                            }
                            else if(crear.equals("2")){
                                String tipoA = "";
                                tipoA = JOptionPane.showInputDialog("Tipo (extención) del archivo");
                                sda = new Archivo(nombre, tama, tipoA);
                                principal.guardarArchivo(sda);
                            }   
                        }                  
                        break;
                    }
                    case "2":{
                        String arc, car;
                        arc = JOptionPane.showInputDialog("Nombre del archivo o carpeta a guardar");
                        car = JOptionPane.showInputDialog("Nombre de la carpeta donde se va guardar");
                        SistemaDeArchivo arch = principal.buscar(arc);
                        sda = principal.buscar(car);
                        if(sda.guardarArchivo(arch)) JOptionPane.showMessageDialog(null, "Se guardó con éxito");
                        break;
                    }
                    case "3":{
                        String n, propiedades;
                        n = JOptionPane.showInputDialog("Nombre del archivo o carpeta que quiera ver las propiedades");
                        propiedades = principal.propiedades(n);
                        if(propiedades != null)JOptionPane.showMessageDialog(null, propiedades);
                        break;
                    }
                    case "4":{
                        JOptionPane.showMessageDialog(null, "Ha decidido salir");
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Tecla incorrecta");
                        break;
                    }
                }
           
            }
        } catch (Exception e) {
        }
    }
}
