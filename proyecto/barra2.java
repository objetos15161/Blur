import greenfoot.*;

/**
 *
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Barra2 extends Barra
{
    /** Hereda los metodos de la barra y redifine el metodo caer  */
    public void act() 
    {
        // Add your action code here.
        girar();
        golpear();
        caer();
    }    
     /** hace girar el objeto barra2 con una velocidad incrementada en 1 del mundo */
    public void girar()
    {
        int vel=((BlurWorld)getWorld()).dameVel()+1;
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
}
