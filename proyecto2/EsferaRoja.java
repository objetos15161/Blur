import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class EsferaRoja extends Actor
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    private int rotationalSpeed = 5;
    private int radius = 60;
    private int vel;// adjust as needed
    /**lo mismo que la esfera azul pero en roja  */

    public void act() 
    {

        mueve();

    }
    /** Metodo que pone la esfera en tal posicion y la hace girar en cierto radio*/
    public void orbitWorldCenter()
    {

        setLocation((ROWS/2)+60, (COLS/2)+220);
        turn(rotationalSpeed-90);
        move(radius);
        turn(90);
    }
    /**las esferas giraran dependiendo de la tecla que se presione */
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
    /**si la esfera golpea se le resta a la variable health por medio del metodo loseHealth */
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

