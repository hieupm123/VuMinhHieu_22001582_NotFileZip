package hus.oop.midterm.mylist;

import java.util.NoSuchElementException;

public class MyLinkedListIterator implements MyIterator {
    /* GỢI Ý: */
    /*
    MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
    các phần tử còn lại trong MyLinkedList.
     */
    private MyLinkedListNode currentNode;

    /**
     * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
     *
     * @param node
     */
    public MyLinkedListIterator(MyLinkedListNode node) {
        this.currentNode = node;
    }

    /**
     * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (this.currentNode != null) {
            return true;
        }
        return false;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
     *
     * @return payload của phần tử hiện tại.
     */
    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.currentNode = this.currentNode.getNext();
        return this.currentNode.getPayload();
    }
}
