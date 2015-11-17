import greenfoot.*;


    /**
     * Write a description of class BlurWorld here.
     * 
     * @Quemarmota (Rafael Renteria Gomez) 
     * @Oscar1delaTorre (Oscar de la Torre Hernandez) 
     * @version (14/noviembre/2015)
     */
public class BlurWorld extends World
{
    private int nivel;
    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    GreenfootSound sound = new GreenfootSound("Blur.mp3");
    private final int numE=20;
    private int elementos[]=new int[numE];
    private int n=0;
    private int vel;
    private SimpleTimer tiempoE=new SimpleTimer();/**Da el tiempo de explosion para la esfera roja y azul */
    private SimpleTimer tiempo=new SimpleTimer();/** Da el tiempo de espera para el siguiente obstaculo*/
    private Reloj reloj=new Reloj();
    Barra b=new Barra();
    HealthBar healthBar=new HealthBar();
    EsferaAzul eAzul=new EsferaAzul();
    EsferaRoja eRoja=new EsferaRoja();
    private int espera;

    public BlurWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS, COLS, CELL_WIDTH);
        vel=3;

        llenaElementosNivel1();
        addObject(reloj,189,16);
        iniEsferas();
        addObject(healthBar,67,18);
        tiempo.mark();
        sound.play();
        addObject(new Circulo(),203,488);
        //para hacer  estrellas

        GreenfootImage img=new GreenfootImage(ROWS,COLS);
        img.fill();
        setBackground(img);
        addStars(500);
        espera=850;
        //acaba codigo de crear estrellas
        

    }
    /**Agrega estrellas al BlurWorld*/
    public void addStars(int howMany)
    { //para hacer que las estrellas se muevan
        for(int s=0;s<howMany;s++){
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(new Star(),x,y);

        }
    }
    /**Agrega la barra de vida*/
    public HealthBar getHealthBar()//regresa algo cuando le pega a algo
    {
        return healthBar;
    }
    /**Evalua el arreglo y da la secuencia de los objetos que se crean.  */
    public void act()
    {
        if(tiempoE.millisElapsed()>=1000)/**si el tiempo de explosion es = a 1 sec, se borran las esplosiones  */
        {
            removeObjects(getObjects(ExplosionRoja.class));
            removeObjects(getObjects(ExplosionAzul.class));
        }
        if(tiempo.millisElapsed()>=espera&&n<numE-1)/**Si pasa el tiempo de espera crea un obstaculo y aumenta n en 1 para el siguiente obstaculo */
        {
            switch(elementos[n])
            {
                case 0: 
                creaBarra1();
                espera=850;
                break;
                case 1:
                creaBarra2();
                espera=850;
                break;
                case 2:
                creaBarra3();
                if(elementos[n+1]==3||elementos[n+1]==2)/**Si lo que continua es una barra giratoria entonces el tiempo de espera sera 1700 */
                    espera=1700;
                else/**si no es una barra giratoria el tiempor de espera sera 2700 */
                    espera=2700;

                break;
                case 3:
                creaBarra4();/**lo mismo pero para la barra giratoria en sentido opuesto */
                if(elementos[n+1]==3||elementos[n+1]==2)
                    espera=1700;
                else
                    espera=2700;
                break;
                case 4:
                creaBarraCentro();
                espera=850;

                break;
                default:break;
            }
            n++;
            tiempo.mark();
        }

    }
    /**Pide la velocidad al BlurWorld*/
    public int dameVel()
    {
        return vel;
    }
    
    /**Los siguientes metodos son para crear las barras en el BlurWorld*/
    public void creaBarra1()
    {
        addObject( new Barra(), 120, 50);
    }  

    public void creaBarra2()
    {
        addObject( new Barra(), 280, 50);
    }

    public void creaBarra3()
    {
        addObject( new Barra2(), ROWS/2, 50);
    }

    public void creaBarra4()
    {
        addObject( new Barra22(), ROWS/2, 50);
    }

    public void creaBarraCentro()
    {
        addObject( new BarraChica(), ROWS/2, 50);
    }
    /**Llena el arreglo con numeros aleatorios del 1 al 4 */
    public void llenaElementosNivel1()
    {
        for(int i=0;i<numE;i++)
            elementos[i]=Greenfoot.getRandomNumber(5);
    }
    /**Llena el arreglo con numeros aleatorios del 1 al 4 */
    public void llenaElementosNivel2()
    {
        for(int i=0;i<numE;i++)
            elementos[i]=Greenfoot.getRandomNumber(3);
    }
    /**Crea las esferas en sus respectivas posiciones iniciales */
    public void iniEsferas()
    {
        addObject ( eAzul, 188, 461);
        addObject( eRoja, 212, 579);
    }
    /**Este Metodo al momento de explotar es llamado para inicializar el conteo de la explosion  */
    public void iniTiExp()
    {
        tiempoE.mark();
    }
    /**Devuelve del mundo la esfera azul */
    public EsferaAzul getAzul()
    {
        return eAzul;
    }
    /** Devuelve del mundo la esfera roja*/
    public EsferaRoja getRoja()
    {
        return eRoja;
    }
    /**Es llamado en el momento que cualquier obstaculo choca con una esfera para reiniciar todo */
    public void reInicia()
    {
        n=0;
        tiempo.mark();
        borraTodo();
        iniEsferas();
    }
    /**borra todo valga la redundancia  */
    public void borraTodo()
    {
        removeObjects(getObjects(EsferaAzul.class));
        removeObjects(getObjects(Barra.class));
        removeObjects(getObjects(Barra2.class));
        

    }
        public void started()
    {
    sound.play();
    }
    public void stopped()
    {
    sound.stop();
    }
    public  GreenfootSound musica()
    {
        return sound;
    }
    public void set1()
    {
        nivel=1;
    }
    public void set2()
    {
        nivel=2;
    }
    public void set3()
    {
        nivel=3;
    }
}

    

    


   