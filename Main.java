/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Comlab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Hello World");
            Scanner obj = new Scanner (System.in);
            System.out.println("What is your name?:");
                String name = obj.nextLine();
            System.out.println("How old are you?:");
                String age = obj.nextLine();
            System.out.println("What's your address:");
                String add = obj.nextLine();
            
            System.out.println("Hi! "+ name);
            System.out.println("You are "+ age);
            System.out.println("You live at "+ add);
    }
    
}
