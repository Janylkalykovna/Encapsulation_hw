package com.company;

public class Dancer extends Person{
    private String gruopName;


    public Dancer(String name, String designation, String gruopName) {
        super(name, designation);
        this.gruopName = gruopName;
    }
    public void getDance(){
        System.out.println("Бийчи бийлегенди жакшы корот");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Бийчи майлуу таамактарды жебейт");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Бийчи туз басат");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Кунуго жаны упражненияларды уйронот");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "gruopName='" + gruopName + '\'' +
                '}';
    }
}
