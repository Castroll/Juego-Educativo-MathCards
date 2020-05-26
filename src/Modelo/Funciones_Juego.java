package Modelo;

import Controlador.Constructor_Cartas;
import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author mirna
 */
public class Funciones_Juego {
    
    Constructor_Cartas c_cartas = new Constructor_Cartas();
    
    public static int generarRandom(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
    }
    //FUNCIONES DEL JUEGO_JUGADOR
    
    public void llenar(){
        Constructor_Cartas.MazoJugador[0] = 1;
        Constructor_Cartas.MazoJugador[2] = 1;
        Constructor_Cartas.MazoJugador[3] = 1;
        Constructor_Cartas.MazoJugador[4] = 2;
        Constructor_Cartas.MazoJugador[5] = 2;
        Constructor_Cartas.MazoJugador[6] = 2;
        Constructor_Cartas.MazoJugador[7] = 3;
        Constructor_Cartas.MazoJugador[8] = 3;
        Constructor_Cartas.MazoJugador[9] = 3;
        Constructor_Cartas.MazoJugador[10] = 4;
        Constructor_Cartas.MazoJugador[11] = 4;
        Constructor_Cartas.MazoJugador[12] = 4;
        Constructor_Cartas.MazoJugador[14] = 5;
        Constructor_Cartas.MazoJugador[15] = 5;
        Constructor_Cartas.MazoJugador[16] = 5;
        Constructor_Cartas.MazoJugador[17] = 6;
        Constructor_Cartas.MazoJugador[18] = 6;
        Constructor_Cartas.MazoJugador[19] = 6;
        Constructor_Cartas.MazoJugador[20] = 7;
        Constructor_Cartas.MazoJugador[21] = 7;
        Constructor_Cartas.MazoJugador[22] = 7;
        Constructor_Cartas.MazoJugador[23] = 8;
        Constructor_Cartas.MazoJugador[24] = 8;
        Constructor_Cartas.MazoJugador[25] = 8;
        Constructor_Cartas.MazoJugador[26] = 9;
        Constructor_Cartas.MazoJugador[27] = 9;
        Constructor_Cartas.MazoJugador[28] = 9;
        Constructor_Cartas.MazoJugador[29] = 10;
        Constructor_Cartas.MazoJugador[1] = 10;
        Constructor_Cartas.MazoJugador[13] = 5;
        
        //MANO JUGADOR
        for (int i = 0; i < 6; i++) {
            Constructor_Cartas.manoJugador[i] = 0;
        }
        //CAMPO JUGADOR
        for (int i = 0; i < 5; i++) {
            Constructor_Cartas.campoJugador[i] = 0;
        }
        //BATTEL
        for (int i = 0; i < 5; i++) {
            Constructor_Cartas.battelJugador[i] = 0;
        }
        
    }
    public void  mesclar_Mazo(){
        for (int i = 0; i < 30; i++) {
            int x = generarRandom(0,29);
            //JOptionPane.showMessageDialog(null,x);
            Constructor_Cartas.MazoMescladoJugador[i] = Constructor_Cartas.MazoJugador[x];
            //JOptionPane.showMessageDialog(null, "Carta Asignada1"+Constructor_Cartas.MazoMesclado[i]);
        }
    }
    public int robar(){
        //JOptionPane.showMessageDialog(null, "contadorManoJugador"+Constructor_Cartas.contadorPosicionManoJugador);
        Constructor_Cartas.manoJugador[Constructor_Cartas.contadorPosicionManoJugador] = Constructor_Cartas.MazoMescladoJugador[Constructor_Cartas.contadorPosicionCartaJugador];
        int carta = Constructor_Cartas.manoJugador[Constructor_Cartas.contadorPosicionManoJugador];
        Constructor_Cartas.contadorPosicionCartaJugador++;
        Constructor_Cartas.contadorPosicionManoJugador = evaluacionDelContador();
        return carta;
    }
    public int evaluacionDelContador(){
        int contador = 0;
        boolean encontrado = false;
        for (int i = 0; i < 6; i++) {
            if (Constructor_Cartas.manoJugador[i] == 0){
                if (encontrado == false) {
                    contador = i;
                    encontrado = true;
                }
            }
        }
        //JOptionPane.showMessageDialog(null,contador);
        return contador;
    }
    public void cambioDeRonda(){
        if (Constructor_Cartas.espaciosDisponiblesJugador < 6) {
            switch(Constructor_Cartas.espaciosDisponiblesJugador){
                case 1:
                    Constructor_Cartas.espacioJugador1Disponible = true;
                    break;
                case 2:
                    Constructor_Cartas.espacioJugador2Disponible = true;
                    break;
                case 3:
                    Constructor_Cartas.espacioJugador3Disponible = true;
                    break;
                case 4:
                    Constructor_Cartas.espacioJugador4Disponible = true;
                    break;    
                case 5:
                    Constructor_Cartas.espacioJugador5Disponible = true;   
                    break;
            }
        }
    }
    
