import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class StartScreen extends World
{
    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    GreenfootSound sound = new GreenfootSound("Blur.mp3");
    private int vel;
    EsferaMenuAzul eAzul2=new EsferaMenuAzul();
    EsferaRojaMenu eRoja2=new EsferaRojaMenu();

      
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

        
    }
     /**  */
    public void act()
    {

        if(Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new BlurWorld());
            sound.stop();

        }
        if (Greenfoot.mouseClicked(Juega.class))
        {
            Greenfoot.setWorld(new BlurWorld());
            sound.stop();
        }

    }
    
    public void started()
    {
    sound.play();
    }
    public void stopped()
    {
    sound.stop();
    }
    public  GreenfootSound musica()
    {
        return sound;
    }
}
