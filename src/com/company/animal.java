package com.company;

public class animal {
    public String color;
    private int age;
    private int high;

    // для конструктора @owerrite не пишется
    public animal (){
        System.out.println("animal was created");
    }
    public animal (int age){
        this.setAge(age);
    }
    public animal (int age,String color){
        // this () - вызов конструктора (ОБЯЗАТЕЛЬНО в ПЕРВОЙ СТРОЧКЕ конструктора)
        this(age);
        this.color=color;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public  void printInfo () {
        System.out.println(this.color+","+this.age);
    }
    public void setAge(int age) {
        if (age<0||age>100) {
            System.out.println("Неверный возраст");
            return;
        }
        this.age=age; // this - в java это ссылка на текущий экземпляр объекта класса.
    }
    public int getAge () {
        return this.age;
    }
    // super - в java это ссылка на родительский экземпляр объекта класса.


}
