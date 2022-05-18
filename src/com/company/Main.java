package com.company;

public class Main {

    public static void main(String[] args) {
        Dancer dancer = new Dancer("Айбек", "балеть", "классика");
        dancer.walk();
        dancer.eat();
        dancer.learn();
        dancer.getDance();
        System.out.println(dancer.toString());
        System.out.println("______________________________________________");
        Singer singer = new Singer("Ася", "Эстрадный певец", "Замандаш");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.guitar();
        System.out.println("______________________________________________");
        Programmer programmer =new Programmer("Артур", "фронтенд разработчик", "Мегаком");
        System.out.println(programmer);
        programmer.walk();
        programmer.eat();
        programmer.learn();
        programmer.coding();

    }

}
