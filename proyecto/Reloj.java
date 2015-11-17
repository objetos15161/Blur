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
public class Reloj extends Actor
{
    private SimpleTimer timer;
    private Counter valor;
    /**este codigo lo vi en clases  */
    public Reloj()
    {
        valor = new Counter(" ");
        timer = new SimpleTimer();

    }

    protected void addedToWorld(World mundo)
    {
        mundo.addObject(valor,189,16);
    }

    /**
     * Act - do whatever the Reloj wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(timer.millisElapsed() > 1000)
        {
            valor.add(1);
            timer.mark();
        }
    }    
}