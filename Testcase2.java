package ab49test;
import org.testng.annotations.Test;

import ab49source.AmazonHomepage;
import ab49source.AmazonLogin;
import ab49source.AmazonProductpage1;
import ab49source.Amazonaddtocartpage;
import ab49source.Seachresultpage;





public class Testcase2 extends LaunchQuit
{
 @Test
 public void login_search_wishlist_cart_logout()
 {
	 
	 AmazonHomepage homepage = new AmazonHomepage(driver);
	 homepage.hoveroveraccountsandlist(driver);
	 homepage.signin_click();
	 
	 
	 
	 AmazonLogin login = new AmazonLogin(driver);
	 login.Userfield();
	 login.Continuebutton();
	 login.Passwordfield();
	 login.Signinbutton();
	 homepage.Search();
	 
	 Seachresultpage Search = new Seachresultpage(driver);
	 Search.ClickProduct(driver);
	 
	 AmazonProductpage1 productpage = new AmazonProductpage1(driver);
	 productpage.addtowishlist();
	 productpage.ViewyourList();
	 productpage.Addtocart();
	 productpage.ViewCart();
	 
	 Amazonaddtocartpage addtocartpage = new Amazonaddtocartpage(driver);
	addtocartpage.Removefromcart();
			 
	 homepage.hoveroveraccountsandlist(driver);
	 homepage.Signout();	 
			 
			 
	 
 }
}
