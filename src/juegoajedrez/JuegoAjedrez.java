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
        //Parte en la cual se le solicita la entrada al usuario donde quiere ingresar la primer reina se hace por consola.
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        while (true) {
            System.out.println("Favor ingrese la pisicion en la fila de la primera reina de 0-7");
            int fil = sc.nextInt();
            if (fil >= 0 && fil < 8) {
                fila = fil;
                break;
            }
            System.out.println("Dato erroneo");
        }

        while (true) {
            System.out.println("Favor ingrese la pisicion en la columna de la primera reina 0-7");
            int colum = sc.nextInt();
            if (colum >= 0 && colum < 8) {
                columna = colum;
                break;
            }
            System.out.println("Dato erroneo");
        }

        Juego ficha = new Juego();
        ficha.llenarTablero(fila, columna);
        //--------------------------------------------------------------------------------------------

    }

}
