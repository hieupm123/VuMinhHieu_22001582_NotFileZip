package hus.oop.midterm.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */
        System.out.println("--------Test My Array List-----------");
        testMyArrayList();
        System.out.println("--------Test My Linked List-----------");
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyArrayList list = new MyArrayList();
        list.append(1.0);
        list.append(2.0);
        list.append(3.0);
        list.append(4.0);
        list.append(5.0);

        BasicStatistic stat = new BasicStatistic(list);
        double max = stat.max();
        double min = stat.min();
        double mean = stat.mean();
        double variance = stat.variance();

        System.out.println("Data: " + list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyLinkedList list = new MyLinkedList();
        list.append(1.0);
        list.append(2.0);
        list.append(3.0);
        list.append(4.0);
        list.append(5.0);

        BasicStatistic stat = new BasicStatistic(list);
        double max = stat.max();
        double min = stat.min();
        double mean = stat.mean();
        double variance = stat.variance();

        System.out.println("Data: " + list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }
}
