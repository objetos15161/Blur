import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class ExplosionRoja extends Actor
{
    GifImage myGif=new GifImage("explosionRoja.gif");
     /** codigo para ejecutar una imagen gif */
    public void act()
    {    
        setImage(myGif.getCurrentImage());
        ((BlurWorld)getWorld()).reInicia();

    }  
}
