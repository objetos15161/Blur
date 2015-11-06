import greenfoot.*;

/**
 * Write a description of class explosionRoja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosionRoja extends Actor
{
   GifImage myGif=new GifImage("explosionRoja.gif");
    /**
     * Act - do whatever the explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act()
        {    
            setImage(myGif.getCurrentImage());
        }  
}
