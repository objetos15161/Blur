import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
   int health=3;//numero de vidas
   int healthBarWidth=100;//ancho de la barra
   int healthBarHeight=15;//altura de la barra
   int pixelsPerHealthPoint=(int)healthBarWidth/health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
      
        update();
        
    }
    public void act() 
    {
        update();
    }    
    public void update()//dibuja la barra de vida
    {
       setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
       GreenfootImage myImage=getImage();
       myImage.setColor(Color.WHITE);
       myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
       myImage.setColor(Color.CYAN);
       myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    }
    
    public void loseHealth()
    {
        health--;
    }
}
