import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
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
    private GifImage myGif=new GifImage("frase1.gif");
    public void act() 
    {

        setImage(myGif.getCurrentImage());
        inicio();
        PonerTexto();
        //caer();
        // Add your action code here.
    }

    /** pone el texto en una posicion*/
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

    /**Este metodo solo se manda llamar cuando el juego es completado*/
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

    /**se inicia el tiempo*/
    public void inicio()
    {
        if(tiempoIni.millisElapsed()>=1000&&ini==0)
        {
            tiempo.mark();                                                                                                                                                  
            ini=1;
        }
    }
}
