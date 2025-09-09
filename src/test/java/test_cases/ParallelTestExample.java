package test_cases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ParallelTestExample {
	
	
	
	@Test
	public void Test1() throws MalformedURLException {
	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
	    driver.get("https://www.google.co.in/");
	    try {
	        Thread.sleep(10000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Performing Google search...");
	    driver.quit();
	}

	@Test
	public void Test2() throws MalformedURLException {
	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new EdgeOptions());
	    driver.get("https://www.bing.com/");
	    try {
	        Thread.sleep(10000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Performing Bing search...");
	    driver.quit();
	}

	@Test
	public void Test3() throws MalformedURLException {
	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
	    driver.get("https://www.amazon.in/");
	    try {
	        Thread.sleep(10000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Performing Amazon search...");
	    driver.quit();
	}
	
	@Test
	public void Test4() throws MalformedURLException {
	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
	    driver.get("https://www.facebook.com/");
	    try {
	        Thread.sleep(10000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Performing Facebook...");
	    driver.quit();
	}

}