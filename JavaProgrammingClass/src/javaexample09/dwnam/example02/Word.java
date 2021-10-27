package javaexample09.dwnam.example02;

public class Word {
    String eng;
    String kor;

    public Word(String eng, String kor) {
        super();
        this.eng = eng;
        this.kor = kor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Word) { // 참조값이 아니라 뜻과 단어가 같으면 같은 객체라고 판단할 수 있음
            Word temp = (Word)obj;
            return this.eng.equals(temp.eng)&&this.kor.equals(temp.kor);
        }
        return super.equals(obj); // 이 줄만 있으면 참조값이 같은 지를 비교했음
    }

    @Override
    public String toString() {
        return eng+" : "+kor;
    }
}
