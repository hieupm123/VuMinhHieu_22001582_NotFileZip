package hus.oop.midterm.mylist;

import java.util.NoSuchElementException;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     *
     * @return giá trị lớn nhất.
     */
    public double max() {
        if (data.size() < 0) {
            throw new NoSuchElementException();
        }
        double maxElement = (double) data.get(0);
        for (int index = 0; index < data.size(); ++index) {
            maxElement = Math.max(maxElement, (double) data.get(index));
        }
        return maxElement;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        if (data.size() < 0) {
            throw new NoSuchElementException();
        }
        double minElement = (double) data.get(0);
        for (int index = 0; index < data.size(); ++index) {
            minElement = Math.max(minElement, (double) data.get(index));
        }
        return minElement;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        double sumElements = 0;
        for (int i = 0; i < data.size(); ++i) {
            sumElements += (double) data.get(i);
        }
        return sumElements / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < data.size(); ++i) {
            sum += ((double) data.get(i) - mean) * ((double) data.get(i) - mean);
        }
        return sum / data.size();
    }
}
