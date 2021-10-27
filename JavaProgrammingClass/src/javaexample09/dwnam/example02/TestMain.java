package javaexample09.dwnam.example02;

import java.util.List;
import java.util.Vector;

public class TestMain {

    public static void main(String[] args) {
        // 벡터 생성 방법
        List<Integer> vec1 = new Vector<Integer>(); // 부모로 참조가능
        Vector<Integer> vec2 = new Vector<Integer>(); // 벡터로도 참조가능
        Vector<Integer> vec3 = new Vector<>(); // 뒤에는 타입 생략 가능
        Vector<Integer> vec4 = new Vector<>(); // 벡터 초기 사이즈 부여 가능

        Vector<String> vec5 = new Vector<>();
        System.out.println(vec5.size()+" : "+vec5.capacity()); // Vector의 기본 용량은 10

//        List로 참조하면 .capacity() 메소드는 없음. 각 클래스에 따라 지원되는 메소드가 다름.
//        List<String> vec6 = new Vector<>();
//        System.out.println(vec6.size()+" : "+vec6.capacity());

        Vector<String> vec6 = new Vector<>(3); // 초기 capacity를 3으로 설정
        vec6.add("dwnam1");
        vec6.add("dwnam2");
        vec6.add("dwnam3");
        vec6.add("dwnam4");
        System.out.println(vec6.size()+" : "+vec6.capacity()); // 3을 넘어가려고 할 때(overflow) 3의 배수인 6이 됨

        Vector<String> vec7 = new Vector<>(3, 5); // 초기 capacity를 3으로 설정. 다음 용량은 5씩 증가.
        vec7.add("dwnam1");
        vec7.add("dwnam2");
        vec7.add("dwnam3");
        vec7.add("dwnam4");
        System.out.println(vec7.size()+" : "+vec7.capacity()); // 3을 넘어가려고 할 때(overflow) capacityIncrement인 5가 더해져 8이 됨

        Vector<String> vec8 = new Vector<>(vec7);
        System.out.println(vec8); // 벡터 멤버의 리스트를 출력


        // 벡터의 메소드들
        Vector<String> vec = new Vector<>();
        vec.add("dwnam1");
        vec.add("dwnam2");
        vec.add("dwnam3");
        vec.add("dwnam4");
        vec.add("dwnam5");
        vec.add(2, "dwnam6"); // 해당 인덱스에 요소 추가

        vec.remove(0); // remove에 index 전달
        vec.remove("dwnam5"); // remove에 object 전달

        vec.trimToSize(); // 데이터가 있는 size만큼 capacity 축소

        for(String str : vec) {
            System.out.println(str);
        }

        System.out.println("------------------");

        for(int i=0; i<vec.size(); i++) {
            System.out.println(vec.get(i));
//            System.out.println(vec.elementAt(i)); 위와 같음. 해당 인덱스의 요소 반환.
        }

        System.out.println(vec.size()+" : "+vec.capacity());


        //sublist
        Vector<String> vec9 = new Vector<>();
        vec9.add("dwnam1"); // 0
        vec9.add("dwnam2"); // 1
        vec9.add("dwnam3"); // 2
        vec9.add("dwnam4"); // 3
        vec9.add("dwnam5"); // 4
        vec9.add("dwnam6"); // 5

        List<String> vec10 = vec9.subList(1, 5); // 앞(포함)~뒤(미포함) list를 return함
        System.out.println(vec10);

        vec9.subList(1, 3).clear(); // index 1, 2만 삭제
        System.out.println(vec9);

        Vector<String> vec11 = new Vector<>();
        vec11.add("dwnam1"); // 0
        vec11.add("dwnam2"); // 1
        vec11.add("dwnam3"); // 2
        vec11.add("dwnam4"); // 3
        vec11.add("dwnam5"); // 4
        vec11.add("dwnam6"); // 5
        vec11.add("dwnam5");
        vec11.add("dwnam2");
        vec11.add("dwnam5");
        vec11.add("dwnam4");
        vec11.add("dwnam5");
        vec11.add("dwnam6");

        vec11.remove("dwnam5");
        System.out.println(vec11); // 맨 앞에 있는 "dwnam5"만 삭제됨

        System.out.println("--------------------");

        while(vec11.contains("dwnam5")) { // 특정 객체가 포함되어 있나 확인
            int index = vec11.indexOf("dwnam5"); // 여러 index 중 처음만난 index를 가져옴
            vec11.remove(index); // 객체가 포함되어 있을 때 제거
        }
        System.out.println(vec11);

        //벡터에 데이터 삽입
        Vector<Word> vec12 = new Vector<Word>();
        vec12.add(new Word("red", "빨강"));
        vec12.add(new Word("green", "초록"));
        vec12.add(new Word("blue", "파랑"));
        Word w = new Word("yellow", "노랑");
        vec12.add(w);

        vec12.remove(0);
        vec12.remove(w); // 이건 제거가 잘 되지만
        vec12.remove(new Word("green", "초록")); // 이건 안 됨. 아예 다른 객체임. 참조값이 같은 지 equals 메소드를 자동호출하므로 다른 객체는 제거 불가.

        System.out.println(vec12);
    }

}
