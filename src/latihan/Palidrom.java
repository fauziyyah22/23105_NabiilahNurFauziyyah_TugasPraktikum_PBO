/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author FIFI
 */
public class Palidrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    boolean isPalidrom(String word){
        char[] charArray = word.toCharArray();
        int length = charArray.length;
        
        for (int i = 0; i<length; i++){
            if(charArray[i] != charArray[length-1-i]){
                return false;
            }
        }
        return true;
    }
    
}
