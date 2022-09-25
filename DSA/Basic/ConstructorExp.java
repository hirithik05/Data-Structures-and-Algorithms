package basic;
class Student{
	String name;
	int age;
	public void display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class ConstructorExp {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "ravi";
		s1.age = 22;
		s1.display();
	}

}
