package oop.principles.inheritance;

/* Kế thừa là sự liên quan giữa hai class với nhau,
   trong đó có class cha (superclass) và class con (subclass)
   Khi kế thừa class con được hưởng tất cả các phương thức và thuộc tính của class cha.
   Tuy nhiên, nó chỉ được truy cập các thành viên public và protected của class cha  */

public class Client {
    public static void main(String[] args) {
        Animal ani1 = new Animal("Bob");
        // Tạo ra một đối tượng hổ
        Tiger ani2 = new Tiger("Tiger Cute");
//        Tạo ra một đối tượng hổ
        Cat ani3 = new Cat("Cat Cute");
//         Tạo ra một đối tượng mèo
        System.out.println(ani1.getName());
        // In ra tên của loài vật thứ nhất tên Bob
        System.out.println(ani2.getName());
        // In ra tên của loài vật thứ hai
        System.out.println(ani3.getName());
        // In ra tên của loài vật thứ ba
//        Vì hổ và mèo có tiếng kêu đặc trưng riêng
//        nên in ra tiếng kêu đặc trưng đó
        ani2.greets();
        // Tiếng kêu đặc trưng của mèo
        ani3.greets();


    }
}
