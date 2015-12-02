import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
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
   private GifImage myGif=new GifImage("noestassolo.gif");
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
    /** pone el texto en una posicion*/
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
    /**Este metodo solo se manda llamar cuando el juego es completado*/
    public Gana()
    {
        ini=0;
        tiempoIni.mark();
    }
    /**Metodo utilizado de las barras para hacer que el texto caiga*/
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
    /**se inicia el tiempo*/
    public void inicio()
    {
       if(tiempoIni.millisElapsed()>=3000&&ini==0)
       {
            tiempo.mark();
            ini=1;
       }
    }
}
