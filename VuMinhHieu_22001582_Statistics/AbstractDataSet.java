package hus.oop.midterm.statistics;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Mô tả tập dữ liệu.
     *
     * @return mô tả tập dữ liệu dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        String data = "[";
        double[] myData = this.elements(0, size() - 1);
        for (int index = 0; index < size(); ++index) {
            if (index != 0) {
                data = data + ", ";
            }
            data = data + myData;
        }
        data = data + "]";
        return data;
    }
}
