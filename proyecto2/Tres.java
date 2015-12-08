import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Tres extends Niveles
{
    /**
     * Act - do whatever the Tres wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GifImage myGif=new GifImage("3.gif");

    public void act()
    {    
        setImage(myGif.getCurrentImage());
        if (Greenfoot.mouseClicked(this))
        {
            BlurWorld blur=new BlurWorld();
            ((StartScreen)getWorld()).stopped();
            Greenfoot.setWorld(blur);
            blur.set3();
        }

    }     
}
