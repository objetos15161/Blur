import greenfoot.*;

/**
 * Write a description of class Gana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gana extends InicioNivel1
{
    /**
     * Act - do whatever the Gana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  private SimpleTimer tiempo=new SimpleTimer();
    private SimpleTimer tiempoIni=new SimpleTimer();
     private SimpleTimer tiempoQ=new SimpleTimer();
    private int ini;
    GifImage myGif=new GifImage("noestassolo.gif");
    public void act() 
    {
        inicio();
        setImage(myGif.getCurrentImage());
        if((getY()<getWorld().getHeight()/2))
        {
             caer();
             tiempoQ.mark();
        }
         else    
          
         ponerTexto();
        // Add your action code here.
    }
       public void ponerTexto()
    {
         BlurWorld mundo=(BlurWorld)getWorld();
         
         this.setLocation(200,getWorld().getHeight()/2);
           if(tiempoQ.millisElapsed()>=2500)
        {
            ((BlurWorld)(getWorld())).setMenu();   
            mundo.removeObject(this);
            
        }
    }
    public Gana()
    {
        ini=0;
        tiempoIni.mark();
    }
     public void caer()
    {
        int vel;
        int x=getX();
        BlurWorld mundo=(BlurWorld)getWorld();
        vel=mundo.dameVel();
        if(ini==1)
            this.setLocation(getX(),getY()+vel);
        if(tiempo.millisElapsed()>=3000)
        {
             //mundo.set2();
            mundo.removeObject(this);
        }

    }
    public void inicio()
    {
       if(tiempoIni.millisElapsed()>=3000&&ini==0)
       {
            tiempo.mark();
            ini=1;
       }
    }
}
