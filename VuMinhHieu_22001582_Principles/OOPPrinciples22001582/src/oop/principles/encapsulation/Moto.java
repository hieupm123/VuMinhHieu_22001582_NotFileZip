package oop.principles.encapsulation;

public class Moto {
    private String company;

    private String carName;

    /* Ẩn các biến về công ti sản xuất xe và tên xe
    giúp tăng tính bảo mật vì người dùng sẽ không biết
    lớp được triển
    khai và lưu trữ như thế nào */
    public Moto(String company, String carName) {
        this.company = company;
        this.carName = carName;
    }
    /* Hàm khởi tạo giá trị cho 2 biến company và carName */

    public String getCompany() {
        return company;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    /* Các hàm getter setter giúp cho giúp người dùng
     * có thể truy cập vào các biến private
     * Ta có thể chỉ sử dụng hàm get để lấy thông tin
     *  và hàm set để cập nhật thông tin có những biến chỉ bao gồm 1 trong 2 */
}
