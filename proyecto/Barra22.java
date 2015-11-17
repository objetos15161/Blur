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
    public void act() 
    {
        girar();
        golpear();
        caer();
        // Add your action code here.
    }   
     /**Hace girar en sentido contrario al objeto barra22  */
    public void girar()
    {
        int vel=((BlurWorld)getWorld()).dameVel()+1;
        turn(-vel);
    }
}

