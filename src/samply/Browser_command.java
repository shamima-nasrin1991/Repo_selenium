package samply;
/*This test case for find title,current Url,Actual page source and figure out they length
  */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_command {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p3//DRIVER//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com");
		System.out.println("Broweser open successfully");
		String pagetitle =driver.getTitle();
		int page_length=pagetitle.length();
		System.out.println("The current page title is:"+pagetitle);
		System.out.println("The current page title length is:"+page_length);
		String web_url=driver.getCurrentUrl();
		int url_length=web_url.length();
		System.out.println("Actural url is:"+web_url+"\n"+"Actural url length is:"+url_length);
		String page=driver.getPageSource();
		int pagesource_len=page.length();
		System.out.println("The pagesource is:"+page+"\n"+"the total page source length is:"+pagesource_len);
		driver.close();
	}

}
