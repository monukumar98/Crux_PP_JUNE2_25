package Lec19;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My name is " + this.name + " age is " + this.age);
	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);
	}

	public static void Mentor_Name(Student s) {
//		Student s = new Student();
		System.out.println("Monu Bhaiya " + s.name);
	}

	static {
		System.out.println("Student static 1");
	}
	static {
		System.out.println("Student static 2");
	}
}







