package org.example1;

class Helper {
    void M() {
        System.out.println("Hello from M()");
        this.anotherMethod();
    }

    void anotherMethod() {
        System.out.println("I am anotherMethod() of the same class");
    }
}

public class Main {
    public static void main(String[] args) {
        Helper obj = new Helper();
        obj.M();
    }
}
