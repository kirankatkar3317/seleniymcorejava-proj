
public class Constructorexample {

	
	public Constructorexample() {
		
		System.out.println("im the constructor");
	}
	
	
	public Constructorexample(int a) {
		
		System.out.println("im the constructor"+a+"");
	}
	
	public void getData() {
		System.out.println("kk");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample se = new Constructorexample();
		Constructorexample se1 = new Constructorexample(0);
	//	se.getData();
		

	}

}
