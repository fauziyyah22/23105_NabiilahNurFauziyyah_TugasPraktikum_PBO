/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author FIFI
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        System.out.println("+----------------------------------+");
        System.out.println("|          Tabel Perkalian         |");
        System.out.println("+----------------------------------+");

        System.out.print("|   X  ");
        for (int i = 1; i <= n; i++){
            System.out.printf("|   %2d ", i);
        }
        System.out.println("|");
        System.out.println("+----------------------------------+");
        
        for (int i = 1; i <= n; i++){
            System.out.printf("|   %2d ", i);
            for (int j = 1; j <= n; j++){
                System.out.printf("|   %2d ", i * j);
            }
            System.out.println("|");
        }
        System.out.println("+----------------------------------+");
    }
}