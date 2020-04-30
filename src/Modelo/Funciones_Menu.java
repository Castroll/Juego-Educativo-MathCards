/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Constructor_Menu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class Funciones_Menu 
{
    public DefaultTableModel CargarCabeceraIndividual(Constructor_Menu obj)
    {
        DefaultTableModel modelo = new DefaultTableModel();
        for (int i = 0; i < obj.Cabecera_TablaPuntuacion.length; i++) 
        {
            modelo.addColumn(obj.Cabecera_TablaPuntuacion[i]);
        }
        return modelo;
    }
    
    public DefaultTableModel CargarCabeceraVersus(Constructor_Menu obj)
    {
        DefaultTableModel modelo = new DefaultTableModel();
        for (int i = 0; i < obj.Cabecera_TablaPuntuacionVersus.length; i++) 
        {
            modelo.addColumn(obj.Cabecera_TablaPuntuacionVersus[i]);
        }
        return modelo;
    }
}
