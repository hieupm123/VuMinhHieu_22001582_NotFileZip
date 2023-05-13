package oop.principles.polymorphism;
        /* Đa hình là khả năng của đối tượng để có thể nhận các hình thái khác nhau,
        tức là một đối tượng có thể có nhiều hình dạng khác nhau, tùy thuộc vào ngữ cảnh sử dụng.
        Đa hình là một trong các tính chất cốt lõi của lập trình hướng đối tượng. */

public class Client {
    public static void main(String[] args) {
        Shape square = new Square();
        square.draw(); // Drawing a square

        Shape circle = new Circle();
        circle.draw(); // Drawing a circle

        Shape triangle = new Triangle();
        triangle.draw(); // Drawing a triangle

        /* Chúng ta có thể xây dựng các lớp con của
        Shape như Square, Circle và Triangle, và
        triển khai phương thức draw() cho từng lớp con. */
    }
}
