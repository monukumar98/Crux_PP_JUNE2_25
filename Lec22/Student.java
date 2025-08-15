package Lec22;

public class Student {
	String name = "Kaju";
	int age = 22;

	public void fun() {
		System.out.println("Fun in Student ");
	}

	@Override
	public String toString() {// object ka class overrride
		return name+" "+age;
	}

}
