
public class Functionoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functionoverload fo = new Functionoverload();
		fo.geData();
		fo.getData(2, 3);
		
	}
	
	public void geData() {
		System.out.println("kk");
	}
	
	public void getData(int i, int j) {
		System.out.println("the first no. is " + i + " second no. is " + j + "");
	}
	

}
