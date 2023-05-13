package oop.principles.abstraction;

public abstract class Animal {
    // Tạo ra một lớp trừu tượng Animal
    // Lớp này không thể được khởi tạo nhưng có thể được kế thừa
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
//    Hàm trừu tượng greets thể hiện tiếng kêu của loài
}
