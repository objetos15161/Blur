import greenfoot.*;

/**
 * 
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Tres extends Niveles
{
    /**
     * Act - do whatever the Tres wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif=new GifImage("3.gif");

    public void act()
    {    
        setImage(myGif.getCurrentImage());

    }     
}
