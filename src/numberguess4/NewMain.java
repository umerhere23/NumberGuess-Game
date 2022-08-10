/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguess4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
    */public static String name(){
   String name;
    Scanner scanner = new Scanner(System.in);
     System.out.println("Please Enter Your Name To Start Game");
    name = scanner.nextLine();
    return name;
    }
    
}
