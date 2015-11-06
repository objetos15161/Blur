import greenfoot.*;

/**
 * Write a description of class explosionAzul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosionAzul extends Actor
{
    GifImage myGif=new GifImage("explosionAzul.gif");
    /**
     * Act - do whatever the explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act()
        {    
            setImage(myGif.getCurrentImage());
        }
}
