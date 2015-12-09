import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author Jim Stewart
 * 
 */
public class HealthBar extends Actor
{
   private int health=3;//numero de vidas
   private int healthBarWidth=170;//ancho de la barra
   private int healthBarHeight=15;//altura de la barra
   private int pixelsPerHealthPoint=(int)healthBarWidth/health;
   /**Constructor , actualiza la barra de vida */
    public HealthBar()
    {
      
        update();
        
    }
    public void act() 
    {
        update();
    }    
    /**si la variable healt es igual la barra de vida es blanca, si es 2 la abrra es amarilla y si es 1 la barra es roja */
    public void update()//dibuja la barra de vida
    //LOS IFS SE USAN PARA CAMBIAR LA BARRA CONFORME PIERDE VIDA
    {   if(health==3){
       setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
       GreenfootImage myImage=getImage();
       myImage.setColor(Color.WHITE);
       myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
       myImage.setColor(Color.WHITE);
       myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    }
     if(health==2){
       setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
       GreenfootImage myImage=getImage();
       myImage.setColor(Color.YELLOW);
       myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
       myImage.setColor(Color.YELLOW);
       myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    } if(health==1){
       setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
       GreenfootImage myImage=getImage();
       myImage.setColor(Color.RED);
       myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
       myImage.setColor(Color.RED);
       myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    }
    if(health==0){
       setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
       GreenfootImage myImage=getImage();
       myImage.setColor(Color.BLACK);
       myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
       myImage.setColor(Color.BLACK);
       myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    }
    }
    /**Metodo para reducir la variable health en -1 */
    public void loseHealth()
    {
        health--;
    }
    /**Meotodo que regresa el valor de la variable health */
    public int getValue()
    {
        return health;
    }
    public void setValue(int vida)
    { 
        health=vida;
    }
    
}
