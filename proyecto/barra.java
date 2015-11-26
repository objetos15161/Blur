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
            switch(mundo.getNivel())
            {
                case 1: mundo.sumaPuntos(10);
                break;
                case 2: mundo.sumaPuntos(20);
                break;
                case 3: mundo.sumaPuntos(30);
                break;
                case 4: mundo.sumaPuntos(40);
                break;
            }

        }
    }
    /**Si toca una esfera roja se pida al mundo la identidad de esa esfera y se activa el metodo golpear en los objestos tipo esfera  */
    public void golpear()
    {
        BlurWorld mundo=(BlurWorld)getWorld();
        if(isTouching(EsferaAzul.class))
        {
            (mundo.getAzul()).golpear();
            mundo.reiniciaPuntos();
        }

        if(isTouching(EsferaRoja.class))
        {
            (mundo.getRoja()).golpear();
            mundo.reiniciaPuntos();

        }

    }
}
