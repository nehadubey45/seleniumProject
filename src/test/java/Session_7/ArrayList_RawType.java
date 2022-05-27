package Session_7;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_RawType {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		int arrayListSize = ar.size();
		System.out.println(arrayListSize);
		System.out.println(ar.size());
		
		System.out.println("-----------------------------");
		
		//so how to add anything just like as an array into array list
		ar.add(100); // 0
		ar.add(200); //1
		ar.add(300); //2
		ar.add("test");//3
		ar.add('d');//4
		
		System.out.println(ar.size());
		
		ar.add('$');//5
		ar.add(400);//6
		System.out.println(ar.size());
		System.out.println("-----------------------------");
		
		for(int i=0; i<=ar.size()-1; i++)
			//for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("-----------------------------");
		System.out.println(ar.get(4)); 
		//System.out.println(ar.get(7));// arrayOutOfBound Exception
		
		ar.remove(3);
		System.out.println(ar.size());
		System.out.println("-----------------------------");
		for(int j = 0; j<=ar.size()-1; j++)
		{
			System.out.println(ar.get(j));
		}
		System.out.println("-----------------------------");
		//100 200 300 d $ 400
		for(int i = 0; i<ar.size();i++)
		{
			if(ar.get(i).equals('$'))
			{
				System.out.println("yes i got the \"$\" sign in the arrayList at index position " + i);
			}
			
		}
		
		
		
		
		
		
	}
	
	
	

}
