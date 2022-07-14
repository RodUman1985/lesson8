package com.company;

public class Kitty extends Cat{
    @Override
    public void printInfo() {
        animal Parent=this;
        super.printInfo();
    }
}
