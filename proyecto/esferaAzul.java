import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class EsferaAzul extends Actor
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    int rotationalSpeed = 5; /** inicializa la velocidad de rotacion */
    int radius = 60; // adjust as needed
    private int vel;
    /**
     * Act - do whatever the esferaRoja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueve();


    }
     /**Base para que los objetos giren  */
    public void orbitWorldCenter()
    {
        BlurWorld mundo= (BlurWorld)getWorld();
        vel=(mundo.dameVel());

        setLocation((ROWS/2) ,(COLS/2)+220);
        turn(rotationalSpeed-90);
        move(radius);
        turn(90);
    }
     /**A partir de la base se crea el metodo para que giren con las teclas indicadas  */
    public void mueve()
    {
        BlurWorld mundo= (BlurWorld)getWorld();

        vel=mundo.dameVel()+1;
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
     /**Este metodo es llamado por cualquiera de las barras para que explote la esfera  */
    public void golpear()
    {   
        
            
        World myWorld=getWorld();//lineas de codigo para la healthBar

        BlurWorld blurworld=(BlurWorld)myWorld;

        HealthBar healthbar=blurworld.getHealthBar();
        healthbar.loseHealth();

        //Termina lineas de codigo de la healthbar
        BlurWorld mundo=(BlurWorld)getWorld();
        int x=getX(),y=getY(); 

        mundo.removeObject(this);
        mundo.addObject( new ExplosionAzul(),x,y);
        mundo.iniTiExp();

    }
}
