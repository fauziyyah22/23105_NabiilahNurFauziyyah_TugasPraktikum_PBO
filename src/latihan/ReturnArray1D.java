/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author FIFI
 */
public class ReturnArray1D {
    static int[] get(){
        return new int[]{10,20,70,30,50};
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=get();
        for (int i:arr)
            System.out.print(i+" ");
    }
    
}
