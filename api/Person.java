package kosa.api;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	@Override
	public boolean equals(Object obj) { // Object로 형변환 된것임
		Person p = (Person) obj;
		if (name.equals(p.getName()) && age == p.getAge()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean equals(Person p) { //오버로딩
		if (name.equals(p.name) && age == p.age) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
