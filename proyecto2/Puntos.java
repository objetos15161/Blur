import greenfoot.*;
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Puntos extends Actor
{
   
    private Counter puntos;
    /**este codigo lo vi en clases  */
    public Puntos()
    {
        puntos = new Counter("Puntos:");
        

    }
    /**Se agrega al mundo antes de que este se cree */
    protected void addedToWorld(World mundo)
    {
        mundo.addObject(puntos,300,16);
    }

    public void act() 
    {
       BlurWorld mundo =(BlurWorld)getWorld();
       
       puntos.setValue(mundo.getPuntos());
    }    
}