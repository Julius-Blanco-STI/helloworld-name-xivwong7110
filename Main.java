
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
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
