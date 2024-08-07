package org.hastycode;

public class Dev {

    private int age;
    private Laptop laptop;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build() {
        System.out.println("Building HastyCode Dev");

    }
}
