import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class EsferaRojaMenu extends EsferaRoja
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
     private int rotationalSpeed = 5;
    private int radius = 60;
    private int vel;// adjust as needed
    /**
     * Act - do whatever the esferaRoja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        mueve();

    }
    /** Metodo que pone la esfera en tal posicion y la hace girar en cierto radio*/
    public void orbitWorldCenter()
    {

        int rotationalSpeed =-5;
        setLocation( (ROWS/2), (COLS/2)+220);
        turn(rotationalSpeed+90);
        move(radius);
        turn(-90);
    } 
     /**las esferas giraran dependiendo de la tecla que se presione */
    public void mueve()
    { 

        if ( Greenfoot.isKeyDown("left"))
        {
            int rotationalSpeed =-5;
            setLocation( (ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed+90);
            move(radius);
            turn(-90);
        }        
        if ( Greenfoot.isKeyDown("right"))
        {
            int rotationalSpeed =5;
            setLocation( (ROWS/2), (COLS/2)+220);
            turn(rotationalSpeed+90);
            move(radius);
            turn(-90);
        }

    } 
}
