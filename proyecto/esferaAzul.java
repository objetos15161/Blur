import greenfoot.*;

/**
 * Write a description of class esferaAzul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esferaAzul extends Actor
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    int rotationalSpeed = 5;
    int radius = 60; // adjust as needed
    /**
     * Act - do whatever the esferaRoja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        mueve();

    }

    public void orbitWorldCenter()
    {

        //setLocation((ROWS/2) ,(COLS/2)+220);
        turn(rotationalSpeed-90);
        move(radius);
        turn(90);
    }

    public void mueve()
    {
        int t=5;
        if ( Greenfoot.isKeyDown("left"))
        {
            int rotationalSpeed=-5;
            setLocation((ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed-90);
            move(radius);
            turn(90);
        }        
        if ( Greenfoot.isKeyDown("right"))
        {
            int rotationalSpeed=5;
            setLocation((ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed-90);
            move(radius);
            turn(90);
        }

    } 
}
