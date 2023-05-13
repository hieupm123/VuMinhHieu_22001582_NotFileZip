package oop.principles.abstraction;

public class BigTiger extends Tiger {
    // Kế thừa từ lớp Tiger
    public BigTiger(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Gaow");
    }
// Ghi đè từ lớp trừu tượng Animal
    @Override
    public void greets(Tiger another) {
        System.out.println("Gaowww");
    }
//    Tiếng kêu của hổ to khi gặp con hổ bình thường khác
//    Ghi đè từ lớp Tiger

    public void greets(BigTiger another) {
        System.out.println("Gaowwwwwww");
    }
    //    Tiếng kêu của hổ to khi gặp con hổ to khác
}
