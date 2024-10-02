package Java_Assignment;

import java.util.TreeSet;

public class MobileMainClass {
	public static void main(String[] args) {


		Mobile m1 = new Mobile ("Iphone 16");
		Mobile  m2 = new Mobile ("SumSang Ultra24");
		Mobile  m3 = new Mobile ("OppoReno 12");

		TreeSet<Mobile> t = new TreeSet<Mobile>();
		t.add(m1);
		t.add(m2);
		t.add(m3);

		for (Mobile m : t) {

			System.out.println(m);

		}

	}
}
