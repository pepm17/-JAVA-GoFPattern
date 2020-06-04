
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Centro Informatica
 */
public class main {
    
    public static void main(String[] args) {
        Video video = new VideoProxy("Video1");
        Publicacion pub = new Publicacion(video);
        //numero de veces que va a presionar
        pub.ejecutar(5);
    }
    
}
