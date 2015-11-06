import greenfoot.*;

/**
 * Write a description of class blurWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blurWorld extends World
{
    
    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    static public int [ ][ ] cell = new int [ROWS][COLS];
    
    GreenfootSound sound = new GreenfootSound("Blur.mp3");

    /**
     * Constructor for objects of class blurWorld.
     * 
     */
    public blurWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS, COLS, CELL_WIDTH);
        
        esferaAzul eAzul=new esferaAzul();
        esferaRoja eRoja=new esferaRoja();
        
        addObject ( eAzul, (ROWS/2), (COLS/2)+220);
        addObject( eRoja, (ROWS/2), (COLS/2)+220);
        
    }
     
 
    public void started()
    {
          sound.playLoop();
    }
 
    public void stopped()
    {
        sound.stop();
    }
  
}



 
   