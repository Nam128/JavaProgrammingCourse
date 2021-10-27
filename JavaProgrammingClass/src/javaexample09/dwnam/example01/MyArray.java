package javaexample09.dwnam.example01;

public class MyArray <E> {
    private int capacity;
    private int count=0;
    E[] arr;

    @SuppressWarnings("unchecked")
    public MyArray(int capacity) {
        super();
        this.capacity = capacity;
        arr = (E[]) new Object[this.capacity]; // 타입파라미터로 배열을 생성할 수 없으므로 Object로 생성 후 강제 형변환.
    }

    public void add(E e) {
        if(this.count < this.capacity) {
            arr[count++] = e;
        }
        else
            System.out.println("공간 부족");
    }

    public E getElement(int index) {
        if(index >= 0 && index<count) {
            return arr[index];
        } else return null;
    }
}
