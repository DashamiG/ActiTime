package program;
import java.util.*;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int n=sc.nextInt();
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		System.out.println(hs);
		int a=hs.size();
		System.out.println(a);
		int even=0;
		int odd=0;
		if(a%2==0)
		{
			System.out.println("even");
			
			
		}
		else
		{
			System.out.println("odd");
			
		}
		System.out.println("enter the input");
		int b=sc.nextInt();
		hs.add(b);
		System.out.println(hs);
		HashSet hs1=new HashSet();
		hs.addAll(hs1);
		hs1.add(b);
		hs1.add(9);
		
		System.out.println(hs.containsAll(hs1));
		while(hs1==hs)
		{
			System.out.println("true");
		}
		System.out.println(hs1);
		
		
		
		
		
		
		
		

	}

}
