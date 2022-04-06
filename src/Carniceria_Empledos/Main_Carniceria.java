package Carniceria_Empledos;

import Carniceria_Interfaz.*;

/**
 *
 * @author MierderTheKat
 */
public class Main_Carniceria {

    public static void main(String[] args) {
        
        M_Login pantalla = new M_Login(); //creo la pantalla inicio
        
        pantalla.setVisible(true); //Se hace visible  
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
    }
}