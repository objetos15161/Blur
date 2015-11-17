import greenfoot.*;

/**
 *
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Ayuda extends Menu
{
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif=new GifImage("botonAyuda.gif");
     /**Actua el AyudaWorld cuando se le da click  */
    public void act()
    {    
        setImage(myGif.getCurrentImage());
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new AyudWorld());
            sound.stop();
        }
    } 
}
