package jsp;

public class MainClass {
	
	static void selectState(India obj) {
		
		if(obj instanceof karnataka) {
			
			karnataka k = (karnataka)obj;
			System.out.println("PM :"+k.pm+" CM: "+ k.cm);
		}
		else if(obj instanceof India) {
			
			TamilNadu t = (TamilNadu)obj;
			System.out.println(" PM: "+t.pm+" CM: "+t.cm);
		}
		else if(obj instanceof India) {
			
			Goa g = (Goa)obj;
			System.out.println(" PM: "+g.pm+" CM:"+g.cm);
		}
		
	}
	
	
    public static void main(String[] args) {
	
	selectState(new karnataka());
	System.out.println("-----------");
	selectState(new TamilNadu());
	System.out.println("------------");
	selectState(new Goa());
}
}
