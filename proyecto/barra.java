import greenfoot.*;

/**
 * 
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Barra extends Actor
{
    
    private int vel;
    public void act() 
    {
        // Add your action code here.

        golpear();
        caer();

    }    
     /**Mueve el obstaculo hacia abajo y lo borra cuando llega al fondo  */
    public void caer()
    {
        int x=getX();
        BlurWorld mundo=(BlurWorld)getWorld();
        vel=mundo.dameVel();
        this.setLocation(getX(),getY()+vel);
        if(getY()>mundo.getHeight()-10)
        {
            mundo.removeObject(this);
        }

    }
     /**Si toca una esfera roja se pida al mundo la identidad de esa esfera y se activa el metodo golpear en los objestos tipo esfera  */
    public void golpear()
    {
        BlurWorld mundo=(BlurWorld)getWorld();
        if(isTouching(EsferaAzul.class))
        {
            (mundo.getAzul()).golpear();
        }
        if(isTouching(EsferaRoja.class))
        {
            (mundo.getRoja()).golpear();

        }

    }
}
