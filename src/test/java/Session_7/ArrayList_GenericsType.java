package Session_7;

import java.util.ArrayList;

public class ArrayList_GenericsType {

	public static void main(String[] args) {
	
		ArrayList<String> UserNames	= new ArrayList<String>();
		UserNames.add("Tom");
		UserNames.add("Peter");
		UserNames.add("Mark");
		//UserNames.add(445);
	for(int i = 0; i<UserNames.size(); i++)
	{
		System.out.println(UserNames.get(i));
	}
	
		System.out.println("----------------------");
	
		ArrayList<Integer> numberList = new ArrayList<Integer>();// int permeative data type, Integer = is a class
		System.out.println(numberList.size());
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);	
		numberList.add(40);
		numberList.add(50);
		System.out.println(numberList.size());
	
		System.out.println("----------------------");
		for(int i = 0; i<numberList.size(); i++)
		{
			System.out.println(numberList.get(i));
		}
		 
		System.out.println("----------------------");
		
		boolean isavailable	= numberList.contains(66);
		System.out.println(isavailable);
		System.out.println(numberList.contains(20));
		numberList.clear();
		//System.out.println(numberList.size());
		System.out.println(numberList.isEmpty());
		
		
		
		
		
		
	
	
	}
	
}
