import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<String> a = new ArrayList<String>();
//a.add("kk");
//a.add(0,"md");
//a.add("jk");
//a.add("katkar");
//a.add(null);
//
//a.remove(3);
//System.out.println(a);
//System.out.println(a.get(0));
//System.out.println(a.contains(a.get(1)));
//System.out.println(a.contains("kk"));
//System.out.println(a.isEmpty());
//System.out.println(a.size());
//		
	//	(In order menas)order of arraylist is synchronised and allows duplicate values
//accepts null values

//-------------------------------------------------------
//-------------------------------------------------------		
		
//HashSet<String> hs = new HashSet<String>();	
//
//hs.add("kiran");
//hs.add("katkar");
//hs.add("anant");
//hs.add(null);
//System.out.println(hs);
//System.out.println(hs.remove("katkar"));
//System.out.println(hs.size());
//System.out.println(hs.isEmpty());
//System.out.println(hs.contains("kiran"));
//
//Iterator<String> it = hs.iterator();
//System.out.println(it.next());
//System.out.println(it.next());
	//you willl not expect any order here and not allows duplicate values
	//accept null values

//-------------------------------------------------------
//-------------------------------------------------------		
	
//HashMap<Integer,String> hm = new HashMap<Integer,String>();
//hm.put(0, "kiran");
//hm.put(1, "katkar");
//hm.put(2, "anant");
//hm.put(3,"jk");
//System.out.println(hm);
//System.out.println(hm.get(1));
//Set ith =hm.entrySet();
//Iterator it = ith.iterator();
//while(it.hasNext()) {
//	
//	
//Map.Entry mp=(Map.Entry)it.next();
//System.out.print(mp.getKey());
//System.out.println(mp.getValue());
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(0, "kiran");
		hm.put(1, "katkar");
		hm.put(2, "anant");
		hm.put(3,"jk");
		System.out.println(hm);
		System.out.println(hm.get(1));
//        Set itm = hm.entrySet();
//        Iterator it = itm.iterator();
//        
//        
//        System.out.println(it.next());
}


	
	}

