package Session_5;

public class Arrays_In_Java {
	
	public static void main(String[] args)
	{
		
//		int a=10;
//		int i=20; // 30 40 50
//		int j=30;
//		int k=40;
//		int l=50;
//		System.out.println(a + " "+ i + " "+ j + " "+ k + " "+ l + " ");
		
//		int[] a = new int[6];
//		int x[] = new int[5];
//		int []y = new int[4];
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		a[5]=60;
//		
//		System.out.println(a[0] + a[5]);
//		System.out.println("Array a is having capacity as - " + a.length);
//		
//		for(int i=0; i<=5; i++)
//		{
//			System.out.println(a[i]);
//			if (a[i]== 40)
//			{
//				System.out.println("Hey there i got number 40");
//				break;
//			}
//			
//		}
		
	String[] browser = new String[4];
		
		browser[0]="chrome";
		browser[1]="opera";
		browser[2]="firefox";
		browser[3]="ie";
		
		for(int row=0; row<=browser.length-1; row++)
		{
			System.out.println(browser[row]);
			
			if(browser[row].equals("safari"))
			{
				System.out.println("chrome browser got invoked");
			}
			else
			{
				System.out.println("Please enter a valid browser name for windows OS");
				break;
			}
	}
			
// String- Name, int- Age,float- salary,boolean- Resident of india, char- gender, boolean- having a machine		
			Object emp[] = new Object[6];
			
			emp[0]= "Tom";
			emp[1]= 25;
			emp[2]= 499.59;
			emp[3]= false;
			emp[4]= 'm';
			emp[5]= true;
			
			for(int j=0; j<emp.length;j++)
			{
				System.out.println("---------------------");
				System.out.println(emp[j]);
			//	System.out.println("---------------------");
			}
			
		
			
//		int[] b= new int [3];
//		System.out.println(b[0] + " " + b[1] + " " + b[2]);
	
//		int[] a = {10,20,30};
//		System.out.println(a[0] + " " + a[1] + " " + a[2]);
//		System.out.println(a[5]);
		
		
		
		
		
		
	}	
		
		}
	
	