    //FUNCIONES DEL JUEGO_ENEMIGO
    
    public void llenarEnemigo(){
        Constructor_Cartas.MazoEnemigo[0] = 1;
        Constructor_Cartas.MazoEnemigo[1] = 1;
        Constructor_Cartas.MazoEnemigo[2] = 10;
        Constructor_Cartas.MazoEnemigo[3] = 1;
        Constructor_Cartas.MazoEnemigo[4] = 2;
        Constructor_Cartas.MazoEnemigo[5] = 2;
        Constructor_Cartas.MazoEnemigo[6] = 2;
        Constructor_Cartas.MazoEnemigo[7] = 3;
        Constructor_Cartas.MazoEnemigo[8] = 3;
        Constructor_Cartas.MazoEnemigo[9] = 3;
        Constructor_Cartas.MazoEnemigo[10] = 4;
        Constructor_Cartas.MazoEnemigo[11] = 4;
        Constructor_Cartas.MazoEnemigo[12] = 4;
        Constructor_Cartas.MazoJugador[13] = 4;
        Constructor_Cartas.MazoEnemigo[14] = 5;
        Constructor_Cartas.MazoEnemigo[15] = 5;
        Constructor_Cartas.MazoEnemigo[16] = 5;
        Constructor_Cartas.MazoEnemigo[17] = 6;
        Constructor_Cartas.MazoEnemigo[18] = 6;
        Constructor_Cartas.MazoEnemigo[19] = 6;
        Constructor_Cartas.MazoEnemigo[20] = 7;
        Constructor_Cartas.MazoEnemigo[21] = 7;
        Constructor_Cartas.MazoEnemigo[22] = 7;
        Constructor_Cartas.MazoEnemigo[23] = 8;
        Constructor_Cartas.MazoEnemigo[24] = 8;
        Constructor_Cartas.MazoEnemigo[25] = 8;
        Constructor_Cartas.MazoEnemigo[26] = 9;
        Constructor_Cartas.MazoEnemigo[27] = 9;
        Constructor_Cartas.MazoEnemigo[28] = 9;
        Constructor_Cartas.MazoEnemigo[29] = 10;
        
        //MANO DEL ENEMIGO
        for (int i = 0; i < 6; i++) {
            Constructor_Cartas.manoEnemigo[i] = 0;
        }
        //CAMPO ENEMIGO
        for (int i = 0; i < 5; i++) {
            Constructor_Cartas.campoJugador[i] = 0;
        }
        //BATTEL ENEMIGO
        for (int i = 0; i < 5; i++) {
            Constructor_Cartas.battelEnemigo[i] = 0;
        }
        
    }
    public void  mesclar_Mazo_Enemigo(){
        for (int i = 0; i < 30; i++) {
            int x = generarRandom(0,29);
            //JOptionPane.showMessageDialog(null,x);
            Constructor_Cartas.MazoMescladoEnemigo[i] = Constructor_Cartas.MazoEnemigo[x];
            //JOptionPane.showMessageDialog(null, "Carta Asignada1"+Constructor_Cartas.MazoMesclado[i]);
        }
    }
    public int robarEnemigo(){
        //JOptionPane.showMessageDialog(null, "contadorManoEnemigo"+Constructor_Cartas.contadorPosicionManoEnemigo);
        Constructor_Cartas.manoEnemigo[Constructor_Cartas.contadorPosicionManoEnemigo] = Constructor_Cartas.MazoMescladoEnemigo[Constructor_Cartas.contadorPosicionCartaEnemigo];
        int carta = Constructor_Cartas.manoEnemigo[Constructor_Cartas.contadorPosicionManoEnemigo];
        Constructor_Cartas.contadorPosicionCartaEnemigo++;
        Constructor_Cartas.contadorPosicionManoEnemigo = evaluacionDelContadorEnemigo();
        return carta;
    }
    public void cambioDeRondaEnemigo(){
        if (Constructor_Cartas.espaciosDisponiblesEnemigo < 6) {
            switch(Constructor_Cartas.espaciosDisponiblesEnemigo){
                case 1:
                    Constructor_Cartas.espacioEnemigo1Disponible = true;
                    break;
                case 2:
                    Constructor_Cartas.espacioEnemigo2Disponible = true;
                    break;
                case 3:
                    Constructor_Cartas.espacioEnemigo3Disponible = true;
                    break;
                case 4:
                    Constructor_Cartas.espacioEnemigo4Disponible = true;
                    break;
                case 5:
                    Constructor_Cartas.espacioEnemigo5Disponible = true;
                    break;
            }
        }
    }
    public int evaluacionDelContadorEnemigo(){
        int contador = 0;
        boolean encontrado = false;
        for (int i = 0; i < 6; i++) {
            if (Constructor_Cartas.manoEnemigo[i] == 0){
                if (encontrado == false) {
                    contador = i;
                    encontrado = true;
                }
            }
        }
        //JOptionPane.showMessageDialog(null,contador);
        return contador;
    }
    
