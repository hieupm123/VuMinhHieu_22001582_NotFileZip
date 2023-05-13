package hus.oop.midterm.statistics;

import java.util.NoSuchElementException;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        data = new double[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public double element(int index) {
        if (index >= size) {
            throw new NullPointerException();
        }
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        if(from < 0 || to >= size){
            throw new IndexOutOfBoundsException();
        }
        double dataElements[] = new double[to - from + 1];
        for (int index = from, indexDataElements = 0; index <= to;
             ++index, ++indexDataElements) {
            dataElements[indexDataElements] = data[index];
        }
        return dataElements;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        if (data.length <= this.size) {
            enlarge();
        }
        data[this.size] = value;
        this.size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     *
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if (data.length <= this.size) {
            enlarge();
        }
        double[] tempData = new double[data.length];
        for (int indexData = 0; indexData < index; ++indexData) {
            tempData[indexData] = data[indexData];
        }
        tempData[index] = value;
        for (int indexData = index, indexTempData = index + 1;
             indexData < this.size; ++indexData, ++indexTempData) {
            tempData[indexTempData] = data[indexData];
        }
        data = tempData;
        this.size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        if(index >= this.size || index < 0){
            throw new NoSuchElementException();
        }
        double[] tempData = new double[data.length];
        for (int indexData = 0; indexData < index; ++indexData) {
            tempData[indexData] = data[indexData];
        }
        for (int indexData = index + 1, indexTempData = index;
             indexData < this.size; ++indexData, ++indexTempData) {
            tempData[indexTempData] = data[indexData];
        }
        data = tempData;
        this.size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     *
     * @param value
     */
    @Override
    public void remove(double value) {
        int countNumRemove = 0;
        for (int indexData = 0; indexData < this.size; ++indexData) {
            if (data[indexData - countNumRemove] == value) {
                remove(indexData - countNumRemove);
                ++countNumRemove;
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        double[] tempData = new double[data.length * 2];
        for (int index = 0; index < this.size; ++index) {
            tempData[index] = data[index];
        }
        data = tempData;
    }
}
