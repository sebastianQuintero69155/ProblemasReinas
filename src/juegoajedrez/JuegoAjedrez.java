/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoajedrez;

import java.util.Scanner;

/**
 *
 * @author Sebastian Quintero
 */
public class JuegoAjedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingrese la pisicion en la fila de la primera reina");
        int fila = sc.nextInt();
        System.out.println("Favor ingrese la pisicion en la columna de la primera reina");
        int columna = sc.nextInt();
        
       Juego ficha=new Juego();
       ficha.llenarTablero(fila, columna);
        
    }

}
