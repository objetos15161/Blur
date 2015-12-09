import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class StartScreen extends World
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    private GreenfootSound sound = new GreenfootSound("Blur (mp3cut.net).mp3");
    
   

      
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
    
    /** Prepara la StartScreen con sus respectivos objetos*/
     
    
    public void prepare()
    {
        
        Fondo fondo=new Fondo();
        addObject(fondo,202,120);

        Niveles niveles=new Niveles();
        addObject(niveles,196 ,180);

        Ayuda ayuda=new Ayuda();
        addObject(ayuda,100 ,546);

        Creditos creditos=new Creditos();
        addObject(creditos,300 ,546);

        Uno uno=new Uno();
        addObject(uno,196,260);

        Dos dos=new Dos();
        addObject(dos,196,340);

        Tres tres=new Tres();
        addObject(tres,196,420);
        //started();
        sound.play();
        
    }
     /** Si la tecla 1 es presionada el nivel 1 empezara asi hasta el nivel 4 */
    public void act()
    {
        
        if(Greenfoot.isKeyDown("1"))
        {
           BlurWorld blur=new BlurWorld();
            stopped();
            Greenfoot.setWorld(blur);
            blur.set1();
        }
          if(Greenfoot.isKeyDown("2"))
        {
           BlurWorld blur=new BlurWorld();
            stopped();
            Greenfoot.setWorld(blur);
            blur.set2();
        }
          if(Greenfoot.isKeyDown("3"))
        {
           BlurWorld blur=new BlurWorld();
            stopped();
            Greenfoot.setWorld(blur);
            blur.set3();
        }
          if(Greenfoot.isKeyDown("4"))
        {
           BlurWorld blur=new BlurWorld();
            stopped();
            Greenfoot.setWorld(blur);
            blur.set4();
        }
      

    }
    /**metodo para tocar la musica */
    public void started()
    {
    sound.play();
    }
    /**metodo para detener la musica */
    public void stopped()
    {
    sound.stop();
    }
    /**regresa la variable sound */
    public  GreenfootSound musica()
    {
        return sound;
    }
}
