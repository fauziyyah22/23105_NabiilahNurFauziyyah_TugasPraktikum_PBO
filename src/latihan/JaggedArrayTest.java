/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author FIFI
 */
public class JaggedArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[][] = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];
        arr[3] = new int[4];
        
        int count = 1;
        for (int i=0; i<arr.length; i++)
            for (int j=0; j<arr[i].length; j++)
               arr[i][j] = count++;
        
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
