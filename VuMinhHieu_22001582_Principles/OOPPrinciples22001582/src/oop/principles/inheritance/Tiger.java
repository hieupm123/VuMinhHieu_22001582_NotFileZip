package oop.principles.inheritance;

public class Tiger extends Animal{
    // Kế thừa từ lớp Animal vì tiger cũng có chung thuộc tính name với lớp Animal
    public Tiger(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("GAOW");
    }
    // Bổ sung thêm tiếng kêu đặc trưng của loài hổ
}
