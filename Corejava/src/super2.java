
public class super2 extends super1{

	String name = "kiran";
	
	public super2() {
		super();
		System.out.println("i am child constructor");
	}
	
	public void getdata() {
		
		super.getData();
		System.out.println(super.name);
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		super2 s2 = new super2();
		s2.getdata();
		
	}

}