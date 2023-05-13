package oop.principles.inheritance;

public class Cat extends Animal{
    // Kế thừa từ lớp Animal vì cat cũng có chung thuộc tính name với lớp Animal
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("MEOW");
    }
    // Bổ sung thêm tiếng kêu đặc trưng của loài mèo
}
