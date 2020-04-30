/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Diego
 */
public class Constructor_Menu 
{
    //MATRICEZ PARA LLENAR LA CABECERA DE LAS TABLAS
    public String[] Cabecera_TablaPuntuacion= {"ID Partida","Nombre_Jugador","Puntuacion"};
    public String[] Cabecera_TablaPuntuacionVersus= {"ID Partida","Jugador 1","Jugador 2","Puntuacion 1","Puntuacion 2","Ganador"};
    
    //MATRICEZ PARA ALMACENAR LOS DATOS DE LOS JUGADORES
    public static String[][] Individuales = {{"1","Castroll","1500"},{"2","BubaElGrande","2200"},{"3","Ramdom","2800"}};
    public static String[][] Versus ={{"1","Castroll","BubaElGrande","1300","1400","BubaElGrande"},{"2","Kstro","Elias","1600","1500","Kstro"}};
    
    //VARIABLE ESTATICA PARA VALIDAR MODO DE JUEGO
    public static String modalidad;
}
