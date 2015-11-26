import greenfoot.*;

/**
 * Write a description of class PasaNivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InicioNivel1 extends Barra
{
    /**
     * Act - do whatever the PasaNivel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private SimpleTimer tiempo=new SimpleTimer();
    private SimpleTimer tiempoIni=new SimpleTimer();
    private int ini;
      GifImage myGif=new GifImage("frase1.gif");
    public void act() 
    {
        
        setImage(myGif.getCurrentImage());
        inicio();
        PonerTexto();
        //caer();
        // Add your action code here.
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
    public InicioNivel1()
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
