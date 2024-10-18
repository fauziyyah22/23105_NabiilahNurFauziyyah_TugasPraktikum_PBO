/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author FIFI
 */
public class ArrayKota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] kota;
        
        kota = new String[3];
        
        kota[0] = "Jakarta";
        kota[1] = "Surabaya";
        kota[2] = "Semarang";
        
        System.out.println(kota[0]);
        System.out.println(kota[1]);
        System.out.println(kota[2]);
        
        for (int i=0; i<3; i++){
            System.out.println(kota[i]);
        }
    }
    
}
