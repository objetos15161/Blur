import greenfoot.*;

/**
 * Write a description of class TryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditosWorld extends World
{   
    static private final int ROWS = 600;
    static private final int COLS = 400;
    static private final int CELL_WIDTH = 1;
    GreenfootSound sound = new GreenfootSound("Untitled2.mp3");

    /**Mundo que pregunta si desea intentar de nuevo el nivel o regresar al menu */
    public CreditosWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(COLS, ROWS, CELL_WIDTH);
        started();
    }
    /**serie de transiciones*/
    public void act()
    {

        setBackground("creditos1.png");
        Greenfoot.delay(200);
        setBackground("creditos2.png");
        Greenfoot.delay(200);   
        setBackground("creditos8.png");
        Greenfoot.delay(200);
        setBackground("creditos4.png");
        Greenfoot.delay(200);
        setBackground("creditos5.png");
        Greenfoot.delay(200);
        setBackground("creditos6.png");
        Greenfoot.delay(200);
        setBackground("creditos7.png");
        Greenfoot.delay(200);
        sound.stop();
        Greenfoot.setWorld(new StartScreen());

    }
    /**metodos por que funciones solo en c++ para la musica*/
    public void started()
    {
        sound.play();
    }

    public void stopped()
    {
        sound.stop();
    }
}