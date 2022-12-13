
public class super1 {
	int i = 10;
	 String name = "java";
public super1() {
	System.out.println("i am parent constructor");
}
	
	public void getData() {
		System.out.println("i am parent method");
	}
	
	public void inte() {
		int i =2;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super1 s1 = new super1();
		s1.inte();
	}

}
