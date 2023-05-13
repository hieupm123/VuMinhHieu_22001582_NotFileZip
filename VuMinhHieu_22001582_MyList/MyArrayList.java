package hus.oop.midterm.mylist;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (index >= size) {
            throw new NullPointerException();
        }
        return data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index >= this.size || index < 0) {
            throw new NullPointerException();
        }
        Object[] tempData = new Object[data.length];
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
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (data.length <= this.size) {
            enlarge();
        }
        data[this.size] = payload;
        this.size++;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index > this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (data.length <= this.size) {
            enlarge();
        }
        Object[] tempData = new Object[data.length];
        for (int indexData = 0; indexData < index; ++indexData) {
            tempData[indexData] = data[indexData];
        }
        tempData[index] = payload;
        for (int indexData = index, indexTempData = index + 1;
             indexData < this.size; ++indexData, ++indexTempData) {
            tempData[indexTempData] = data[indexData];
        }
        data = tempData;
        this.size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(data);
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        Object[] tempData = new Object[data.length * 2];
        for (int index = 0; index < this.size; ++index) {
            tempData[index] = data[index];
        }
        data = tempData;
    }
}
