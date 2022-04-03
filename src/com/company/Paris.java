package com.company;

public class Paris extends Travel implements  Printable{

    private String fashion;
    private String drinks;

    public Paris(String shoping, String eating, String fashion, String drinks) {
        super(shoping, eating);
        this.fashion = fashion;
        this.drinks = drinks;
    }

    @Override
    public void shoping() {
        super.shoping();
        System.out.println( "Chanel " + "Christian Dior");
    }

    @Override
    public void eating() {
        super.eating();
        System.out.println("French vine" + " Cognac");
    }
}
