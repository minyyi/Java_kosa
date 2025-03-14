package kosa.oop;

public class PhoneBook {
    private String name;
    private String phoneNum;
    private String birth;
    
    public PhoneBook() {}
    
    // 인자를 받는 생성자
    public PhoneBook(String name, String phoneNum, String birth) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.birth = birth;
    }
    
        public String getName() {
        return name;
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }
    
    public String getBirth() {
        return birth;
    }
    
   
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public void setBirth(String birth) {
        this.birth = birth;
    }
    
   
    public String toString() {
        return "이름: " + name + ", 전화번호: " + phoneNum + ", 생년월일: " + birth;
    }
}
