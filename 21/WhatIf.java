public class WhatIf {
    public static void main(String[] args) {
        int people = 20;
        int cats = 30;
        int dogs = 15;
        
        if (people > cats) {
        System.out.println("Too many cats! The world is doomed!");
        }
        //the statement above was made to not be displayed
        if (people > cats) {
        System.out.println("Not many cats! The world is saved!");
        }

        if (people < dogs) {
        System.out.println("The world is drooled on!");
        }
        
        if (people > dogs) {
        System.out.println("The world is dry!");
        }
        //the "if" statement makes the staements under display if it is true
        dogs += 5;
        
        if (people >= dogs) {
        System.out.println("People are greater than or equal to dogs.");
        }
        //the brackets determine the boundaries for which statements should be considered true or false
        if (people <= dogs) {
        System.out.println("People are less than or equal to dogs.");
        }
        
        if (people == dogs) {
        System.out.println("People are dogs.");
        }
    }
}
