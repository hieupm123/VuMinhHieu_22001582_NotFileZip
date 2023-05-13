package hus.oop.midterm.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     *
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        String ans = "";
        for (int index = 0; index < size(); ++index) {
            ans = ans + "[" + get(index) + "] ";
        }
        return ans;
    }
}
