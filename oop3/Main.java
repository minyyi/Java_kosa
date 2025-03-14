package kosa.oop3;

public class Main {

	public static void main(String[] args) {
//		Role  role = new Role(role);
	
		Driver driver = new Driver();
		Doctor doctor = new Doctor();
		Person person1 = new Person("홍길동", doctor);
		System.out.print(person1.getName()+ "은 ");
		person1.doIt();
		Person person2 = new Person("길동", driver);
		System.out.print(person2.getName()+ "은 ");
		person2.doIt();
		
		//열심히 운전하는 Role추가 =>익명내부클래스
		
		Person p = new Person("sksksk", new Role() {
			
			@Override
			public void doing() {
				System.out.println("열심히 운전중이래");
				
			}
		});
		p.doIt();
			
		
//		Doctor  new = new Doctor() {
//			void print(String job) {
//				System.out.println("나는 학생이지");
//			}
//		};
	
//		MyService service = new MyService(role);
//		service.insertService();

	}

}
