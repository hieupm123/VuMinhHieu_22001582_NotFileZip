package hus.oop.midterm.statistics;

import java.util.Arrays;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        this.dataSet = new ArrayDataSet();
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        double maxElement = dataSet.element(0);
        for (int i = 0; i < dataSet.size(); ++i) {
            maxElement = Math.max(dataSet.element(i), maxElement);
        }
        return maxElement;
    }

    @Override
    public double min() {
        double minElement = dataSet.element(0);
        for (int i = 0; i < dataSet.size(); ++i) {
            minElement = Math.max(dataSet.element(i), minElement);
        }
        return minElement;
    }

    @Override
    public double mean() {
        double sumElements = 0;
        for (int i = 0; i < dataSet.size(); ++i) {
            sumElements += dataSet.element(i);
        }
        return sumElements / dataSet.size();
    }

    @Override
    public double variance() {
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < dataSet.size(); ++i) {
            sum += (dataSet.element(i) - mean) * (dataSet.element(i) - mean);
        }
        return sum / dataSet.size();
    }

    @Override
    public double[] rank() {
        int n = dataSet.size();
        double[] dataFromDataSet = dataSet.elements(0, n - 1);
        double[] temp = Arrays.copyOf(dataFromDataSet, n);
        Arrays.sort(temp);

        double[] rank = new double[n];
        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(temp, dataFromDataSet[i]);
            double sum = index + 1;

            // Check for duplicates
            int count = 1;
            while (index + count < n && temp[index + count] == dataFromDataSet[i]) {
                sum += index + count + 1;
                count++;
            }
            while (index - count >= 0 && temp[index - count] == dataFromDataSet[i]) {
                sum += index - count + 1;
                count++;
            }

            rank[i] = sum / count;
        }
        return rank;
    }

    @Override
    public double median() {
        double[] tmp = dataSet.elements(0, dataSet.size() - 1);
        double[] elemntOfDataSet = tmp;
        Arrays.sort(tmp);
        if (dataSet.size() % 2 == 1) {
            return tmp[dataSet.size() / 2];
        }
        return (tmp[dataSet.size() / 2] + tmp[(dataSet.size() / 2) - 1]) / 2;
    }
}
