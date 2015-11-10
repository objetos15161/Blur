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
    GreenfootSound sound = new GreenfootSound("Blur.mp3");
    private final int numE=50;
    private int elementos[]=new int[numE];
    private int n=0;
    private int vel;
    private SimpleTimer tiempo=new SimpleTimer();
    private Reloj reloj=new Reloj();
    barra b=new barra();

    /**
     * Constructor for objects of class blurWorld.
     * 
     */
    public blurWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS, COLS, CELL_WIDTH);
        vel=3;
        esferaAzul eAzul=new esferaAzul();
        esferaRoja eRoja=new esferaRoja();
        llenaElementos();
        addObject(reloj,189,16);
        addObject ( eAzul, (ROWS/2)-60, (COLS/2)+220);
        addObject( eRoja, (ROWS/2)+60, (COLS/2)+220);
        
        tiempo.mark();
        //creaBarra();
        
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100)<10)
        {
           removeObjects(getObjects(explosionRoja.class));
           removeObjects(getObjects(explosionAzul.class));
        }
        if(tiempo.millisElapsed()>=1000&&n<numE)
         {
             switch(elementos[n])
             {
                 case 1: 
                        creaBarra1();
                        break;
                 case 0:
                        creaBarra2();
                        break;
                 default:break;
             }
            n++;
            tiempo.mark();
         }
            
        
    }
     
 
    public void started()
    {
          //sound.playLoop();
    }
 
    public void stopped()
    {
       // sound.stop();
    }
    public int dameVel()
    {
        return vel;
    }
    public void creaBarra(int x,int y)
    {
        addObject( new barra(), x, y);
    }
    public void creaBarra1()
    {
        addObject( new barra(), 120, 50);
    }  
    public void creaBarra2()
    {
        addObject( new barra(), 280, 50);
    }
    public void llenaElementos()
    {
        for(int i=0;i<numE;i++)
            elementos[i]=Greenfoot.getRandomNumber(100)%2;
    }
    
    
    
  
}



 
   