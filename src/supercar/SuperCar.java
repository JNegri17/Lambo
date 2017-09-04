/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercar;

import java.util.Scanner;

/**
 *
 * @author jaken
 */
public class SuperCar {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        double total = 0;
        String car;
        String sports;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to buy a Lamborghini or a Ferrari?");
        car = keyboard.nextLine().toLowerCase();
        if(car.startsWith("l")){
            total += 100000;
        }
        else if(car.startsWith("f")){
            total += 150000;
        }
        System.out.println("Would you like to upgrade to the sports package? (Yes or No)");
        sports = keyboard.nextLine().toLowerCase();
        if(sports.startsWith("y")){
            total += 50000;
        }
        System.out.println("Your total will be: " + total + "\nEnjoy your brand new supercar!");
        
    }
    
}
