package Lec19;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Person p = new Person("Raju", 22);
		//p.age = -9;
		p.setName("Raj");
		p.setAge(-9);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println("Bye");
//		System.out.println(p.name);
//		System.out.println(p.age);
		Person p1 = new Person();
//		System.out.println(p1.name);
//		System.out.println(p1.age);

	}

}
