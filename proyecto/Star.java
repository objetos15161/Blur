import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Star here.
 * 
 * @author Kevin Rowan (from you tube)
 * 
 */
public class Star extends Actor
{
   
    
    private static final int SIZE=2;
    private int speed;
    
    public Star()
    {
       GreenfootImage img=new GreenfootImage(SIZE,SIZE);
       int colour=Greenfoot.getRandomNumber(256);//PARA CREAR UN COLOR RGB
       img.setColor(new Color(colour,colour,colour));
       img.fillOval(0,0,SIZE,SIZE);
       setImage(img);
       speed=Greenfoot.getRandomNumber(2)+1;
    }
    public void act() 
    {
        setLocation(getX()-speed,getY());
        if(getX()<SIZE){
           int x=getWorld().getWidth()-SIZE;
           int y=Greenfoot.getRandomNumber(getWorld().getHeight());
           setLocation(x,y);
        }
        
       
    }    
}
