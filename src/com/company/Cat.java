package com.company;

public class Cat extends animal {
    public boolean isBald;
        // переопредиление метода printinfo из класса animal
        // (изменение кода родительского метода)
        //@ override - переопредиление
    @Override
    public  void printInfo () {
        if (this.isBald){
            System.out.print("bald");
        } else {
            System.out.print("no bald");
        }
        System.out.println("   "+this.color+","+this.getAge());
    }

}
