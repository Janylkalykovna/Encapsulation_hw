package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer() {
        super();
    }



    public void coding(){
        System.out.println("Программист код жазгандан ырахат алат");
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("Программист фастфудду коп жейт");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Жумушуна жоо басып келет.");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Пайтон тилин уйронуп жатат");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
