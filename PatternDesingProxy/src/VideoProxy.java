
import java.util.*;

/**
 * 
 */
public class VideoProxy extends Video {
    private VideoReal videoReal;
    private int pulsado=0;
    
   
    public VideoProxy(String nombre) {
        super(nombre);
    }
    
    public Video obtenerVideo(){
        if(videoReal == null) videoReal = new VideoReal(this.nombre);
        return videoReal;
    }

    @Override
    public void boton() {
        pulsado++;
        obtenerVideo();
        videoReal.boton();
    }
    
    public void status(){
        System.out.println("El numero de veces " + this.nombre + " pulsado fue: " + this.pulsado);
    }
}