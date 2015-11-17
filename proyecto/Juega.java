import greenfoot.*;
/**
 * Write a description of class AyudWorld here.
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Juega extends Menu
{
  
    GifImage myGif=new GifImage("botonJugar2.gif");

        
        public void act()
        {    
           
            setImage(myGif.getCurrentImage());
             if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new BlurWorld());
            
           
        }
        }

}
