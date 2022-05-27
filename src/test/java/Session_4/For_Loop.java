package Session_4;

public class For_Loop {
	 public static void main(String[] args)
	 {
		//1 to 10
		//for (start point; condition; Increment/decrement)
		 for (int i = 1; i<=10; i++)
		 {
			    System.out.println(i);
		 }
		 System.out.println("---------------------");
		 
		//0 to 20 even number only
//		 for (int even = 1; even<=20; even = even+2)
//		 {
//			System.out.println(even); 
//		 }
		 //so this is not the proper way of handling the things of even /odd numbers programs by doing something like above
		 
		 System.out.println("---------------------");
		 
		//0 to 20 odd no (with mathematical condition)
//		 for (int j = 1; j<=20; j++)
//		 {
//			 if(j % 2 == 0)
//				 System.out.println(j);
//		 }
		 System.out.println("---------------------");
		 
		 //2 to 30 odd no (with mathematical condition)(tried by me)
//		 for (int p = 2; p<=30; p++)
//		 {
//			 if (p % 2 != 0)
//				 System.out.println(p);
//		 }
		 System.out.println("---------------------"); 
		 
		 //for loop reverse order
		 
		 for (int m = 10; m>=1; m--)
		 {
			 System.out.println(m);
			 
			 if (m == 4)
			 {
				 System.out.println("hey this is four");
				 break;
			 }
			 System.out.println("---------------------");
	
		 }
		 
		 
	 }
	
	

}