    //FUNCIONES DEL JUEGO_JUEGO
    public void aumentaronda(){
        cambioDeRondaEnemigo();
        cambioDeRonda();
        Constructor_Cartas.ronda++;
    }
    public boolean asignadorDeRonda(){
        int num;
        boolean paso;
        boolean jugadorPrimero = false;
        do{
           num = generarRandom(1,3); 
            if (num == 1) {
                jugadorPrimero = true;
                paso = true;
            }
            else if(num == 3){
                jugadorPrimero = false;
                paso = true;
            }
            else{
                paso = false;
            }
        }while(paso == true);

        return jugadorPrimero;
    }
    
    //INTELIGENCIA DEL ENEMIGO
    
    //comandos basico
    public int jugadorEnElCampo(){
        int enemigos = 0;
        for (int i = 0; i < 5; i++) {
            if (Constructor_Cartas.campoJugador[i] != 0) {
                enemigos++;
            }
        }
        return enemigos;
    }
    public int propiedadEnElCampo(){
        int cartas = 0;
        for (int i = 0; i < 5; i++) {
            if (Constructor_Cartas.campoEnemigo[i] != 0) {
                cartas++;
            }
        }
        return cartas;
    }
    public int cartasEnLaMano(){
        int cartas = 0;
        for (int i = 0; i < 6; i++) {
            if (Constructor_Cartas.manoEnemigo[i] !=0) {
                cartas++;
            }
        }
        return cartas;
    }
    //metodosPrincipales
    public int evaluacionParaColocar(){
        int cartasAColocar = 0;
        if (jugadorEnElCampo() >= propiedadEnElCampo()) {
            switch(Constructor_Cartas.espaciosDisponiblesEnemigo){
                case 1:
                    cartasAColocar++;
                    break;
                case 2:
                    if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo2Disponible == true) {
                        cartasAColocar++;
                    }
                    break;
                case 3:
                    if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo2Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo3Disponible == true) {
                        cartasAColocar++;
                    }
                    break;
                case 4:
                    if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo2Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo3Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo4Disponible == true) {
                        cartasAColocar++;
                    }
                    break;
                default:
                    if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo2Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo3Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo4Disponible == true) {
                        cartasAColocar++;
                    }
                    if (Constructor_Cartas.espacioEnemigo5Disponible == true) {
                        cartasAColocar++;
                    }
            }
            if (cartasAColocar > cartasEnLaMano()) {
                do {
                    cartasAColocar--;
                } while (cartasAColocar < cartasEnLaMano());    
            }
        }
        else{
            cartasAColocar++;
        }
        //JOptionPane.showMessageDialog(null,"Cartas en evaluacion"+cartasAColocar);
        return  cartasAColocar;
    }
}
