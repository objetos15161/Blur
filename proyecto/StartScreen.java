import greenfoot.*;

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
       static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
      GreenfootSound sound = new GreenfootSound("Blur.mp3");
      private int vel;
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS, COLS, CELL_WIDTH); 
        prepare();
         
    }
  
     public void prepare()
    {
        letrasMenu letrasmenu=new letrasMenu();
        addObject(letrasmenu,202,291);
        
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new blurWorld());
        
        
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
