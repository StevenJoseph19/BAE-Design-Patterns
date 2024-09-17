package org.example3;

class Human {
    public void speak() {
        System.out.println("Hello, Dog");
    }
}

class Dog {
    public void M(Human human) {
        human.speak();
        System.out.println("Bark(_-_)");
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Dog obj = new Dog();
        obj.M(h);
    }
}
