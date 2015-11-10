import greenfoot.*;
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reloj extends Actor
{
    private SimpleTimer timer;
    private Counter valor;
    
    
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