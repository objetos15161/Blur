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
    GreenfootSound sound2 = new GreenfootSound("blur2.mp3");
    GreenfootSound sound3 = new GreenfootSound("blur3.mp3");
    GreenfootSound sound4 = new GreenfootSound("Duet OST - Arete l.mp3");
    private final int numE=50;
    private int nElementos;
    private int elementos[]=new int[numE];
    private int n=0;
    private int vel;
    private SimpleTimer tiempoE=new SimpleTimer();/**Da el tiempo de explosion para la esfera roja y azul */
    private SimpleTimer tiempoO=new SimpleTimer();/** Da el tiempo de espera para el siguiente obstaculo*/
    private Reloj reloj=new Reloj();
    private Counter counter=new Counter();
    private Puntos puntoS=new Puntos();
    HealthBar healthBar=new HealthBar();
    EsferaAzul eAzul=new EsferaAzul();
    EsferaRoja eRoja=new EsferaRoja();
    //Perdistes perdistes= new Perdistes();
    private int espera;
    private int pierde=0;
    private int puntos;

    public BlurWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS, COLS, CELL_WIDTH);

        addObject(reloj,189,16);
        
        addObject(puntoS,300,16);
        iniEsferas();
        addObject(healthBar,67,18);
        tiempoO.mark();
        //sound.play();
        addObject(new Circulo(),203,488);
        //para hacer  estrellas
        puntos=0;
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

        if(tiempoO.millisElapsed()>=espera&&n<nElementos-1)/**Si pasa el tiempo de espera crea un obstaculo y aumenta n en 1 para el siguiente obstaculo */
        {

            switch(elementos[n])
            {
                case 0: 

                creaBarra1();

                switch(nivel)
                {
                    case 1:espera=1050;
                    break;
                    case 2:espera=750;
                    break;
                    case 3:espera=750;
                    break;
                    case 4:espera=580;
                    break;

                }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
                break;
                case 1:
                creaBarra2();
                switch(nivel)
                {
                    case 1:espera=1050;
                    break;
                    case 2:espera=750;
                    break;
                    case 3:espera=750;
                    break;
                    case 4:espera=580;
                    break;

                }
                break;
                case 2:creaBarraCentro();
                switch(nivel)
                {
                    case 1:espera=1050;
                    break;
                    case 2:espera=750;
                    break;
                    case 3:espera=750;
                    break;
                    case 4:espera=580;
                    break;

                }
                break;
                case 3:
                creaBarra3();/**lo mismo pero para la barra giratoria en sentido opuesto */
                switch(nivel)
                {
                    case 3:
                    if(elementos[n+1]==3||elementos[n+1]==4)
                        espera=1750;
                    else
                        espera=1950;
                    break;
                    case 4:
                    if(elementos[n+1]==3||elementos[n+1]==4)
                        espera=1200;
                    else
                        espera=1850;
                    break;
                }   
                break;
                case 4:
                creaBarra4();/**lo mismo pero para la barra giratoria en sentido opuesto */
                switch(nivel)
                {
                    case 3:
                    if(elementos[n+1]==3||elementos[n+1]==4)
                        espera=1750;
                    else
                        espera=1950;
                    break;
                    case 4:
                    if(elementos[n+1]==3||elementos[n+1]==4)
                        espera=1200;
                    else
                        espera=1850;
                    break;
                } 

                break;
                default:break;

            }
            pierde();
            n++;
            if(n==nElementos-1)
            {
                stopped();
                sigNivel();
                
            }

            
            tiempoO.mark();

        }

    }
    
    public void sigNivel()
    {
       
            switch(nivel)
            {
                case 1: addObject(new InicioNivel2(),ROWS/2,-100);
                        healthBar.setValue(3);
                break;
                case 2: addObject(new InicioNivel3(),ROWS/2,-100);
                        healthBar.setValue(3);
                break;
                case 3:addObject(new InicioNivel4(),ROWS/2,-100);
                       healthBar.setValue(3);
                break;            
                case 4:gana();
                break;
            } 
        }

    public void pierde()
    {
        if(healthBar.getValue()==0&&pierde==0)
        {
            borraTodo();
            addObject(new Perdistes(),ROWS/2,0);

            espera=30000;
            pierde=1;
        }
    }

    public void gana()
    {
       
        addObject(new Gana(),ROWS/2,0);
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
        if(nivel<4)
            addObject( new Barra2(), ROWS/2, 65);
        else
            addObject( new Barra2(), ROWS/2, 15);
    }

    public void creaBarra4()
    {
        if(nivel<4)
            addObject( new Barra22(), ROWS/2, 65);
        else
            addObject( new Barra22(), ROWS/2, 15);
    }

    public void creaBarraCentro()
    {
        addObject( new BarraChica(), ROWS/2, 50);
    }

    /**Llena el arreglo con numeros aleatorios del 1 al 2 para el nivel 1 */
    public void llenaElementosNivel1()
    {
        for(int i=0;i<nElementos;i++)
            elementos[i]=Greenfoot.getRandomNumber(2);
    }

    /**Llena el arreglo con numeros aleatorios del 1 al 4 para el nivel 2 */
    public void llenaElementosNivel2()
    {
        for(int i=0;i<nElementos;i++)
            elementos[i]=Greenfoot.getRandomNumber(3);
    }

    /**Llena el arreglo con numeros aleatorios del 1 al 5 para el nivel 3 */
    public void llenaElementosNivel3()
    {
        for(int i=0;i<nElementos;i++)
            elementos[i]=Greenfoot.getRandomNumber(5);
    }

    /**Crea las esferas en sus respectivas posiciones iniciales utilizando las variables eAzul y eRoja */
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
        tiempoO.mark();
        borraTodo();
        iniEsferas();
    }

    /**borra todo valga la redundancia  */
    public void borraTodo()
    {
        removeObjects(getObjects(EsferaAzul.class));
        removeObjects(getObjects(EsferaRoja.class));
        removeObjects(getObjects(Barra.class));
        removeObjects(getObjects(Barra2.class));
        removeObjects(getObjects(Circulo.class));

    }

    public void started()
    {   
        if(nivel==1)
        {
             sound4.play();
        }
        if(nivel==2)
        {
            sound2.play();
        }
        if(nivel==3)
        {
            sound3.play();
        }
    }

    public void stopped()
    {
        sound.stop();
        sound2.stop();
        sound3.stop();
        sound4.stop();
    }

    public  GreenfootSound musica()
    {
        return sound;
    }

    public void set1()
    {
        n=0;
        espera=3500;
        addObject(new InicioNivel1(),ROWS/2,-100);
        nivel=1;
        vel=2;
        nElementos=20;
        llenaElementosNivel1();

         sound4.play();
    }

    public void set2()
    {
        n=0;
        espera=3500;
        //addObject(new MsgNiv2(),ROWS/2,-100);
        nivel=2;
        vel=3;
        nElementos=25;
        llenaElementosNivel2();
        sound2.play();
    }

    public void set3()
    {
        n=0;
        espera=3500;
       //addObject(new MsgNiv3(),ROWS/2,-100);
        nivel=3;
        vel=3;
        nElementos=5;
        llenaElementosNivel3();
        sound3.play();
    }

    public void set4()
    {
        n=0;
        espera=3500;
        
        nivel=4;
        vel=4;
        nElementos=5;
        llenaElementosNivel3();
        sound2.play();
    }

    public void setMenu()
    {

        StartScreen mundo=new StartScreen();
        stopped();
        Greenfoot.setWorld(mundo);
        mundo.started();

    }
    public int getNivel()
    {
        return nivel;
    }
    public void reiniciaPuntos()
    {
        puntos=0;
    }
    public void sumaPuntos(int p) 
    {
        puntos+=p;
    }
    
    public int getPuntos()
    {
        return(puntos);
    }
    
}

   