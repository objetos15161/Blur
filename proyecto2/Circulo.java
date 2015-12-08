import greenfoot.*;


/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class Circulo extends Actor
{
       
    /**constructor del circulo que inicia la imagen y la pone en posicion*/
    public void circulo()
    {
        GreenfootImage myImage=getImage();
        int myNewHeight=(int)myImage.getHeight()/2;
        int myNewWidth=(int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
