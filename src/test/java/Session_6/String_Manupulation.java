package Session_6;

public class String_Manupulation {
	public static void main(String[] args) {
		
//		String str1 = "Hello everyone lets learn something about String";		
//		str1.length();// you can write this way or as per below output will be same
//		int lengthOfStr1 = str1.length();
//		System.out.println("length of String is - "+ (lengthOfStr1+10));		
//		System.out.println(str1.length());
		
//		String str2 = "I am learning String in Java";	
//		System.out.println("Char at 2nd index position is - " + str2.charAt(2));
//		System.out.println(str2.length());
//		System.out.println("Char at 48th index position is - " + str2.charAt(28));
		
//		String str3 = "I am learning String in Java e abkjcnskjvnsl";
//		System.out.println(str3.length());
//		System.out.println("Index number of char 'e' in str3 is - " + str3.indexOf('e'));
//		System.out.println("Index number of char 'e' 2nd occurance is - " + str3.indexOf('e', 7));
//		System.out.println("Index number of char 'e' 2nd occurance is - " + str3.indexOf('e', str3.indexOf('e')+1));
		
//		String str4 = "GitHub is aquired by microsoft in year 2018";
//		System.out.println("Index number for word Year in String str4 is - " + str4.indexOf("year"));
//		System.out.println("Index number for word apple in String str4 is - " + str4.indexOf("apple"));
		
//		String str5 = "Selenium is used to automate web applications";
//		System.out.println(str5.toUpperCase());
		
//		String str6 = "SELENIUM CANNOT AUTOMATE DEXTop appliCATION";
//		System.out.println(str6.toLowerCase());
		
//		String str7 = "              Selenium is a free automation tool         ";
//		System.out.println(str7.trim());	
//		System.out.println("----------------------");	
//		System.out.println("After removing white spaces from String \"str7\" output is : " + str7.trim());
//		System.out.println("----------------------");
//		System.out.println("After removing white spaces from \n String \"str7\" output is : " + str7.trim());
	//	"After removing white spaces from 
	//	String \"str7\" output is :Selenium is a free automation tool
		
		
//		String str8 = "15/11/2021"; // 15:11:2021 // 15#11#2021
//		System.out.println(str8.replace('/', ':'));
//		System.out.println(str8.replace('/', '#'));
//		String temp = "Hello there I am looking forward for your reply";
//		System.out.println(temp.replace("Hello", "Hi"));
		
//		String str9 = "Selenium can handle html code";
//		System.out.println("is the word is available in the String str9 : " + str9.contains("Selenium")); // true
//		System.out.println("is the word is available in the String str9 : " + str9.contains("selenium"));// false
//		boolean isStringAvailable = str9.contains("html");
//		System.out.println(isStringAvailable);
		
//		String str10 = "The transation number is - 78E35dl";
//		System.out.println("The transation number is : " + str10.substring(27) );
//		
//		String str11 = "Your transation number is 78E35dl thank you";
//		System.out.println("Your transation number is : " + str11.substring(26, 33));
		
//		String statement1 = "Java is platform independent";
//		String statement2 = "java is platform independent";
//		String statement3 = "Java is platform independent";
//		//boolean check = statement1.equals(statement2);
//		//System.out.println(check);
//		System.out.println(statement1.equals(statement2));
//		System.out.println(statement1.equals(statement3));
//		System.out.println(statement1.equalsIgnoreCase(statement2));
		
//		
//		String str13 = "Java is based on objected Programming Principles";
//		//Java
//		//is
//		//based
//		String[] words = str13.split(" ");
//	for(int i = 0; i<words.length; i++)
//		{
//			System.out.println(words[i]);
//		}
//		
//		System.out.println("-----------------");
		
//		String str14 = "Good Bye";
//		String[] revWords = str14.split(" ");
//		System.out.println(revWords[1] +" " + revWords[0]);
		
		String str15 = "Java is based on objected Programming Principles";
		String[] revWords = str15.split(" ");
		for(int i = revWords.length-1; i>=0;i--)// for loop reverse order
	//	for (int i = 0; i<=revWords.length-1; i++)		
		{
			System.out.println(revWords[i]);
		}
	
	
		
		
		String str16 = "Java is based on objected Programming Principles";
		int i =0; // start point
		while(i<=revWords.length-1)
		{
			System.out.println(revWords[i]);
			
			if (i ==1) 
			{
				System.out.println(str16.equals("programming"));
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
