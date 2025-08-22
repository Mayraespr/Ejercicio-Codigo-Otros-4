package com.generation;
import java.util.Scanner;//se importa librería
/* Pedimos al jugador 1 que introduzca su elección, despúes se le pide lo 
 * mismo al jugador 2, indicamos que la información se coloque en la siguiente
 * línea para una mejor visualización.
 * Comparamos las elecciones de los jugadores, si son iguales imprime "Empate"
 * si no son iguales, se inicia una variable donde suponemos que gana el jugador 1
 * Usamos un switch en la elección del jugador 1 para revisar cada una de las
 * opciones, si no se cumple ningún caso, asignamos que el ganador es el jugador 2*/
public class Codigo4 {
public static void main (String[] args){ //Se agrega main para correr el código
    Scanner s = new Scanner(System.in);//indicamos que se activará cuando reciba el dato
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//se corrige número de jugador
    Scanner s2 = new Scanner(System.in);
    String j2 = s.nextLine();
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 1;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;}
          
        case "tijera":
          if (j2 == "papel") {
            g = 1;
          }
          break;
        default:
        	g = 2; //Si no se cumplen los caso anteriores
      }
      System.out.println("Gana el jugador " + g);
    }
}//main
}//class