package ThreadsAndCollection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
         set.add("nandhu");
         set.add("sudha");
         set.add("abinaya");
         set.add("jeevi");
         Iterator<String> i=set.iterator();
         while(i.hasNext()){
        	 System.out.println(i.next());
         }
	}

}
