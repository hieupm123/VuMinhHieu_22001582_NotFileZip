package oop.principles.abstraction;

public class Cat extends Animal {
//    Kế thừa từ lớp trừu tượng Animal
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }
//    Tiếng kêu của loài mèo ghi đè từ lớp trừu tượng Animal
}
