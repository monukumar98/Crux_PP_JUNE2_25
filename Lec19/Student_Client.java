package Lec19;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 19;
		s1.Intro_yourSelf();
		Student s2 = new Student();
		s2.name = "Raj";
		s2.age = 21;
		s2.Intro_yourSelf();
		s1.SayHey("Raju");
		// s1.Mentor_Name();
		Student.Mentor_Name(s2);

	}
	static {
		System.out.println("Student Client  static 1");
	}
}
