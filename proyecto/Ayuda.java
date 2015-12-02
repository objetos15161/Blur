import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Ayuda extends Menu
{
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GifImage myGif=new GifImage("botonAyuda.gif");
     /**Actua el AyudaWorld cuando se le da click  */
    public void act()
    {    
        setImage(myGif.getCurrentImage());
        if (Greenfoot.mouseClicked(this))
        {
            //sound.stop();
           ((StartScreen)getWorld()).stopped();
            AyudaWorld ayuda= new AyudaWorld();
            Greenfoot.setWorld(ayuda);
            
        }
    } 
}
