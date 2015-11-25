import greenfoot.*;

/**
 * 
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Barra22 extends Barra2
{
     /**hereda de la barra2 y redifine la Metodo girar  */
   private SimpleTimer tiempoG;
   private SimpleTimer tiempoC;
   public Barra22()
   {
       tiempoC=new SimpleTimer();
       tiempoG=new SimpleTimer();
       tiempoG.mark();
       tiempoC.mark();
       
    }
     public void act() 
    {
        if(((BlurWorld)getWorld()).getNivel()<4)
        {
             girar();
        golpear();
        caer();
        }
        else
        {
            girarNiv4();
            golpear();
            caerNiv4();
        }
        // Add your action code here.
    }   
     /**Hace girar en sentido contrario al objeto barra22  */
    public void girar()
    {
           int vel;
        if(((BlurWorld)getWorld()).getNivel()<4)
            vel=((BlurWorld)getWorld()).dameVel()+1;
        else
            vel=((BlurWorld)getWorld()).dameVel()+1;
        turn(-vel);
    }
    public void girarNiv4()
    {
         if(tiempoG.millisElapsed()>=10)
            girar();
    }
     public void caerNiv4()
    {
         if(tiempoC.millisElapsed()>=200)
            caer();
    }
}

