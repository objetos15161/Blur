import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class BarraGiraDerecha extends Barra
{
    /** Hereda los metodos de la barra y redifine el metodo caer  */
  
      private SimpleTimer tiempoG;
   private SimpleTimer tiempoC;
   public BarraGiraDerecha()
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
     /** hace girar el objeto barra2 con una velocidad incrementada en 1 del mundo */
    public void girar()
    {
        int vel;
        if(((BlurWorld)getWorld()).getNivel()<4)
            vel=((BlurWorld)getWorld()).dameVel()+1;
        else
            vel=((BlurWorld)getWorld()).dameVel()+2;
        turn(vel);
    }
     /**pide al mundo la velocidad y hace caer el obstaCULO con una disminucion de 1 */
    public void caer()
    {
        int x=getX();
        BlurWorld mundo=(BlurWorld)getWorld();
        int vel=mundo.dameVel()-1;
        this.setLocation(getX(),getY()+vel);
        if(getY()>mundo.getHeight()-10)
        {
            mundo.removeObject(this);
            //mundo.creaBarra(x,50);
        }
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
