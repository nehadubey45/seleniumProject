package Session_8;

public class ExecuteWebPage {
	
	public static void main(String[] args) {
		
		WebPage xc	= new WebPage();
		xc.topPannel();
		xc.footerlinks();
		System.out.println("Logo if the WebPage is " + xc.logoImage);
		
		WebPage.privacyPolicy();
		
	}

}
