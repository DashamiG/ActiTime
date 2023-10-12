package program;
import java.util.*;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hmp=new HashMap<Character,Integer>();
		String s="bangalore";
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		
		if(hmp.containsKey(c))
		{
			hmp.put(c, hmp.get(c)+1);
		}
		else
		{
			hmp.put(c,1);
		}
	}
		System.out.println(hmp);
	}
}

