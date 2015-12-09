import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class InicioNivel2 extends InicioNivel1
{
    /**
     * Act - do whatever the InicioNivel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private SimpleTimer tiempo=new SimpleTimer();
    private SimpleTimer tiempoIni=new SimpleTimer();
      GifImage myGif=new GifImage("caos.gif");
    private int ini;
    public void act() 
    {
        inicio();
        caer();
         setImage(myGif.getCurrentImage());
        
        // Add your action code here.
    }
    public InicioNivel2()
    {
        ini=0;
        tiempoIni.mark();
    }
      public void PonerTexto()
    {
         BlurWorld mundo=(BlurWorld)getWorld();
         this.setLocation(200,300);
           if(tiempo.millisElapsed()>=2500)
        {
            
          //mundo.set2();
            mundo.removeObject(this);
        }
    }
     public void caer()
    {
        int vel;
        int x=getX();
        BlurWorld mundo=(BlurWorld)getWorld();
        vel=mundo.dameVel();
        if(ini==1)
            this.setLocation(getX(),getY()+vel);
        if(tiempo.millisElapsed()>=3000||getY()>590)
        {
            mundo.set2();
            mundo.removeObject(this);
    
        }

    }
    public void inicio()
    {
       if(tiempoIni.millisElapsed()>=1000&&ini==0)
       {
            tiempo.mark();
            ini=1;
       }
    }
}