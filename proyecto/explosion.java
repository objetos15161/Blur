import greenfoot.*;

/**
 * Write a description of class explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosion extends Actor
{  GifImage myGif=new GifImage("Terror-Explosiones-Terror-268.gif");
    /**
     * Act - do whatever the explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act()
        {    
            setImage(myGif.getCurrentImage());
        }
   
       
        
}
