package oop.principles.polymorphism;

        /* Giả sử chúng ta có một lớp cha là Shape đại diện
        cho các hình dạng hình học như hình vuông,
        hình tròn, hình tam giác, v.v.
        Lớp Shape sẽ có một phương thức draw() để vẽ hình dạng. */
public abstract class Shape {
    public abstract void draw();
}
