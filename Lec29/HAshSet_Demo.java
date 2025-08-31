package Lec29;

import java.util.*;

public class HAshSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(1);
		set.add(31);
		set.add(-7);
		set.add(2);
		set.add(4);
		set.add(-7);
		System.out.println(set);
//		// get
//		System.out.println(set.contains(1));
//		System.out.println(set.contains(11));
//		// remove
//		System.out.println(set.remove(1));
//		System.out.println(set.remove(11));
//		System.out.println(set.size());
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(1);
		set1.add(31);
		set1.add(-7);
		set1.add(2);
		set1.add(4);
		set1.add(-7);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(1);
		set2.add(31);
		set2.add(-7);
		set2.add(2);
		set2.add(4);
		set2.add(-7);
		System.out.println(set2);
		for(int x:set) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:set1) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:set2) {
			System.out.print(x+" ");
		}
		

	}

}
