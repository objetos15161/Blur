import greenfoot.*;

/**
 * Write a description of class AyudWorld here.
 * 
 * @Author1 (Rafael Renteria Gomez) 
 * @Author2 (Oscar de la Torre Hernandez) 
 * @version (14/noviembre/2015)
 */
public class BlurWorld extends World
{
    public int nivel;
    static private final int ROWS = 400;
    static private final int COLS = 600;
    static private final int CELL_WIDTH = 1;
    private GreenfootSound sound = new GreenfootSound("Blur (mp3cut.net).mp3");
    private GreenfootSound sound2 = new GreenfootSound("blur2.mp3.mp3");
    private GreenfootSound sound3 = new GreenfootSound("Untitled.mp3");
    private GreenfootSound sound4 = new GreenfootSound("Untitled2.mp3");
    private final int numE=50;//numero de obstaculos que caen
    private int nElementos;// variable de obstaculos
    private int elementos[]=new int[numE];
    private int sinobstaculos=0;//variable que se usa cuando no existen obstaculos ya en el mundo
    private int vel;//velocidad del mundo
    private SimpleTimer tiempoE=new SimpleTimer();/**Da el tiempo de explosion para la esfera roja y azul */
    private SimpleTimer tiempoO=new SimpleTimer();/** Da el tiempo de espera para el siguiente obstaculo*/
    private Reloj reloj=new Reloj();
    private Counter counter=new Counter();
    private Puntos puntoS=new Puntos();
    private HealthBar healthBar=new HealthBar();
    private EsferaAzul eAzul=new EsferaAzul();
    private EsferaRoja eRoja=new EsferaRoja();
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

    /**Agrega estrellas al BlurWorld
       paramether howMnay*/
    public void addStars(int howMany)
    { //para hacer que las estrellas se muevan
        for(int s=0;s<howMany;s++)
        {
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

        if(tiempoO.millisElapsed()>=espera&&sinobstaculos<nElementos-1)/**Si pasa el tiempo de espera crea un obstaculo y aumenta n en 1 para el siguiente obstaculo */
        {

            switch(elementos[sinobstaculos])
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
                    if(elementos[sinobstaculos+1]==3||elementos[sinobstaculos+1]==4)
                        espera=1750;
                    else
                        espera=1950;
                    break;
                    case 4:
                    if(elementos[sinobstaculos+1]==3||elementos[sinobstaculos+1]==4)
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
                    if(elementos[sinobstaculos+1]==3||elementos[sinobstaculos+1]==4)
                        espera=1750;
                    else
                        espera=1950;
                    break;
                    case 4:
                    if(elementos[sinobstaculos+1]==3||elementos[sinobstaculos+1]==4)
                        espera=1200;
                    else
                        espera=1850;
                    break;
                } 

                break;
                default:break;

            }
            pierde();
            sinobstaculos++;
            if(sinobstaculos==nElementos-1)
            {
                stopped();
                sigNivel();

            }

            tiempoO.mark();
        }
    }
    /** empieza el siguiente nivel*/
    public void sigNivel()
    {

        switch(nivel)
        {
            case 1: addObject(new InicioNivel2(),ROWS/2,-100);/**se agrega la frase del primer nivel*/
            healthBar.setValue(3);/**caundo completa el nivel la barra de vidas se regenera a 3*/
            break;
            case 2: addObject(new InicioNivel3(),ROWS/2,-100);/**se agrega la frase del 2do nivel*/
            healthBar.setValue(3);
            break;
            case 3:addObject(new InicioNivel4(),ROWS/2,-100);
            healthBar.setValue(3);
            break;            
            case 4:gana();
            break;
        } 
    }
     /**Cuando la vida es igual a 0 aparece una imagen que dice perdiste*/
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
    /**se agrega el objeto gana*/

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
        {
            elementos[i]=Greenfoot.getRandomNumber(2);
        }
    }

    /**Llena el arreglo con numeros aleatorios del 1 al 4 para el nivel 2 */
    public void llenaElementosNivel2()
    {
        for(int i=0;i<nElementos;i++)
        {
            elementos[i]=Greenfoot.getRandomNumber(3);
        }
    }

    /**Llena el arreglo con numeros aleatorios del 1 al 5 para el nivel 3 */
    public void llenaElementosNivel3()
    {
        for(int i=0;i<nElementos;i++)
        {
            elementos[i]=Greenfoot.getRandomNumber(5);
        }
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
        sinobstaculos=0;
        tiempoO.mark();
        borraTodo();
        addObject(new Circulo(),203,488);
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
    /**para que toque la musica dependiendo el nivel*/
    public void started()
    {   
        if(nivel==1)/** musica para el nivel 1 */
        {
            sound4.play();
        }
        if(nivel==2)/**musica para el nivel 2*/
        {
            sound2.play();
        }
        if(nivel==3)/**musica para el nivel 3*/
        {
            sound3.play();
        }
    }
    /**detener todas las canciones*/
    public void stopped()
    {
        sound.stop();
        sound2.stop();
        sound3.stop();
        sound4.stop();
    }
    /**regresa la variable sound*/
    public  GreenfootSound musica()
    {
        return sound;
    }
    /**setear el nivel 1*/
    public void set1()
    {
        sinobstaculos=0;
        espera=3500;
        addObject(new InicioNivel1(),ROWS/2,-100);
        nivel=1;
        vel=2;
        nElementos=20;
        llenaElementosNivel1();

        sound4.play();
    }
    /**setear el nivel 2*/
    public void set2()
    {
        sinobstaculos=0;
        espera=3500;
        //addObject(new MsgNiv2(),ROWS/2,-100);
        nivel=2;
        vel=3;
        nElementos=25;
        llenaElementosNivel2();
        sound2.play();
    }
    /**setear el nivel 3*/
    public void set3()
    {
        sinobstaculos=0;
        espera=3500;
        //addObject(new MsgNiv3(),ROWS/2,-100);
        nivel=3;
        vel=3;
        nElementos=25;
        llenaElementosNivel3();
        sound3.play();
    }
    /**setear el nivel 4 , este nivel solo se obtiene acabando el nivel 3 */
    public void set4()
    {
        sinobstaculos=0;
        espera=3500;

        nivel=4;
        vel=4;
        nElementos=30;
        llenaElementosNivel3();
        sound2.play();
    }
    /**setear menu*/
    public void setMenu()
    {

        StartScreen mundo=new StartScreen();
        stopped();
        Greenfoot.setWorld(mundo);
        mundo.started();

    }

    /**se obtiene el nivel*/
    public int getNivel()
    {
        return nivel;
    }

    /**meotods para hacer funcionar los puntos*/
    public void reiniciaPuntos()
    {
        puntos=0;
    }
    /**se incrementa en uno la variable puntos
       paramether p
       */
    public void sumaPuntos(int p) 
    {
        puntos+=p;
    }
    /**regresa la variable puntos*/
    public int getPuntos()
    {
        return(puntos);
    }

}

   