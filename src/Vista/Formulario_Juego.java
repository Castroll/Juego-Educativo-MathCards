package Vista;
import javax.swing.JOptionPane;
import Modelo.Funciones_Juego;
import Controlador.Constructor_Cartas;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.Timer;
public class Formulario_Juego extends javax.swing.JFrame {

    Funciones_Juego funcionesJ = new Funciones_Juego();
    Constructor_Cartas c_cartas = new Constructor_Cartas();
    boolean controlesJugadorHabilitado = false;
    boolean controlesEnemigoHabilitado = false;
    boolean declararBatallaJugador = false;
    boolean declararBatallaEnemigo = false;
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    
    //Evento del juego

    public void asignarCarta(int carta){
        //JOptionPane.showMessageDialog(this,"numero carta jugador"+carta);
        int espacio;
        if (lblManoPlayer.getIcon() == null) {
            espacio = 1;
        }
        else if (lblManoPlayer1.getIcon() == null) {
            espacio = 2;
        }
        else if (lblManoPlayer2.getIcon() == null) {
            espacio = 3;
        }
        else if (lblManoPlayer3.getIcon() == null) {
            espacio = 4;
        }
        else if (lblManoPlayer4.getIcon() == null) {
            espacio = 5;
        }
        else if (lblManoPlayer5.getIcon() == null) {
            espacio = 6;
        }
        else if (lblManoPlayer6.getIcon() == null) {
            espacio = 7;
        }
        else{
            espacio = 8;
        }
        jTextArea1.append("EspacioPlayer  "+espacio+"--------------\n");
        switch(espacio){
            case 1:
                lblManoPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer  "+carta+"\n");
                break;
            case 2:
                lblManoPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer1  "+carta+"\n");
                break;   
            case 3:
                lblManoPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer2  "+carta+"\n");
                break;   
            case 4:
                lblManoPlayer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer3  "+carta+"\n");
                break;   
            case 5:
                lblManoPlayer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer4  "+carta+"\n");
                break;   
            case 6:
                lblManoPlayer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer5  "+carta+"\n");
                break;   
            case 7:
                lblManoPlayer6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                jTextArea1.append("ManoPlayer6   "+carta+"\n");
                break;  
            default: 
                JOptionPane.showMessageDialog(this,"Ya no hay espacio");
        }
    }
    public void asignarCartaEnemigo(int carta){
        //JOptionPane.showMessageDialog(this,"numero carta Enemigo"+carta);
        int espacio;
        
        if (lblManoEnemy.getIcon() == null) {
            espacio = 1;
        }
        else if (lblManoEnemy1.getIcon() == null) {
            espacio = 2;
        }
        else if (lblManoEnemy2.getIcon() == null) {
            espacio = 3;
        }
        else if (lblManoEnemy3.getIcon() == null) {
            espacio = 4;
        }
        else if (lblManoEnemy4.getIcon() == null) {
            espacio = 5;
        }
        else if (lblManoEnemy5.getIcon() == null) {
            espacio = 6;
        }
        else if (lblManoEnemy6.getIcon() == null) {
            espacio = 7;
        }
        else{
            espacio = 8;
        }
        jTextArea2.append("EspacioEnemy  "+espacio+"------------------\n");
        switch(espacio){
            case 1:
                lblManoEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy  "+carta+"\n");
                break;
            case 2:
                lblManoEnemy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy1 "+carta+"\n");
                
                break;   
            case 3:
                lblManoEnemy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy2 "+carta+"\n");
                break;   
            case 4:
                lblManoEnemy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy3 "+carta+"\n");
                break;   
            case 5:
                lblManoEnemy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy4  "+carta+"\n");;
                break;   
            case 6:
                lblManoEnemy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy5  "+carta+"\n");
                break;   
            case 7:
                lblManoEnemy6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png")));
                jTextArea2.append("ManoEnemy6   "+carta+"\n");
                break;  
            default: 
                JOptionPane.showMessageDialog(this,"Ya no hay espacio Enemigo");
        }
    }
    public void asignarEspacios(){
        switch (Constructor_Cartas.espaciosDisponiblesJugador){
            case 1:
                lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 2:
                lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 3:
                lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 4:
                lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 5:
                lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;  
        }
    }
    public void asignarEspaciosEnemigo(){
        switch (Constructor_Cartas.espaciosDisponiblesJugador){
            case 1:
                lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                
                break;
            case 2:
                lblCard4Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 3:
                lblCard2Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 4:
                lblCard1Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;
            case 5:
                lblCard5Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espacio.png")));
                break;  
        }
    }
    public boolean colocarCarta(int carta){
        boolean realizado = false;
        switch(Constructor_Cartas.espaciosDisponiblesJugador){
            case 1:
                if (Constructor_Cartas.espacioJugador1Disponible == true) {
                    lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                break;
            case 2:
                if (Constructor_Cartas.espacioJugador1Disponible == true) {
                    lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador2Disponible == true){
                    lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador2Disponible = false;
                }
                break;
            case 3:
                if (Constructor_Cartas.espacioJugador1Disponible == true) {
                    lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador2Disponible == true){
                    lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador2Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador3Disponible == true){
                    lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador3Disponible = false;
                }
                break;
            case 4:
                if (Constructor_Cartas.espacioJugador1Disponible == true) {
                    lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador2Disponible == true){
                    lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador2Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador3Disponible == true){
                    lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador3Disponible = false;
                }
                else if( Constructor_Cartas.espacioJugador4Disponible == true){
                    lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador4Disponible = false;
                }
                break;
            case 5:
                if (Constructor_Cartas.espacioJugador1Disponible == true) {
                    lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador2Disponible == true){
                    lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador2Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador3Disponible == true){
                    lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador3Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador4Disponible == true){
                    lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador4Disponible = false;
                }
                else if(Constructor_Cartas.espacioJugador5Disponible == true) {
                    lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[4] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador5Disponible = false;
                }
                break;
            default:
                if (Constructor_Cartas.espacioJugador1Disponible == true) {
                    lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador2Disponible == true){
                    lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador2Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador3Disponible == true){
                    lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador3Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador4Disponible == true){
                    lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador4Disponible = false;
                }
                else if (Constructor_Cartas.espacioJugador5Disponible == true){
                    lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoJugador[4] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador5Disponible = false;
                }
                
        }
        return realizado;
    }
    public boolean colocarCartaBatalla(int carta, int espacio){
        boolean realizado = false;
        switch(espacio){
            case 2:
                if (Constructor_Cartas.espaciobattelJugador1Disponible == true) {
                    lblBattel1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));                    Constructor_Cartas.campoJugador[0] = carta;
                    realizado = true;
                    Constructor_Cartas.battelJugador[0] = carta;
                    Constructor_Cartas.espaciobattelJugador1Disponible = false;
                }
                else{
                    JOptionPane.showMessageDialog(this,"El espacio ya esta ocupado");
                    realizado = false;
                }
                break;
            case 1:
                if (Constructor_Cartas.espaciobattelJugador2Disponible == true){
                    lblBattel2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.battelJugador[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espaciobattelJugador2Disponible = false;
                }
                else{
                    JOptionPane.showMessageDialog(this,"El espacio ya esta ocupado");
                    realizado = false;
                }
                break;
            case 3:
                if (Constructor_Cartas.espaciobattelJugador3Disponible == true){
                    lblBattel3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.battelJugador[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espaciobattelJugador3Disponible = false;
                }
                else{
                    JOptionPane.showMessageDialog(this,"El espacio ya esta ocupado");
                    realizado = false;
                }
                break;
            case 0:
                if (Constructor_Cartas.espaciobattelJugador4Disponible == true){
                    lblBattel4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.battelJugador[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espaciobattelJugador4Disponible = false;
                }
                else{
                    JOptionPane.showMessageDialog(this,"El espacio ya esta ocupado");
                    realizado = false;
                }
                break;
            case 4:
                if (Constructor_Cartas.espaciobattelJugador5Disponible == true){
                    lblBattel5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.battelJugador[4] = carta;
                    realizado = true;
                    Constructor_Cartas.espaciobattelJugador5Disponible = false;
                }
                else{
                    JOptionPane.showMessageDialog(this,"El espacio ya esta ocupado");
                    realizado = false;
                }
                break;
                
        }
        return realizado;
    }
    public boolean colocarCartaEnemigo(int carta){
        boolean realizado = false;
        JOptionPane.showMessageDialog(this,"Carta a colocar en el campo Enemigo "+carta);
        switch(Constructor_Cartas.espaciosDisponiblesEnemigo){
            case 1:
                if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                    lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo1Disponible = false;
                }
                break;
            case 2:
                if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                    lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo1Disponible = false;
                }
                else{
                    lblCard4Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo2Disponible = false;
                }
                break;
            case 3:
                if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                    lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo1Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo2Disponible == true){
                    lblCard4Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo2Disponible = false;
                }
                else {
                    lblCard2Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo3Disponible = false;
                }
                break;
            case 4:
                if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                    lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo2Disponible == true){
                    lblCard4Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo2Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo3Disponible == true){
                    lblCard2Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo3Disponible = false;
                }
                else {
                    lblCard1Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo4Disponible = false;
                }
                break;
            case 5:
                if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                    lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo2Disponible == true){
                    lblCard4Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo2Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo3Disponible == true){
                    lblCard2Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo3Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo4Disponible == true){
                    lblCard1Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo4Disponible = false;
                }
                else{
                    lblCard5Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[4] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo5Disponible = false;
                }
                break;
            default:
                if (Constructor_Cartas.espacioEnemigo1Disponible == true) {
                    lblCard3Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[0] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioJugador1Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo2Disponible == true){
                    lblCard4Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[1] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo2Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo3Disponible == true){
                    lblCard2Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[2] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo3Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo4Disponible == true){
                    lblCard1Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[3] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo4Disponible = false;
                }
                else if (Constructor_Cartas.espacioEnemigo5Disponible == true){
                    lblCard5Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+carta+".png")));
                    Constructor_Cartas.campoEnemigo[4] = carta;
                    realizado = true;
                    Constructor_Cartas.espacioEnemigo5Disponible = false;
                }
                
        }
        return realizado;
    }
    public void cambiDeRonda(){
        if (controlesJugadorHabilitado == false) {
            controlesJugadorHabilitado = true;
            controlesEnemigoHabilitado = false;
        }
        else if(controlesJugadorHabilitado == true){
            controlesJugadorHabilitado = false;
            controlesEnemigoHabilitado = true;
        }
        tCarga.start();
        asignarCarta(funcionesJ.robar());
        asignarCartaEnemigo(funcionesJ.robarEnemigo());
        controlesDeRonda();
        repetirCarga = false;
    }
    public void controlesDeRonda(){
       Constructor_Cartas.espaciosDisponiblesEnemigo++;
       Constructor_Cartas.espaciosDisponiblesJugador++;
       funcionesJ.aumentaronda();
       asignarEspacios();
       asignarEspaciosEnemigo();
       lblNumeroRonda.setText(""+Constructor_Cartas.ronda);
        if (controlesJugadorHabilitado == true) {
            lblturno.setText("tu");
        }
        else if (controlesEnemigoHabilitado == true){
            lblturno.setText("Enemigo");
        }
    }
    public void cargaInicial(){
       tCarga.start();
       repetirCarga = false;
       funcionesJ.mesclar_Mazo();
       funcionesJ.mesclar_Mazo_Enemigo();
       for (int i = 0; i < 5; i++) {
           asignarCartaEnemigo(funcionesJ.robarEnemigo());
           asignarCarta(funcionesJ.robar());
       }
       controlesDeRonda();
    }
    public int cuantosEnBatallaJugador(){
        int cantidad = 0;
        for (int i = 0; i < 5; i++) {
            if (Constructor_Cartas.battelEnemigo[i] != 0) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public int cuantosEnBatallaEnemigo(){
        int cantidad = 0;
        for (int i = 0; i < 5; i++) {
            if (Constructor_Cartas.battelJugador[i] != 0) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public int espacioAColoar(){
        int cantidad = 0;
        boolean paso = false;
        for (int i = 0; i < 5; i++) {
            if (Constructor_Cartas.campoJugador[i] == 0) {
                if (paso == false) {
                    cantidad = i;
                    paso = true;
                }
                
            }
        }
        return cantidad;
    }
    //Eventos de tiempo
    private boolean repetirCarga = true;
    ActionListener mostrarCarga = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (repetirCarga) {
                    lblCarga.setVisible(true);
                }
                else{
                    tCarga.stop();
                    lblCarga.setVisible(false);
                }
            }
        };
    Timer tCarga = new Timer(2000,mostrarCarga);
    //Evento del la intelgencia del enemigo
    public void inteligenciaColocar(){
        int veces = funcionesJ.evaluacionParaColocar();
        
        for (int i = 0; i < veces; i++) {
            if (colocarCartaEnemigo(Constructor_Cartas.manoEnemigo[i]) == true) {
                JOptionPane.showMessageDialog(this,"posion"+i+"carta"+Constructor_Cartas.manoEnemigo[i] );
                Constructor_Cartas.manoEnemigo[i] = 0;
                switch(i){
                    case 0:
                        lblManoEnemy.setIcon(null);
                        break;
                    case 1:
                        lblManoEnemy1.setIcon(null);
                        break;
                    case 2:
                        lblManoEnemy2.setIcon(null);
                        break;
                    case 3:
                        lblManoEnemy3.setIcon(null);
                        break;
                    case 4:
                        lblManoEnemy4.setIcon(null);
                        break;
                    case 5:
                        lblManoEnemy5.setIcon(null);
                        break;
                    case 6:
                        lblManoEnemy6.setIcon(null);
                        break;
                }
            } 
        }
        cambiDeRonda();
    }
    // </editor-fold> 
    
    public Formulario_Juego() {
        initComponents();
        this.setLocationRelativeTo(null);
        Constructor_Cartas.jugadorPrimero = funcionesJ.asignadorDeRonda();
        funcionesJ.llenar();
        funcionesJ.llenarEnemigo();
        if (Constructor_Cartas.jugadorPrimero == true) {
            controlesJugadorHabilitado = true;
            controlesEnemigoHabilitado = false;
        }
        else if (Constructor_Cartas.jugadorPrimero == false){
            controlesEnemigoHabilitado = true;
            controlesJugadorHabilitado = false;
        }
        cargaInicial();
        if (Constructor_Cartas.jugadorPrimero == false) {
            inteligenciaColocar();
            
        }
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBotonRonda = new javax.swing.JLabel();
        lblNumeroRonda = new javax.swing.JLabel();
        lblturno = new javax.swing.JLabel();
        lblRonda1 = new javax.swing.JLabel();
        lblCarga = new javax.swing.JLabel();
        lblManoEnemy6 = new javax.swing.JLabel();
        lblManoEnemy5 = new javax.swing.JLabel();
        lblManoEnemy4 = new javax.swing.JLabel();
        lblManoEnemy3 = new javax.swing.JLabel();
        lblManoEnemy2 = new javax.swing.JLabel();
        lblManoEnemy1 = new javax.swing.JLabel();
        lblManoEnemy = new javax.swing.JLabel();
        lblCard1Enemy = new javax.swing.JLabel();
        lblCard2Enemy = new javax.swing.JLabel();
        lblCard3Enemy = new javax.swing.JLabel();
        lblCard4Enemy = new javax.swing.JLabel();
        lblCard5Enemy = new javax.swing.JLabel();
        lblBattel3Enemigo = new javax.swing.JLabel();
        lblBattel4Enemigo = new javax.swing.JLabel();
        lblBattel1Enemigo = new javax.swing.JLabel();
        lblBattel2Enemigo = new javax.swing.JLabel();
        lblBattel5Enemigo = new javax.swing.JLabel();
        lblBattel1Player = new javax.swing.JLabel();
        lblBattel2Player = new javax.swing.JLabel();
        lblBattel3Player = new javax.swing.JLabel();
        lblBattel4Player = new javax.swing.JLabel();
        lblBattel5Player = new javax.swing.JLabel();
        lblManoPlayer = new javax.swing.JLabel();
        lblManoPlayer1 = new javax.swing.JLabel();
        lblManoPlayer2 = new javax.swing.JLabel();
        lblManoPlayer3 = new javax.swing.JLabel();
        lblManoPlayer4 = new javax.swing.JLabel();
        lblManoPlayer5 = new javax.swing.JLabel();
        lblManoPlayer6 = new javax.swing.JLabel();
        lblCard5Player = new javax.swing.JLabel();
        lblCard4Player = new javax.swing.JLabel();
        lblCard3Player = new javax.swing.JLabel();
        lblCard2Player = new javax.swing.JLabel();
        lblCard1Player = new javax.swing.JLabel();
        lblDeckPlayer = new javax.swing.JLabel();
        lblDeckEnemy = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBotonRonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png"))); // NOI18N
        lblBotonRonda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonRondaMouseClicked(evt);
            }
        });
        getContentPane().add(lblBotonRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 110, 150));

        lblNumeroRonda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNumeroRonda.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroRonda.setText("0");
        getContentPane().add(lblNumeroRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lblturno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblturno.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 190));

        lblRonda1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRonda1.setForeground(new java.awt.Color(255, 255, 255));
        lblRonda1.setText("RONDA:");
        lblRonda1.setEnabled(false);
        getContentPane().add(lblRonda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 40));

        lblCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carga.gif"))); // NOI18N
        getContentPane().add(lblCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        lblManoEnemy6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemy6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemy6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemy6MouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, -110, 110, 150));

        lblManoEnemy5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemy5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemy5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemy5MouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -100, -1, -1));

        lblManoEnemy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemy4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemy4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemy4MouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -110, -1, -1));

        lblManoEnemy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemy3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemy3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemy3MouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -90, 110, -1));

        lblManoEnemy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemy2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemy2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemy2MouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -80, -1, -1));

        lblManoEnemy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemy1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemy1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemy1MouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, -80, -1, -1));

        lblManoEnemy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoEnemyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoEnemyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoEnemyMouseExited(evt);
            }
        });
        getContentPane().add(lblManoEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -70, -1, -1));

        lblCard1Enemy.setToolTipText("");
        getContentPane().add(lblCard1Enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 9, 110, 150));

        lblCard2Enemy.setToolTipText("");
        getContentPane().add(lblCard2Enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 10, 110, 150));

        lblCard3Enemy.setToolTipText("");
        getContentPane().add(lblCard3Enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 9, 110, 150));

        lblCard4Enemy.setToolTipText("");
        getContentPane().add(lblCard4Enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 10, 110, 150));

        lblCard5Enemy.setToolTipText("");
        getContentPane().add(lblCard5Enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 10, 110, 150));

        lblBattel3Enemigo.setToolTipText("");
        getContentPane().add(lblBattel3Enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBattel4Enemigo.setToolTipText("");
        getContentPane().add(lblBattel4Enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBattel1Enemigo.setToolTipText("");
        getContentPane().add(lblBattel1Enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBattel2Enemigo.setToolTipText("");
        getContentPane().add(lblBattel2Enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBattel5Enemigo.setToolTipText("");
        getContentPane().add(lblBattel5Enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBattel1Player.setToolTipText("");
        lblBattel1Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBattel1PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblBattel1Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 373, -1, -1));

        lblBattel2Player.setToolTipText("");
        lblBattel2Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBattel2PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblBattel2Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 373, -1, -1));

        lblBattel3Player.setToolTipText("");
        lblBattel3Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBattel3PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblBattel3Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 373, -1, -1));

        lblBattel4Player.setToolTipText("");
        lblBattel4Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBattel4PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblBattel4Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 373, -1, -1));

        lblBattel5Player.setToolTipText("");
        lblBattel5Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBattel5PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblBattel5Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 373, -1, -1));

        lblManoPlayer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayerMouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, -1, -1));

        lblManoPlayer1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayer1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayer1MouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        lblManoPlayer2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayer2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayer2MouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, -1, -1));

        lblManoPlayer3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayer3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayer3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayer3MouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 110, -1));

        lblManoPlayer4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayer4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayer4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayer4MouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, -1, -1));

        lblManoPlayer5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer5.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayer5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayer5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayer5MouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, -1, -1));

        lblManoPlayer6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblManoPlayer6.setForeground(new java.awt.Color(255, 255, 255));
        lblManoPlayer6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManoPlayer6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManoPlayer6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManoPlayer6MouseExited(evt);
            }
        });
        getContentPane().add(lblManoPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, -1, -1));

        lblCard5Player.setToolTipText("");
        lblCard5Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCard5PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblCard5Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 554, 110, 150));

        lblCard4Player.setToolTipText("");
        lblCard4Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCard4PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblCard4Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 110, 150));

        lblCard3Player.setToolTipText("");
        lblCard3Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCard3PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblCard3Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 554, 110, 150));

        lblCard2Player.setToolTipText("");
        lblCard2Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCard2PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblCard2Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 554, 110, 150));

        lblCard1Player.setToolTipText("");
        lblCard1Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCard1PlayerMouseClicked(evt);
            }
        });
        getContentPane().add(lblCard1Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 554, 110, 150));

        lblDeckPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Deck.png"))); // NOI18N
        lblDeckPlayer.setToolTipText("");
        getContentPane().add(lblDeckPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 170));

        lblDeckEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Deck.png"))); // NOI18N
        lblDeckEnemy.setToolTipText("");
        getContentPane().add(lblDeckEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(931, 536, -1, 170));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, 300));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 10, 130, 230));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        Fondo.setIconTextGap(1);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos hover de la mano del juegador">
    //EVENTOS DE JLABLES PARA HACER EL EJECTO DE ANIMACION DE LA MANO....MOUSEENTER
    private void lblManoPlayer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer1MouseEntered
        lblManoPlayer.setBounds(490,580,110,150);
        lblManoPlayer1.setBounds(580,550,110,150);
        lblManoPlayer2.setBounds(400,590,110,150);
        lblManoPlayer3.setBounds(320,600,110,150);
        lblManoPlayer4.setBounds(230,610,110,150);
        lblManoPlayer5.setBounds(660,600,110,150);
        lblManoPlayer6.setBounds(750,610,110,150);
    }//GEN-LAST:event_lblManoPlayer1MouseEntered

    private void lblManoPlayerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayerMouseEntered
        lblManoPlayer.setBounds(490,550,110,150);
        lblManoPlayer1.setBounds(580,590,110,150);
        lblManoPlayer2.setBounds(400,590,110,150);
        lblManoPlayer3.setBounds(320,600,110,150);
        lblManoPlayer4.setBounds(230,610,110,150);
        lblManoPlayer5.setBounds(660,600,110,150);
        lblManoPlayer6.setBounds(750,610,110,150);
    }//GEN-LAST:event_lblManoPlayerMouseEntered

    private void lblManoPlayer2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer2MouseEntered
        lblManoPlayer.setBounds(490,580,110,150);
        lblManoPlayer1.setBounds(580,590,110,150);
        lblManoPlayer2.setBounds(400,550,110,150);
        lblManoPlayer3.setBounds(320,600,110,150);
        lblManoPlayer4.setBounds(230,610,110,150);
        lblManoPlayer5.setBounds(660,600,110,150);
        lblManoPlayer6.setBounds(750,610,110,150);
    }//GEN-LAST:event_lblManoPlayer2MouseEntered

    private void lblManoPlayer3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer3MouseEntered
        lblManoPlayer.setBounds(490,580,110,150);
        lblManoPlayer1.setBounds(580,590,110,150);
        lblManoPlayer2.setBounds(400,590,110,150);
        lblManoPlayer3.setBounds(320,550,110,150);
        lblManoPlayer4.setBounds(230,610,110,150);
        lblManoPlayer5.setBounds(660,600,110,150);
        lblManoPlayer6.setBounds(750,610,110,150);
    }//GEN-LAST:event_lblManoPlayer3MouseEntered

    private void lblManoPlayer4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer4MouseEntered
        lblManoPlayer.setBounds(490,580,110,150);
        lblManoPlayer1.setBounds(580,590,110,150);
        lblManoPlayer2.setBounds(400,590,110,150);
        lblManoPlayer3.setBounds(320,600,110,150);
        lblManoPlayer4.setBounds(230,550,110,150);
        lblManoPlayer5.setBounds(660,600,110,150);
        lblManoPlayer6.setBounds(750,610,110,150);
    }//GEN-LAST:event_lblManoPlayer4MouseEntered

    private void lblManoPlayer5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer5MouseEntered
        lblManoPlayer.setBounds(490,580,110,150);
        lblManoPlayer1.setBounds(580,590,110,150);
        lblManoPlayer2.setBounds(400,590,110,150);
        lblManoPlayer3.setBounds(320,600,110,150);
        lblManoPlayer4.setBounds(230,610,110,150);
        lblManoPlayer5.setBounds(660,550,110,150);
        lblManoPlayer6.setBounds(750,610,110,150);
    }//GEN-LAST:event_lblManoPlayer5MouseEntered

    private void lblManoPlayer6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer6MouseEntered
        lblManoPlayer.setBounds(490,580,110,150);
        lblManoPlayer1.setBounds(580,590,110,150);
        lblManoPlayer2.setBounds(400,590,110,150);
        lblManoPlayer3.setBounds(320,600,110,150);
        lblManoPlayer4.setBounds(230,610,110,150);
        lblManoPlayer5.setBounds(660,600,110,150);
        lblManoPlayer6.setBounds(750,550,110,150);
    }//GEN-LAST:event_lblManoPlayer6MouseEntered

    //EVENTOS DE JLABLES PARA HACER EL EJECTO DE ANIMACION DE LA MANO....MOUSEEXITED
    private void lblManoPlayer6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer6MouseExited

            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
        
    }//GEN-LAST:event_lblManoPlayer6MouseExited

    private void lblManoPlayer5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer5MouseExited
        
            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
        
    }//GEN-LAST:event_lblManoPlayer5MouseExited

    private void lblManoPlayer4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer4MouseExited
        
            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
        
    }//GEN-LAST:event_lblManoPlayer4MouseExited

    private void lblManoPlayer3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer3MouseExited

            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
        
    }//GEN-LAST:event_lblManoPlayer3MouseExited

    private void lblManoPlayer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer2MouseExited

            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
        
    }//GEN-LAST:event_lblManoPlayer2MouseExited

    private void lblManoPlayer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer1MouseExited

            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
    }//GEN-LAST:event_lblManoPlayer1MouseExited

    private void lblManoPlayerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayerMouseExited
            lblManoPlayer.setBounds(490,630,110,150);
            lblManoPlayer1.setBounds(580,640,110,150);
            lblManoPlayer2.setBounds(400,640,110,150);
            lblManoPlayer3.setBounds(320,650,110,150);
            lblManoPlayer4.setBounds(230,660,110,150);
            lblManoPlayer5.setBounds(660,650,110,150);
            lblManoPlayer6.setBounds(750,660,110,150);
    }//GEN-LAST:event_lblManoPlayerMouseExited

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Eventos De click Cartas de la mano del juegador">
    //EVENTO CLICK EN LAS CARTAS DE LA MANO

    private void lblManoPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayerMouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
             //JOptionPane.showMessageDialog(this, "Carta a colocar 0 "+Constructor_Cartas.manoJugador[0]);
             if (colocarCarta(Constructor_Cartas.manoJugador[0]) == true) {  
                lblManoPlayer.setIcon(null);
                Constructor_Cartas.manoJugador[0] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayerMouseClicked

    private void lblManoPlayer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer1MouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
            //JOptionPane.showMessageDialog(this, "Carta a colocar 1 "+Constructor_Cartas.manoJugador[1]);
            if (colocarCarta(Constructor_Cartas.manoJugador[1]) == true) {
                lblManoPlayer1.setIcon(null);
                Constructor_Cartas.manoJugador[1] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayer1MouseClicked

    private void lblManoPlayer5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer5MouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
            //JOptionPane.showMessageDialog(this, "Carta a colocar 5"+Constructor_Cartas.manoJugador[5]);
            if (colocarCarta(Constructor_Cartas.manoJugador[5]) == true) {
                lblManoPlayer5.setIcon(null);
                Constructor_Cartas.manoJugador[5] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayer5MouseClicked

    private void lblManoPlayer6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer6MouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
            //JOptionPane.showMessageDialog(this, "Carta a colocar 6"+Constructor_Cartas.manoJugador[6]);
            if (colocarCarta(Constructor_Cartas.manoJugador[6]) == true) {
                lblManoPlayer6.setIcon(null);
                Constructor_Cartas.manoJugador[6] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayer6MouseClicked

    private void lblManoPlayer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer2MouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
            //JOptionPane.showMessageDialog(this, "Carta a colocar 2"+Constructor_Cartas.manoJugador[2]);
            if (colocarCarta(Constructor_Cartas.manoJugador[2]) == true) {
                lblManoPlayer2.setIcon(null);
                Constructor_Cartas.manoJugador[2] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayer2MouseClicked

    private void lblManoPlayer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer3MouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
            //JOptionPane.showMessageDialog(this, "Carta a colocar 3"+Constructor_Cartas.manoJugador[3]);
            if (colocarCarta(Constructor_Cartas.manoJugador[3]) == true) {
                lblManoPlayer3.setIcon(null);
                Constructor_Cartas.manoJugador[3] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayer3MouseClicked

    private void lblManoPlayer4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoPlayer4MouseClicked
        if (controlesJugadorHabilitado == true && controlesEnemigoHabilitado == false) {
            //JOptionPane.showMessageDialog(this, "Carta a colocar 4"+Constructor_Cartas.manoJugador[4]);
            if (colocarCarta(Constructor_Cartas.manoJugador[4]) == true) {
                lblManoPlayer4.setIcon(null);
                Constructor_Cartas.manoJugador[4] = 0;
            } 
            else{
                JOptionPane.showMessageDialog(this, "No se puede colocar mas cartas");
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No se pude colocar, no es tu turno");
        }
    }//GEN-LAST:event_lblManoPlayer4MouseClicked

    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Por si la duda">
    private void lblManoEnemy6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy6MouseClicked

    private void lblManoEnemy6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy6MouseEntered

    private void lblManoEnemy6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy6MouseExited

    private void lblManoEnemy5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy5MouseClicked

    private void lblManoEnemy5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy5MouseEntered

    private void lblManoEnemy5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy5MouseExited

    private void lblManoEnemy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy4MouseClicked

    private void lblManoEnemy4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy4MouseEntered

    private void lblManoEnemy4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy4MouseExited

    private void lblManoEnemy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy3MouseClicked

    private void lblManoEnemy3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy3MouseEntered

    private void lblManoEnemy3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy3MouseExited

    private void lblManoEnemy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy2MouseClicked

    private void lblManoEnemy2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy2MouseEntered

    private void lblManoEnemy2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy2MouseExited

    private void lblManoEnemy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy1MouseClicked

    private void lblManoEnemy1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy1MouseEntered

    private void lblManoEnemy1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemy1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemy1MouseExited

    private void lblManoEnemyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemyMouseClicked

    private void lblManoEnemyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemyMouseEntered

    private void lblManoEnemyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManoEnemyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManoEnemyMouseExited

    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Boton rondas">
    
    private void lblBotonRondaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonRondaMouseClicked
        if (lblBotonRonda.getText() == "Atacar") {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro, quieres atacar?", "AL ATAQUE", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                if (declararBatallaEnemigo == true && declararBatallaJugador == false) {
                    
                }
                else if (declararBatallaJugador == true && declararBatallaEnemigo == false){
                    
                }
            }
        }
        else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "CAMBIO DE RONDA", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                cambiDeRonda();
                if (controlesEnemigoHabilitado == true) {
                    inteligenciaColocar();
                }
            }
        } 
    }//GEN-LAST:event_lblBotonRondaMouseClicked

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Eventos De click Cartas del campo del juegador">
    
    private void lblCard1PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCard1PlayerMouseClicked
        if (declararBatallaEnemigo == true && controlesJugadorHabilitado == false) {
            if (lblCard1Player.getIcon() != null && Constructor_Cartas.campoJugador[3] != 0) {
                    if (cuantosEnBatallaJugador() > 1) {
                        
                    }
                    else{
                        int posicion = 0;
                        for (int i = 0; i < 5; i++) {
                            if (Constructor_Cartas.battelEnemigo[i] != 0) {
                                posicion = i;
                            }
                        }
                        if (posicion != 0) {
                            Constructor_Cartas.battelJugador[3] = Constructor_Cartas.campoJugador[3];
                            lblBattel3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.battelJugador[0]+".png")));
                            lblCard1Player.setIcon(null);
                            Constructor_Cartas.campoJugador[3] = 0;
                            Constructor_Cartas.espacioJugador4Disponible = false;
                            lblBotonRonda.setText("Atacar");
                        }
                    }
                    declararBatallaJugador = true;
                }
        }
        else {
            if (controlesJugadorHabilitado == true) {
                if (lblCard1Player.getIcon() != null && Constructor_Cartas.campoJugador[3] != 0) {
                    String[] opcion = {"Espacio 4", "Espacio 2", "Espacio 1", "Espacio 3","Espacio 5"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que selecciones el espacio a colocar la carta", "A por la victoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
                    if (colocarCartaBatalla(Constructor_Cartas.campoJugador[3],seleccion)== true){
                        lblCard1Player.setIcon(null);
                        lblCard1Player.setIcon(null);
                        Constructor_Cartas.campoJugador[3] = 0;
                        Constructor_Cartas.espacioJugador4Disponible = false;
                        lblBotonRonda.setText("Atacar");
                    }
                }
            }
        }
    }//GEN-LAST:event_lblCard1PlayerMouseClicked

    private void lblCard2PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCard2PlayerMouseClicked
        if (declararBatallaEnemigo == true && controlesJugadorHabilitado == false) {
            if (lblCard2Player.getIcon() != null && Constructor_Cartas.campoJugador[2] != 0) {
                    if (cuantosEnBatallaJugador() > 1) {
                        
                    }
                    else{
                        int posicion = 0;
                        for (int i = 0; i < 5; i++) {
                            if (Constructor_Cartas.battelEnemigo[i] != 0) {
                                posicion = i;
                            }
                        }
                        if (posicion != 0) {
                            Constructor_Cartas.battelJugador[2] = Constructor_Cartas.campoJugador[2];
                            lblBattel2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.battelJugador[0]+".png")));
                            lblCard2Player.setIcon(null);
                            Constructor_Cartas.campoJugador[2] = 0;
                            Constructor_Cartas.espacioJugador3Disponible = false;
                            lblBotonRonda.setText("Atacar");
                        }
                    }
                    declararBatallaJugador = true;
                }
        }
        else {
            if (controlesJugadorHabilitado == true) {
                if (lblCard2Player.getIcon() != null && Constructor_Cartas.campoJugador[2] != 0) {
                    String[] opcion = {"Espacio 4", "Espacio 2", "Espacio 1", "Espacio 3","Espacio 5"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que selecciones el espacio a colocar la carta", "A por la victoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
                    if (colocarCartaBatalla(Constructor_Cartas.campoJugador[2],seleccion)== true){
                        lblCard2Player.setIcon(null);
                        lblCard2Player.setIcon(null);
                        Constructor_Cartas.campoJugador[2] = 0;
                        Constructor_Cartas.espacioJugador3Disponible = false;
                        lblBotonRonda.setText("Atacar");
                    }
                }
            }
        }
    }//GEN-LAST:event_lblCard2PlayerMouseClicked

    private void lblCard3PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCard3PlayerMouseClicked
        if (declararBatallaEnemigo == true && controlesJugadorHabilitado == false) {
            if (lblCard3Player.getIcon() != null && Constructor_Cartas.campoJugador[0] != 0) {
                    if (cuantosEnBatallaJugador() > 1) {
                        
                    }
                    else{
                        int posicion = 0;
                        for (int i = 0; i < 5; i++) {
                            if (Constructor_Cartas.battelEnemigo[i] != 0) {
                                posicion = i;
                            }
                        }
                        if (posicion != 0) {
                            Constructor_Cartas.battelJugador[0] = Constructor_Cartas.campoJugador[0];
                            lblBattel1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.battelJugador[0]+".png")));
                            lblCard3Player.setIcon(null);
                            Constructor_Cartas.campoJugador[0] = 0;
                            Constructor_Cartas.espacioJugador1Disponible = false;
                            lblBotonRonda.setText("Atacar");
                        }
                    }
                    declararBatallaJugador = true;
                }
        }
        else {
            if (controlesJugadorHabilitado == true) {
                if (lblCard3Player.getIcon() != null && Constructor_Cartas.campoJugador[0] != 0) {
                    String[] opcion = {"Espacio 4", "Espacio 2", "Espacio 1", "Espacio 3","Espacio 5"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que selecciones el espacio a colocar la carta", "A por la victoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
                    if (colocarCartaBatalla(Constructor_Cartas.campoJugador[0],seleccion)== true){
                        lblCard3Player.setIcon(null);
                        lblCard3Player.setIcon(null);
                        Constructor_Cartas.campoJugador[0] = 0;
                        Constructor_Cartas.espacioJugador1Disponible = false;
                        lblBotonRonda.setText("Atacar");
                    }
                }
            }
        }
    }//GEN-LAST:event_lblCard3PlayerMouseClicked

    private void lblCard4PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCard4PlayerMouseClicked
        if (declararBatallaEnemigo == true && controlesJugadorHabilitado == false) {
            if (lblCard4Player.getIcon() != null && Constructor_Cartas.campoJugador[1] != 0) {
                    if (cuantosEnBatallaJugador() > 1) {
                        
                    }
                    else{
                        int posicion = 0;
                        for (int i = 0; i < 5; i++) {
                            if (Constructor_Cartas.battelEnemigo[i] != 0) {
                                posicion = i;
                            }
                        }
                        if (posicion != 0) {
                            Constructor_Cartas.battelJugador[1] = Constructor_Cartas.campoJugador[1];
                            lblBattel2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.battelJugador[0]+".png")));
                            lblCard4Player.setIcon(null);
                            Constructor_Cartas.campoJugador[1] = 0;
                            Constructor_Cartas.espacioJugador2Disponible = false;
                            lblBotonRonda.setText("Atacar");
                        }
                    }
                    declararBatallaJugador = true;
                }
        }
        else {
            if (controlesJugadorHabilitado == true) {
                if (lblCard4Player.getIcon() != null && Constructor_Cartas.campoJugador[1] != 0) {
                    String[] opcion = {"Espacio 4", "Espacio 2", "Espacio 1", "Espacio 3","Espacio 5"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que selecciones el espacio a colocar la carta", "A por la victoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
                    if (colocarCartaBatalla(Constructor_Cartas.campoJugador[1],seleccion)== true){
                        lblCard4Player.setIcon(null);
                        lblCard4Player.setIcon(null);
                        Constructor_Cartas.campoJugador[1] = 0;
                        Constructor_Cartas.espacioJugador2Disponible = false;
                        lblBotonRonda.setText("Atacar");
                    }
                }
            }
        }
    }//GEN-LAST:event_lblCard4PlayerMouseClicked

    private void lblCard5PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCard5PlayerMouseClicked
        if (declararBatallaEnemigo == true && controlesJugadorHabilitado == false) {
            if (lblCard5Player.getIcon() != null && Constructor_Cartas.campoJugador[4] != 0) {
                    if (cuantosEnBatallaJugador() > 1) {
                        
                    }
                    else{
                        int posicion = 0;
                        for (int i = 0; i < 5; i++) {
                            if (Constructor_Cartas.battelEnemigo[i] != 0) {
                                posicion = i;
                            }
                        }
                        if (posicion != 0) {
                            Constructor_Cartas.battelJugador[4] = Constructor_Cartas.campoJugador[4];
                            lblBattel5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.battelJugador[0]+".png")));
                            lblCard5Player.setIcon(null);
                            Constructor_Cartas.campoJugador[4] = 0;
                            Constructor_Cartas.espacioJugador5Disponible = false;
                            lblBotonRonda.setText("Atacar");
                        }
                    }
                    declararBatallaJugador = true;
                }
        }
        else {
            if (controlesJugadorHabilitado == true) {
                if (lblCard5Player.getIcon() != null && Constructor_Cartas.campoJugador[4] != 0) {
                    String[] opcion = {"Espacio 4", "Espacio 2", "Espacio 1", "Espacio 3","Espacio 5"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que selecciones el espacio a colocar la carta", "A por la victoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
                    if (colocarCartaBatalla(Constructor_Cartas.campoJugador[4],seleccion)== true){
                        lblCard5Player.setIcon(null);
                        lblCard5Player.setIcon(null);
                        Constructor_Cartas.campoJugador[4] = 0;
                        Constructor_Cartas.espacioJugador1Disponible = false;
                        lblBotonRonda.setText("Atacar");
                    }
                }
            }
        }
    }//GEN-LAST:event_lblCard5PlayerMouseClicked

    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Eventos De click battel jugador">
    
    private void lblBattel1PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBattel1PlayerMouseClicked
        if (lblBattel1Player.getIcon() != null) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres quitar esta carta?", "Piensa bien!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int i = espacioAColoar();
                Constructor_Cartas.campoJugador[i] = Constructor_Cartas.battelJugador[0];
                switch(i){
                    case 0:
                        lblBattel1Player.setIcon(null);
                        lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 1:
                        lblBattel1Player.setIcon(null);
                        lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 2:
                        lblBattel1Player.setIcon(null);
                        lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 3:
                        lblBattel1Player.setIcon(null);
                        lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 4:
                        lblBattel1Player.setIcon(null);
                        lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;

                }
                
                Constructor_Cartas.battelJugador[0] = 0;
                Constructor_Cartas.espaciobattelJugador1Disponible = true;
            }
        }
    }//GEN-LAST:event_lblBattel1PlayerMouseClicked

    private void lblBattel2PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBattel2PlayerMouseClicked
        if (lblBattel2Player.getIcon() != null) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres quitar esta carta?", "Piensa bien!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int i = espacioAColoar();
                Constructor_Cartas.campoJugador[i] = Constructor_Cartas.battelJugador[1];
                switch(i){
                    case 0:
                        lblBattel2Player.setIcon(null);
                        lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 1:
                        lblBattel2Player.setIcon(null);
                        lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 2:
                        lblBattel2Player.setIcon(null);
                        lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 3:
                        lblBattel2Player.setIcon(null);
                        lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 4:
                        lblBattel2Player.setIcon(null);
                        lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;

                }
                
                Constructor_Cartas.battelJugador[1] = 0;
                Constructor_Cartas.espaciobattelJugador2Disponible = true;
            }
        }
    }//GEN-LAST:event_lblBattel2PlayerMouseClicked

    private void lblBattel3PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBattel3PlayerMouseClicked
        if (lblBattel3Player.getIcon() != null) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres quitar esta carta?", "Piensa bien!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int i = espacioAColoar();
                Constructor_Cartas.campoJugador[i] = Constructor_Cartas.battelJugador[2];
                switch(i){
                    case 0:
                        lblBattel3Player.setIcon(null);
                        lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 1:
                        lblBattel3Player.setIcon(null);
                        lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 2:
                        lblBattel3Player.setIcon(null);
                        lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 3:
                        lblBattel3Player.setIcon(null);
                        lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 4:
                        lblBattel3Player.setIcon(null);
                        lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;

                }
                
                Constructor_Cartas.battelJugador[2] = 0;
                Constructor_Cartas.espaciobattelJugador3Disponible = true;
            }
        }
    }//GEN-LAST:event_lblBattel3PlayerMouseClicked

    private void lblBattel4PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBattel4PlayerMouseClicked
        if (lblBattel4Player.getIcon() != null) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres quitar esta carta?", "Piensa bien!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int i = espacioAColoar();
                Constructor_Cartas.campoJugador[i] = Constructor_Cartas.battelJugador[3];
                switch(i){
                    case 0:
                        lblBattel4Player.setIcon(null);
                        lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 1:
                        lblBattel4Player.setIcon(null);
                        lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 2:
                        lblBattel4Player.setIcon(null);
                        lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 3:
                        lblBattel4Player.setIcon(null);
                        lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 4:
                        lblBattel4Player.setIcon(null);
                        lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;

                }
                
                Constructor_Cartas.battelJugador[3] = 0;
                Constructor_Cartas.espaciobattelJugador4Disponible = true;
            }
        }
    }//GEN-LAST:event_lblBattel4PlayerMouseClicked

    private void lblBattel5PlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBattel5PlayerMouseClicked
        if (lblBattel5Player.getIcon() != null) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres quitar esta carta?", "Piensa bien!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int i = espacioAColoar();
                Constructor_Cartas.campoJugador[i] = Constructor_Cartas.battelJugador[4];
                switch(i){
                    case 0:
                        lblBattel5Player.setIcon(null);
                        lblCard3Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 1:
                        lblBattel5Player.setIcon(null);
                        lblCard4Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 2:
                        lblBattel5Player.setIcon(null);
                        lblCard2Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 3:
                        lblBattel5Player.setIcon(null);
                        lblCard1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;
                    case 4:
                        lblBattel5Player.setIcon(null);
                        lblCard5Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Card"+Constructor_Cartas.campoJugador[i]+".png")));
                        break;

                }
                
                Constructor_Cartas.battelJugador[4] = 0;
                Constructor_Cartas.espaciobattelJugador5Disponible = true;
            }
        }
    }//GEN-LAST:event_lblBattel5PlayerMouseClicked

    // </editor-fold>
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Formulario_Juego().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblBattel1Enemigo;
    private javax.swing.JLabel lblBattel1Player;
    private javax.swing.JLabel lblBattel2Enemigo;
    private javax.swing.JLabel lblBattel2Player;
    private javax.swing.JLabel lblBattel3Enemigo;
    private javax.swing.JLabel lblBattel3Player;
    private javax.swing.JLabel lblBattel4Enemigo;
    private javax.swing.JLabel lblBattel4Player;
    private javax.swing.JLabel lblBattel5Enemigo;
    private javax.swing.JLabel lblBattel5Player;
    private javax.swing.JLabel lblBotonRonda;
    private javax.swing.JLabel lblCard1Enemy;
    private javax.swing.JLabel lblCard1Player;
    private javax.swing.JLabel lblCard2Enemy;
    private javax.swing.JLabel lblCard2Player;
    private javax.swing.JLabel lblCard3Enemy;
    private javax.swing.JLabel lblCard3Player;
    private javax.swing.JLabel lblCard4Enemy;
    private javax.swing.JLabel lblCard4Player;
    private javax.swing.JLabel lblCard5Enemy;
    private javax.swing.JLabel lblCard5Player;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblDeckEnemy;
    private javax.swing.JLabel lblDeckPlayer;
    private javax.swing.JLabel lblManoEnemy;
    private javax.swing.JLabel lblManoEnemy1;
    private javax.swing.JLabel lblManoEnemy2;
    private javax.swing.JLabel lblManoEnemy3;
    private javax.swing.JLabel lblManoEnemy4;
    private javax.swing.JLabel lblManoEnemy5;
    private javax.swing.JLabel lblManoEnemy6;
    private javax.swing.JLabel lblManoPlayer;
    private javax.swing.JLabel lblManoPlayer1;
    private javax.swing.JLabel lblManoPlayer2;
    private javax.swing.JLabel lblManoPlayer3;
    private javax.swing.JLabel lblManoPlayer4;
    private javax.swing.JLabel lblManoPlayer5;
    private javax.swing.JLabel lblManoPlayer6;
    private javax.swing.JLabel lblNumeroRonda;
    private javax.swing.JLabel lblRonda1;
    private javax.swing.JLabel lblturno;
    // End of variables declaration//GEN-END:variables
}
