import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class EsferaMenuAzul extends EsferaAzul
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    int rotationalSpeed = -5;
    int radius = 60;
    
    int vel;// adjust as needed
    /**lo mismo que la esfera azul , pues la hereda  */
    public void act() 
    {

        mueve();

    }
    public void orbitWorldCenter()
    {

        int rotationalSpeed=-5;
        setLocation((ROWS/2), (COLS/2)+220);
        turn(rotationalSpeed-90);
        move(radius);
        turn(90);
    }

    public void mueve()
    {

       
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
