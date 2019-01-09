/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoajedrez;

import java.util.Random;

/**
 *
 * @author Sebastian Quintero
 */
public class Juego {

    int[][] tablero = new int[8][8];

    public void llenarTablero(int fila, int columna) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = 0;
            }
        }
        llenarReinas(fila, columna);
    }
    //llenar reinas aleatoriamente mediante el randon que nos genera la posicion

    public int[][] llenarReinas(int fil, int colum) {
        configuracionTablero(fil, colum);
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            int fila = r.nextInt(8);
            int columna = r.nextInt(8);
            boolean disponible = disponible(fila, columna);
            if (disponible == true) {
                configuracionTablero(fila, columna);
            } else {
                i--;
            }

        }
        int respu[][] = resultado();
        return respu;
    }
    //---------------------------------------------------
    
    //Verificamos la disponibilidad de la coordenada en el tablero de ajedrez

    public boolean disponible(int fila, int columna) {
        if (tablero[fila][columna] == 0) {
            return true;
        }
        return false;
    }
    //-------------------------------------------------------------------------
    
    //Metodo para condicionar las casillas en las cuales no se pueden ingresar nuevas reinas

    public void configuracionTablero(int fila, int columna) {
        int posFila = fila;
        int posColu = columna;
        int i = 0;
        int j = 0;
        //Ingresamos la reina en la posicion
        tablero[fila][columna] = 8;
        //----------------------------------

        //llenamos las filas y las columnas de 1 
        for (int x = 0; x < tablero.length; x++) {
            if (tablero[posFila][x] != 8) {
                tablero[posFila][x] = 1;
            }
            if (tablero[x][posColu] != 8) {
                tablero[x][posColu] = 1;
            }
        }
        //llenar diagonal derecha inferior de unos
        i = fila;
        j = columna;
        while (true) {
            i++;
            j++;
            if (i > (tablero.length - 1) || j > tablero.length - 1) {
                break;
            } else {
                tablero[i][j] = 1;
            }
        }
        //--------------------------------

        //llenar diagonal izquierda inferiror con unos
        i = fila;
        j = columna;
        while (true) {
            i++;
            j--;
            if (i > tablero.length - 1 || j < 0) {
                break;
            } else {
                tablero[i][j] = 1;
            }
        }
        //llenamos diagonal derecha superior con unos
        i = fila;
        j = columna;
        while (true) {
            i--;
            j++;
            if (i < 0 || j > tablero.length - 1) {
                break;
            } else {
                tablero[i][j] = 1;
            }
        }
        //----------------------------------

        //llenamos diagonal izquierda superior con unos
        i = fila;
        j = columna;
        while (true) {
            i--;
            j--;
            if (i < 0 || j < 0) {
                break;
            } else {
                tablero[i][j] = 1;
            }
        }
        //------------------------------------

    }
    //------------------------------------------------------------------

    //Metodo para mostrar las posiciones de las reinas dentro del tablero de ajedrez
    public int[][] resultado() {
        int[][] resu = new int[8][2];

        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                if (tablero[x][y] == 8) {
                    System.out.println("La posicion de las reinas es en\n " + "fila:" + x + " Columna" + y + "\n");
                }
            }

        }
        return resu;
    }
    //-------------------------------------------------------------------------------

}
