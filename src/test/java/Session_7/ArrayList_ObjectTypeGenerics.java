package Session_7;

import java.util.ArrayList;

public class ArrayList_ObjectTypeGenerics {
	 
	public static void main (String[] args) {
		
	ArrayList<Object> ar = new ArrayList<Object>();
	ar.add(100);
	ar.add(200);	
	ar.add("test");
	ar.add(true);
	ar.add(12.33);
	ar.add('!');
	
	for (int i = 0; i<ar.size(); i++)
	{
		System.out.println(ar.get(i));
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	//data types (can store only one variable and one value at a time)
	//Array (advanced version- we learned array which can store multiple data but of a similar data type and restricted capacity)
	//Array Object type - which can stored with restricted capacity but all the data type
	//ArrayList - in this we had overcome all the challenges in array it can dynamically grow and shrinkn down as well
	//ArrayList generic type
	//arraylist object generic type (here we use triangular bracket
	
}
