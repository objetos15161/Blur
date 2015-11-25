import greenfoot.*;

/**
 * 
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Uno extends Niveles
{
    /**
     * Act - do whatever the Uno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif=new GifImage("1.gif");
     /** Actua el BlurWorld cuando se le da click al objeto */
    public void act()
    {    
        
        setImage(myGif.getCurrentImage());
        if (Greenfoot.mouseClicked(this))
        {
            BlurWorld blur=new BlurWorld();
            ((StartScreen)getWorld()).stopped();
            Greenfoot.setWorld(blur);
            blur.set1();
        }
    }   

}
