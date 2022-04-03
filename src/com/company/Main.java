package com.company;

public class Main {
    public static void main(String[] args){}

    public static Object createObject (String className) {

        Travel travel = new Travel("boutique", "restorante");
        Roma roma = new Roma("D&G", "Pizza Pepperone", "Zegnia", "Pasta alla Putanesca");
        Paris paris = new Paris("Chanel", "Croissant", "Paris 2022", "Cognac");



     switch (className){
         case "Travel" :
             System.out.println("City: Roma, Paris");

         case "Roma" :
             System.out.println( "Brad, Cooking");

         case "Paris" :
             System.out.println( " Fashion, Drinks");

     }
        return null;
    }
    public static void print (String className){
        System.out.println(className + Travel.class + Roma.class + Paris.class );
    }

    }


