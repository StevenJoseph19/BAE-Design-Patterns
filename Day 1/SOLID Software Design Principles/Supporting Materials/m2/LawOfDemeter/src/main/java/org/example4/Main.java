package org.example4;

class Human {
    public void speak() {
        System.out.println("Hello, Dog!");
    }
}

class Dog {
    private Human human;

    public Dog(Human human) {
        this.human = human;
    }

    public void M() {
        human.speak();
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Dog dog = new Dog(h);
        dog.M();
    }
}
