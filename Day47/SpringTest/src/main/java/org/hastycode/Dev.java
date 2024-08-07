package org.hastycode;

public class Dev {

    private Computer com;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(Computer com) {
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {
        System.out.println("Building HastyCode Dev");

    }
}
