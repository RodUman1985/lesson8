package com.company;

public class Main {

    public static void main(String[] args) {
	  //animal() вызов метода, который называется конструктор (конструктора)
        animal Anim = new animal();
        Anim.setAge(12);
        Anim.color= "green";
        Anim.printInfo();//
    animal Anim2=new animal();
        Anim2.setAge(103);
        Anim2.color= "red";
        Anim2.printInfo();//

        Cat kitty= new Cat();
        kitty.color= "black";
        kitty.setAge(25);
        kitty.printInfo();
        animal a= new animal(12);
        animal a2=new animal (11,"white");
        a.color= "rad";
        a.printInfo();
        a2.printInfo();
    }

}
