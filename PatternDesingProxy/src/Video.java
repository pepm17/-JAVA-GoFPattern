
import java.util.*;

/**
 * 
 */
public abstract class Video {

    protected String nombre;
    
    public Video(String nombre) {
        this.nombre = nombre;
    }

    public abstract void boton(); 
    public void status(Video video){
        VideoProxy vp;
        vp= (VideoProxy) video;
        vp.status();
    }   

}