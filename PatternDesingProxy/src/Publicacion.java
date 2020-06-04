

/**
 * 
 */
public class Publicacion {

   private Video video;
   
   public Publicacion(Video video){
       this.video = video;
   }
   
   public void ejecutar(int num){
       for(int x= 1; x<=num; x++){
           this.video.boton();
        }
       VideoProxy vp = (VideoProxy) this.video;
       vp.status();
       //this.video.status(video);
   }

}