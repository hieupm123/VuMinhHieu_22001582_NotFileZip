package hus.oop.midterm.mylist;

import java.util.NoSuchElementException;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.size = 0;
        head = null;
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
        if (index >= this.size || index < 0) {
            throw new NoSuchElementException();
        }
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        MyLinkedListNode current = this.head;
        for (int i = 0; i < index; ++i) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
        this.size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (head == null) {
            head = new MyLinkedListNode(payload);
        } else {
            MyLinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new MyLinkedListNode(payload));
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new MyLinkedListNode(payload);
        } else {
            MyLinkedListNode prev = getNodeByIndex(index - 1);
            prev.setNext(new MyLinkedListNode(payload, prev.getNext()));
        }
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
