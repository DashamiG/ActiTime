package program;
import java.util.*;


public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the position and element");
		int a=sc.nextInt();
		String b=sc.next();
		LinkedList lst=new LinkedList();
		lst.add("w");
		lst.add("x");
		lst.add("y");
		lst.add("z");
		lst.add(a,b);
		System.out.println(lst);
		System.out.println(lst.getFirst());
		System.out.println(lst.getLast());
		Collections.shuffle(lst);
		System.out.println(lst);
		LinkedList lst1=new LinkedList();
		lst.addAll(lst1);
		
		System.out.println(lst.containsAll(lst1));
		Collections.reverse(lst);
		System.out.println(lst);
	
		
		
		
		
		
		

	}

}
