/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author FIFI
 */
public class AnonymousArray1D {
static void max(int arr[]){
            int max=arr[0];
            for(int i=1;i<arr.length;i++)
                if(max<arr[i])
                    max=arr[i];
                            
            System.out.println(max);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        max(new int[]{10,20,70,30,50});
    }
    
}

