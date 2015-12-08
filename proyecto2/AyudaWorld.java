import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class AyudaWorld extends World
{

    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    private GreenfootSound sound = new GreenfootSound("Untitled2.mp3");
   
    /**Constructor */
    public AyudaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS, COLS, CELL_WIDTH); 
        LetrasAyuda letrasayuda=new LetrasAyuda();
        addObject(letrasayuda,203,299);
        started();
    }
    /** Se inician las esferas que son para practicar*/
    public void act()
    {
       
       

        if(Greenfoot.isKeyDown("enter"))
        {
            sound.stop();
            
            StartScreen mundo= new StartScreen();
            Greenfoot.setWorld(mundo);
            

        }
    }

   
    /** Metodo para que la tocar musica*/
    public void started()
    {
        sound.play();
    }
    /** metodo para detener musica */
    public void stopped()
    {
        sound.stop();
    }
}

