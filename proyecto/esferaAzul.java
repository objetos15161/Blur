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
    private int vel;
    /**
     * Act - do whatever the esferaRoja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        mueve();
        golpear();

    }

    public void orbitWorldCenter()
    {
        blurWorld mundo= (blurWorld)getWorld();
        vel=(mundo.dameVel());

        setLocation((ROWS/2) ,(COLS/2)+220);
        turn(rotationalSpeed-90);
        move(radius);
        turn(90);
    }

    public void mueve()
    {
        blurWorld mundo= (blurWorld)getWorld();
        vel=(mundo.dameVel());
        int t=5;
        if ( Greenfoot.isKeyDown("left"))
        {
            int rotationalSpeed=-vel;
            setLocation((ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed-90);
            move(radius);
            turn(90);
        }        
        if ( Greenfoot.isKeyDown("right"))
        {
            int rotationalSpeed=vel;
            setLocation((ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed-90);
            move(radius);
            turn(90);
        }

    } 
      public void golpear()
    {
        World mundo=getWorld();
        explosion e= new explosion();
        int x=getX(),y=getY();
        if(isTouching(barra.class))
        {
            mundo.removeObject(this);
            mundo.addObject(e,x,y);
        }
            
    }
}
