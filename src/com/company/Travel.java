package com.company;

public class Travel extends World implements Printable{

private String shoping;
private String eating;

    public Travel(String shoping, String eating) {
        this.shoping = shoping;
        this.eating = eating;
    }




    @Override
    public void shoping() {
        System.out.println("Мировые бренды");

    }

    @Override
    public void eating() {
        System.out.println("Мировая кулинария");

    }

    public String getShoping() {
        return shoping;
    }

    public void setShoping(String shoping) {
        this.shoping = shoping;
    }

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }
}
