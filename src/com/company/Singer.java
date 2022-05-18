package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void guitar(){
        System.out.println("Ырчы гитарада черткенди билет");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ырчы балмуздак жебейт");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Сахнада коп кыймылдайт");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Комуз черткенди уйронуп жатат");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
