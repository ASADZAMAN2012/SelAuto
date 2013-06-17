import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestDemoTest 
{
	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void before()
	{
		driver.get("http://bellmore.nixon.i.patch.com");
	}
	
	@Test
	public void test1()
	{
		
	}
	
	@After
	public void close()
	{
		driver.close();
	}

}
