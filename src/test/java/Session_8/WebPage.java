package Session_8;

public class WebPage {

	//Data members of class
	//Variable
	
	String title = "Welcome to BestGoods";
	String url = "https//www.bestgoods.com";
	String header = "bestgoods.com : Online shopping - Mobiles, laptops books etc";
	String logoImage =  "https//www.bestgoods.com/images/logo";
	
	//Methods
	
	//Non static methods
	public void topPannel()
	{
		//logic
		System.out.println("----------top pannel start------------");
		System.out.println(url);
		System.out.println("This is top pannel of the webpage");
		System.out.println(logoImage);
		System.out.println("------top pannel end----------");
		
	}
	public void footerlinks()
	{
		//logic
		System.out.println("----------footerlinks start------------");
		System.out.println("footer link 1");
		System.out.println("footer link 2");
		System.out.println("footer link 3");
		System.out.println("footer link 4");
		System.out.println("------footerlinks end----------");
		
	}
	public void centrePannel()
	{
		//logic
				System.out.println("----------centrePannel start------------");
				System.out.println("Mobiles");
				System.out.println("Laptops");
				System.out.println("Camera");
				System.out.println("Books");
				System.out.println("------centrePannel end----------");
				
	}
	
	//Static Methods
	public static void privacyPolicy()
	{
		//logic
		System.out.println("----------privacyPolicy start------------");
		System.out.println("About Business of BestGood");
		System.out.println("BestGoods Vendors");
		System.out.println("Privacy Notice");
		System.out.println("------privacyPolicy end----------");
	}
	
	public static void main(String[] args) {
		
	WebPage objRef	= new WebPage();
	objRef.topPannel();
	objRef.centrePannel();
	objRef.footerlinks();
	System.out.println("This is the URL for the aplication" + objRef.url);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
