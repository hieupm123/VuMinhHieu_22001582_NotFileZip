package oop.principles.encapsulation;

public class Client {
    /* Đóng gói là một cách để hạn chế quyển truy
     cập trực tiếp vào một số thành phần của đối tượng.
     Đóng gói có thể được sử dụng để ẩn cả các thành viên
     dữ liệu và các hàm hoặc phương thức dữ liệu được
     liên kết với một lớp hoặc đối tượng được khởi tạo. */

    public static void main(String[] args) {
        Moto firstMoto = new Moto("Honda", "MT123");
        System.out.print("Hang xe cua xe thu nhat la: ");
        System.out.println(firstMoto.getCompany());
        System.out.print("Ten xe cua xe thu nhat la: ");
        System.out.println(firstMoto.getCarName());
        firstMoto.setCarName("HT666");
        // Cap nhat lai ten cho xe
        // Hanh vi nay chi danh cho viec cap nhat lai ten xe
        // Con ten hang la co dinh va khong the cap nhat
        System.out.print("Ten xe cua xe thu nhat sau cap nhat la: ");
        System.out.println(firstMoto.getCarName());
    }
}
