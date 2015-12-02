import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class ExplosionRoja extends Actor
{
    private GifImage myGif=new GifImage("explosionRoja.gif");
     /** codigo para ejecutar una imagen gif */
    public void act()
    {    
        setImage(myGif.getCurrentImage());
        ((BlurWorld)getWorld()).reInicia();

    }  
}
