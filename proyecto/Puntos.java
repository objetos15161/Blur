import greenfoot.*;
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Puntos extends Actor
{
   
    private CounterP puntos;
    /**este codigo lo vi en clases  */
    public Puntos()
    {
        puntos = new CounterP("Puntos:");
        

    }

    protected void addedToWorld(World mundo)
    {
        mundo.addObject(puntos,300,16);
    }

    /**
     * Act - do whatever the Reloj wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       BlurWorld mundo =(BlurWorld)getWorld();
       
       puntos.setValue(mundo.getPuntos());
    }    
}