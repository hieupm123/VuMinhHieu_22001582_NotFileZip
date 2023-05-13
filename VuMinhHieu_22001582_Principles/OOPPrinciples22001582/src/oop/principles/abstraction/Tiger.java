package oop.principles.abstraction;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Gaow");
    }

    public void greets(Tiger another) {
        System.out.println("Gaoww");
    }
//    Tiếng kêu của hổ khi gặp hổ khác

}
