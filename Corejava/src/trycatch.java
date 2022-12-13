
public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 7;
		try {
//			int k = (j/i);
//			System.out.println(k);
			
			int a[] = {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArithmeticException e){
			System.out.println("Arthmetic error");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException error");
		}
		catch(Exception e){
			System.out.println("exception error");
		}
		finally {
			System.out.println("cockies deleted");
		}
		
//interview questions -: this will execute even if catch block is not there''
		
//finally will be used for delete cockies close the browser ans etc.
		
//finally will not execute in case of jvm i stopped when running the test.
		
		
	}

}
