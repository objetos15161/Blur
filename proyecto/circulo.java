import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Quemarmota (Rafael Renteria Gomez) 
 * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Circulo extends Actor
{
    /**
     * Act - do whatever the circulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void circulo()
    {
        GreenfootImage myImage=getImage();
        int myNewHeight=(int)myImage.getHeight()/2;
        int myNewWidth=(int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
