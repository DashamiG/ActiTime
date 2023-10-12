package program;
import java.util.*;
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tst=new TreeSet<String>();
		tst.add("xyz");
		Iterator i=tst.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		TreeSet<Integer> tst2=new TreeSet<Integer>();
		tst2.add(1);
		tst2.add(2);
		tst2.add(5);
		tst2.add(7);
		System.out.println(tst2);
		TreeSet<Integer> tst3=new TreeSet<Integer>();
		ArrayList a=new ArrayList();
		for(int c:tst2)
		{
			if(c<6)
			{
				tst3.add(c);
				
			}
			
		}
		System.out.println(tst3);
		tst3.remove(5);
		System.out.println(tst3);

	}

}
