import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	WebDriver driver = new EdgeDriver();
	String theWebSite = "https://www.almosafer.com/en";
	String ExpectedLanguageArabic = "العربية";
	String ExpectedLanguageEnglish = "English";
	String ExpectedCurrency = "SAR";
	String ExpectedContact = "+966554400000";
	boolean ActualValueForQitafLogo;
	String ExpectedAttributeValue = "false";
	Assertion MyAssert = new Assertion();
	Random rand = new Random();
}
