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
    /**Se agrega al mundo antes de que este se cree */
    protected void addedToWorld(World mundo)
    {
        mundo.addObject(valor,189,16);
    }

    /** por cada milisegundos se le agrega 1 al valor del timer*/
    public void act() 
    {
        if(timer.millisElapsed() > 1000)
        {
            valor.add(1);
            timer.mark();
        }
    }    
}