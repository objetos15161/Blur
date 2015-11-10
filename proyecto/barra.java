import greenfoot.*;

/**
 * Write a description of class barra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barra extends Actor
{
    /**
     * Act - do whatever the barra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vel;
    public void act() 
    {
        // Add your action code here.
        caer();
    }    
    public void caer()
    {
        blurWorld mundo=(blurWorld)getWorld();
        vel=mundo.dameVel();
        this.setLocation(getX(),getY()+vel);
        if(getY()>mundo.getHeight()-10)
            mundo.removeObject(this);
            mundo.creaBarra();
            
    }
}
