import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Creditos extends Menu
{
    /**
     * Act - do whatever the Creditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GifImage myGif=new GifImage("botonCreditos.gif");

    public void act()
    {    
        setImage(myGif.getCurrentImage());
        
          if (Greenfoot.mouseClicked(this))
        {
            CreditosWorld creditosw=new CreditosWorld();
            ((StartScreen)getWorld()).stopped();
            Greenfoot.setWorld(creditosw);
            
        }
    }
    
    
}