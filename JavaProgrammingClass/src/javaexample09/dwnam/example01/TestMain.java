package javaexample09.dwnam.example01;

public class TestMain {
    public static void main(String[] args) {
        // Generic Programming
        MyArray<Integer> arr1 = new MyArray<Integer>(10);
        arr1.add(10); // index: 0
        arr1.add(20); // index: 1
        arr1.add(30);
        arr1.add(40);

        Integer num = arr1.getElement(5); // Integer는 참조타입이므로 null값도 받을 수 있음
        if(num==null) System.out.println("인덱스 참조 오류");

//        try {
//            int num = arr1.getElement(5);
//        } catch(NullPointerException e) {
//            System.out.println("인덱스 참조 오류");
//        }

        MyArray<Integer> arr2 = new MyArray<>(20);

        MyArray<String> arr3 = new MyArray<>(10);
        arr3.add("greenjoa1");
        arr3.add("greenjoa2");
        arr3.add("greenjoa3");
        String str = arr3.getElement(1);
    }
}
