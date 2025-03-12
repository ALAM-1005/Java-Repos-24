package storingobjects;

public class MobileMainClass {
	
	public static void main(String[] args) {
		
	
		Mobile m1 = new Mobile("iphone","15Pro",124000.50);
		Mobile m2 = new Mobile("Sumsang","24ultra",124000.50);


		Mobile[] m = {m1, m2};



		for(int i=0; i<m.length;i++) {

			System.out.println(m[i].brand+" "+m[i].modelName+" "+m[i].cost);


		}

		
	}

	

}
