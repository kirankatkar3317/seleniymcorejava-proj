
public class Arrays {

	public static void main(String[] args) {

//		int a[] = new int[5];
//		a[0] = 1;
//		a[1]= 2;
//		a[2] = 3;
//		a[3]= 4;
//		a[4]= ;
//		
//		for(int i = 0 ; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		int a[] = {1,2,3,4,5};
//		
//		for(int i = 0 ; i<a.length; i++) {
//	  	System.println(a[i]);        
//      }  
		
//		
//		int a[][] = new int[4][3];
//		
//		a[0][0] = 2;
//		a[0][1] = 4;
//		a[0][2] = 6;
//		a[1][0] = 17;
//		a[1][1] = 8;
//		a[1][2] = 2;
//		a[2][0] = 0;
//		a[2][1] = 1;
//		a[2][2] = 7;
//		
		
	//	System.out.println(a[2][2]);
//		
//		int b[][] = {{2,4,6},{17,8,2},{4,1,7}};
//	int min = b[0][0];	
//		//System.out.println(b[2][2]);
//		
//		for(int i = 0;i<3 ; i++) 
//		{
//			for(int j=0;j<3;j++) {
//				System.out.print(b[i][j]);
//				System.out.print("\t");
//			}
//			System.out.println(" ");
//		}
//			
		int b[][] = {{2,4,6},{17,8,2},{4,1,7}};
		int min = b[0][0];	
			
			for(int i = 0;i<3 ; i++) 
			{
				for(int j=0;j<3;j++) {
					if(b[i][j] < min) {
						min = b[i][j];
						
					}
				}
			}
			
			System.out.println(min);
		}                                 

}
