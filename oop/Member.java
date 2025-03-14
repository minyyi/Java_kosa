package kosa.oop;


public class Member {
    private String name;
    private String age;

    // 기본 생성자
    public Member() {}

    // 인자를 받는 생성자
    public Member(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // 이름 getter와 setter
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    // 나이 getter와 setter
    public void setAge(String age) {
        this.age = age;
    }
    
    public String getAge() {
        return age;
    }
    
    // 회원 정보를 문자열로 반환하는 메소드
     public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}
