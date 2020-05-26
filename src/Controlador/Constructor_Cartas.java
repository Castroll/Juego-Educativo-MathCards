
package Controlador;

public class Constructor_Cartas {
    //MATRIZ PARA LOS DATOS DE LAS CARTAS
    //NUMERACION DE CARTA: CORELATIVO,ATAQUE,DEFENSA,IMAGEN
    public String[] card1= {"1","1","5","Card1.png"};
    public String[] card2= {"2","5","1","Card2.png"};
    public String[] card3= {"3","4","2","Card3.png"};
    public String[] card4= {"4","2","4","Card4.png"};
    public String[] card5= {"5","5","3","Card5.png"};
    public String[] card6= {"6","3","5","Card6.png"};
    public String[] card7= {"7","8","1","Card7.png"};
    public String[] card8= {"8","2","2","Card8.png"};
    public String[] card9= {"9","2","2","Card9.png"};
    public String[] card10= {"10","10","10","Card10.png"};
    
    //MAZO JUGADOR
    public static int[] MazoJugador = new int [30];
    public static int[] MazoMescladoJugador = new int[30];
    //MAZO ENEMIGO
    public static int[] MazoEnemigo = new int [30];
    public static int[] MazoMescladoEnemigo = new int[30];
    
    
    
    //CONTADORES DEL JUEGO
    
    public static int ronda = 0; //numero de la ronda
    public static boolean jugadorPrimero;
    
    //CONTADORES DEL JUEGO_JUGADOR
    public static int contadorPosicionCartaJugador = 0; //numero de cartas del mazo robadas
    public static int contadorPosicionManoJugador = 0; //numero de cartas en la mano
    public static int[] manoJugador = new int[6]; // arreglo corespondienta para saber las cartas en la mano del juegador.
    public static int[] campoJugador = new int[5];
    public static int[] battelJugador = new int[5]; //arreglo para la zona de batalla del juagador.
    public static int espaciosDisponiblesJugador = 0; //espacios que se an liberado
    
    //ESPACIO DISPONIBLE JUGADOR
    public static boolean espacioJugador1Disponible = false;
    public static boolean espacioJugador2Disponible = false;
    public static boolean espacioJugador3Disponible = false;
    public static boolean espacioJugador4Disponible = false;
    public static boolean espacioJugador5Disponible = false;
            
    //ESPACIO DISPONIBLE BATTEL JUGADOR
    public static boolean espaciobattelJugador1Disponible = true;
    public static boolean espaciobattelJugador2Disponible = true;
    public static boolean espaciobattelJugador3Disponible = true;
    public static boolean espaciobattelJugador4Disponible = true;
    public static boolean espaciobattelJugador5Disponible = true;
    
    //CONTADORS JUEGO_ENEMIGO
    public static int contadorPosicionCartaEnemigo = 0; //numero de cartas del mazo robadas
    public static int contadorPosicionManoEnemigo = 0; //numero de cartas en la mano
    public static int[] manoEnemigo = new int[6]; // arreglo corespondienta para saber las cartas en la mano del juegador.
    public static int[] campoEnemigo = new int[5];
    public static int[] battelEnemigo = new int[5]; //arreglo para la zona de batalla del juagador.
    public static int espaciosDisponiblesEnemigo = 0; //espacios que se an liberado
    
    //ESPACIO DISPONIBLE ENEMIGO
    public static boolean espacioEnemigo1Disponible = false;
    public static boolean espacioEnemigo2Disponible = false;
    public static boolean espacioEnemigo3Disponible = false;
    public static boolean espacioEnemigo4Disponible = false;
    public static boolean espacioEnemigo5Disponible = false;
}
