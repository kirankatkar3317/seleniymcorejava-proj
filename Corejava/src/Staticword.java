
public class Staticword {
//instatntanius variable
	String city;
	String name;
	static String lastname= "katkar"; 
	static int i =0;
	public Staticword(String city, String name) {
		this.city = city;//local variable
		this.name = name;
		
		
	}
	
//	public  void getData() {
//		
//		System.out.println(city + name + lastname);//non static variable not allowed
//		i++;
//		System.out.println(i);
//	}
//	
	
	
	public static void getData() {
		
		System.out.println(lastname);//only static variables allowed
		i++;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticword sw = new Staticword("mumbai","kiran");
		Staticword sw1 = new Staticword("ambernath","abhijit");
		//sw1.getData();
		//sw.getData();
	Staticword.getData();
	Staticword.getData();
	System.out.println(Staticword.lastname= "Thakur");
	System.out.println(sw.city = "hydrabad");
	
		
	}

}
