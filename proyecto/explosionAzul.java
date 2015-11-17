import greenfoot.*;

/**
 * 
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class ExplosionAzul extends Actor
{
    GifImage myGif=new GifImage("explosionAzul.gif");
     /** Metodo para activar una imagen Giff!! */
    public void act()
    {    
        setImage(myGif.getCurrentImage());
        ((BlurWorld)getWorld()).reInicia();
    }
}
