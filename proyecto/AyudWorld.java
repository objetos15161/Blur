import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class AyudWorld extends World
{

    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    GreenfootSound sound = new GreenfootSound("Blur.mp3");
    private int vel;
    EsferaMenuAzul eAzul2=new EsferaMenuAzul();
    EsferaRojaMenu eRoja2=new EsferaRojaMenu();

      
    public AyudWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        LetrasAyuda letrasayuda=new LetrasAyuda();
        addObject(letrasayuda,202,120);
        Circulo cir=new Circulo();
        addObject(cir,203,488);
    }

    public void act()
    {

        iniEsferas();

        
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new StartScreen());

        }
    }
    /**Se utiliza para agregar las esferas al Mundo*/
    public void iniEsferas()
    {
        addObject ( eAzul2, 188, 461);
        addObject( eRoja2, 212, 579);
    }
}
