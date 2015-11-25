import greenfoot.*;
/**
 * 
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class EsferaRoja extends Actor
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    int rotationalSpeed = 5;
    int radius = 60;
    int vel;// adjust as needed
    /**lo mismo que la esfera azul pero en roja  */

    public void act() 
    {

        mueve();

    }

    public void orbitWorldCenter()
    {

        setLocation((ROWS/2)+60, (COLS/2)+220);
        turn(rotationalSpeed-90);
        move(radius);
        turn(90);
    }

    public void mueve()
    { 
        BlurWorld mundo= (BlurWorld)getWorld();
        vel=mundo.dameVel()+1;
        if ( Greenfoot.isKeyDown("left"))
        {
            int rotationalSpeed =-vel;
            setLocation( (ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed+90);
            move(radius);
            turn(-90);
        }        
        if ( Greenfoot.isKeyDown("right"))
        {
            int rotationalSpeed =vel;
            setLocation( (ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed+90);
            move(radius);
            turn(-90);
        }

    } 

    public void golpear()
    {
        BlurWorld mundo=(BlurWorld)getWorld();
        
        World myWorld=getWorld();

        BlurWorld blurworld=(BlurWorld)myWorld;

        HealthBar healthbar=blurworld.getHealthBar();
        healthbar.loseHealth();

        int x=getX(),y=getY();

        mundo.removeObject(this);
        mundo.addObject(new ExplosionRoja(),x,y);
        mundo.iniTiExp();      

    }
}

