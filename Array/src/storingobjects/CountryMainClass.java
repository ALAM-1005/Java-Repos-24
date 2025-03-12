package storingobjects;

public class CountryMainClass {

	public static void main(String[] args) {


		Country c1 = new Country("India",140.0);
		Country c2 = new Country("China",170.0);
		
		Country[] c = new Country[2];
		
		c[0]= c1;
		c[1] = c2;
		
		
		for(int i=0;i<c.length;i++) {
			
			
			System.out.println("Population of"+c[i].conName+"  "+c[i].population);
		}

	}

}
