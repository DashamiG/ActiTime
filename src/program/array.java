package program;
import java.util.*;
import java.util.Collections;


public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the position \n enter the color name");
		int a=sc.nextInt();
		String b=sc.next();
		
		ArrayList<String> alst=new ArrayList<String>();
		alst.add("red");
		alst.add("black");
		alst.add("blue");
		alst.add("purple");
		alst.add(a,b);
		Iterator i=alst.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ArrayList<String> lst=new ArrayList<String>();
		alst.addAll(lst);
		
		Collections.swap(alst,0,2);
		System.out.println(alst);
		
		
		
		
		
		
		
	}

}
