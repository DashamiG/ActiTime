package program;
import java.util.*;

public class map {
	static void display(int i,boolean b)
	{
		if(b==true)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
				
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Integer,String> hmp=new HashMap<Integer,String>();
		hmp.put(1,"a");
		hmp.put(2, "b");
		hmp.put(3,"c");
		hmp.put(4,"d");
		System.out.println("enter the key:");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		boolean b= hmp.containsKey(i);
		display(i,b);
		if(b==false)
		{
			System.out.println("enter the employee name");
			String name=s.next();
			hmp.put(i, name);
		}
		System.out.println(hmp);
		
		
			
		
		
		
	
}
}