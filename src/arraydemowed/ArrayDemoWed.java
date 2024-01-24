/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 hkucj hfdfjfvkfdkvaxsbkv lndfl.
 kgvefvdsd
 */
package arraydemowed;


//I don't want anything 

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoWed {

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        
        
        char[] myLetters = new char[myWord.length()];
        
        
        for(int i=0; i<myLetters.length; i++) // because the index starts from zero
        {
          myLetters[i] = myWord.charAt(i);
        }
        
        System.out.println("Printing in reverse");
        
        for (int i=myLetters.length-1; i>=0;i--) {
            System.out.println(myLetters[i]);
        }
    }
    
}
