import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Perdistes extends Barra
{
    SimpleTimer tiempo2=new SimpleTimer();
     GifImage myGif=new GifImage("PERDISTE.gif");
    /**
     * Act - do whatever the Perdistes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Perdistes()
    {
        tiempo2.mark();
    }
    public void act() 
    {
        desaparece();
       // caer();
        setImage(myGif.getCurrentImage());
        ponerTexto();
        // Add your action code here.
    }
       public void ponerTexto()
    {
         BlurWorld mundo=(BlurWorld)getWorld();
         
         this.setLocation(200,300);
           if(tiempo2.millisElapsed()>=2500)
        {
            ((BlurWorld)(getWorld())).setMenu();   
            mundo.removeObject(this);
            
        }
    }
    public void desaparece()
    {
        
     if(tiempo2.millisElapsed()>3000)
            ((BlurWorld)(getWorld())).setMenu(); 
    }
    public void caer()
    {
        int x=getX();
        BlurWorld mundo=(BlurWorld)getWorld();
        int vel=mundo.dameVel();
        this.setLocation(getX(),getY()+vel);
        if(getY()>mundo.getHeight()-10)
        {
            ((BlurWorld)(getWorld())).setMenu(); 
        }

    }
}
