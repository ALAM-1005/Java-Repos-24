package storingobjects;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student("Aman",85);
		Student s2 = new Student("rahul",95);
		
		Student[] s = new Student[2];
		
		s[0] = s1;
		s[1] = s2;
		
		for(int i = 0;i<s.length;i++) {
			
			System.out.println("Name is :"+s[i].name +"   Marks is  "+s[i].marks);
			
		}
		
		
	}

}
