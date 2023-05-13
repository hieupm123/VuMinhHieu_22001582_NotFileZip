package oop.principles.abstraction;
/* Đây là khả năng của chương trình bỏ qua hay
// không chú ý đến một số khía cạnh của thông tin mà nó
// đang trực tiếp làm việc lên, nghĩa là nó có khả năng
// tập trung vào những cốt lõi cần thiết. */
public class Client {
    public static void main(String[] args) {
        Animal tigerBig1 = new BigTiger("Big1");
        BigTiger tigerBig2 = new BigTiger("Big2");
        // Cùng chung thuộc Animal nên có thể khai báo như vậy
        Tiger tiger1 = new Tiger("Tiger1");
        Tiger tiger2 = new Tiger("Tiger2");
        Cat cat = new Cat("Cat");
        // Khởi tạo đối tượng với tên tương ứng
        // Tiếng kêu từng loài đặc trưng tương ứng
        System.out.println("Tiếng kêu đặc trưng hổ lớn");
        tiger1.greets();
        System.out.println("Tieng keu dac trung cua ho");
        tiger1.greets();
        System.out.println("Tieng keu dac trung cua meo");
        cat.greets();
        System.out.println("Tieng keu cua ho voi ho");
        tiger1.greets(tiger2);
        System.out.println("Tieng keu cua ho to voi ho to");
        ((BigTiger) tigerBig1).greets(tigerBig2);
    }
}
