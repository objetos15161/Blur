import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class ExplosionAzul extends Actor
{
    private GifImage myGif=new GifImage("explosionAzul.gif");
     /** Metodo para activar una imagen Giff!! */
    public void act()
    {    
        setImage(myGif.getCurrentImage());
        ((BlurWorld)getWorld()).reInicia();
    }
}
