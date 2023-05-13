package hus.oop.midterm.statistics;

public class TestStatistics {
    public static void addData(AbstractDataSet dataSet) {
        dataSet.append(10);
        dataSet.append(20);
        dataSet.append(30);
        dataSet.append(40);
        dataSet.append(50);
        dataSet.insert(10, 0);
        dataSet.insert(10, 0);
        dataSet.insert(80, 2);
        dataSet.insert(90, 3);
        dataSet.insert(100, 4);
    }

    public static void printDataAndImformation(Statistic dataSetTest, AbstractDataSet dataSet) {
        System.out.println("Tap du lieu la:");
        for (int i = 0; i < dataSet.size(); ++i) {
            System.out.print(dataSet.element(i) + " ");
        }
        System.out.println();
        System.out.println("Co mau la: " + dataSetTest.size());
        System.out.println("Max la: " + dataSetTest.max());
        System.out.println("Min la: " + dataSetTest.min());
        System.out.println("Ki vong la: " + dataSetTest.mean());
        System.out.println("Phuong sai la: " + dataSetTest.variance());
        System.out.println("Rank la: ");
        for (double i : dataSetTest.rank()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Trung vi la: " + dataSetTest.median());
    }

    public static void main(String[] args) {
        Statistic dataSetTest = new BasicStatistic();
        /*
        TODO

        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:

         */
        System.out.println("----------Test Array Data Set----------");
        /* 1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
        + Thêm phần tử vào cuối tập dữ liệu.
        + Thêm phần tử vào đầu tập dữ liệu. */

        AbstractDataSet testArrayDataSet = new ArrayDataSet();
        ((BasicStatistic) dataSetTest).setDataSet(testArrayDataSet);
        addData(testArrayDataSet);

        /* 2. In ra các dữ liệu thống kê về tập dữ liệu
        (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        printDataAndImformation(dataSetTest, testArrayDataSet);

        /*3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.*/

        testArrayDataSet.remove(0);
        testArrayDataSet.remove(testArrayDataSet.size() - 1);

        /*4. In ra các dữ liệu thống kê về tập dữ liệu
        (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).*/
        printDataAndImformation(dataSetTest, testArrayDataSet);

        /*
         Viết hàm test cho ListDataSet:
        */

        /* 1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
        + Thêm phần tử vào cuối tập dữ liệu.
        + Thêm phần tử vào đầu tập dữ liệu. */

        testArrayDataSet.remove(testArrayDataSet.size() - 1);
        System.out.println("----------Test List Data Set----------");
        AbstractDataSet testListDataSet = new ListDataSet();
        addData(testListDataSet);
        ((BasicStatistic) dataSetTest).setDataSet(testListDataSet);

        /* 2. In ra các dữ liệu thống kê về tập dữ liệu
        (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        printDataAndImformation(dataSetTest, testListDataSet);

        /*3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.*/

        testListDataSet.remove(0);
        testListDataSet.remove(testListDataSet.size() - 1);

        /*4. In ra các dữ liệu thống kê về tập dữ liệu
        (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).*/

        printDataAndImformation(dataSetTest, testListDataSet);


        /*
         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */


    }
}
