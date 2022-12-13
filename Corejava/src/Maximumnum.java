import java.util.ArrayList;

public class Maximumnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 5, 4, 3, 3, 5, 6, 7 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
			}
			
			for(int j = i+1; j< a.length;j++) {
				if(a[i]==a[j]) {
					k++;
				}
			}
System.out.print(a[i]);
System.out.println(k);
		}

	}
}
