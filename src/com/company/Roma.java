package com.company;

public class Roma extends Travel implements Printable{

    private String brand;
    private String cooking;

    public Roma(String shoping, String eating, String brand, String cooking) {
        super(shoping, eating);
        this.brand = brand;
        this.cooking = cooking;

            }

    @Override
    public void shoping() {
        super.shoping();
        System.out.println("Lamborghini " + " Ferrari");
    }

    @Override
    public void eating() {
        super.eating();
        System.out.println("Pizza " + " Pasta");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCooking() {
        return cooking;
    }

    public void setCooking(String cooking) {
        this.cooking = cooking;
    }
}
