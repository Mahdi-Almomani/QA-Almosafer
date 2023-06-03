import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import net.bytebuddy.asm.Advice.Enter;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Almosafer1 extends Parameters {

	@BeforeTest
	public void BeforeTestMosafer() {
		driver.get(theWebSite);
		driver.manage().window().maximize();
	}

//	@Test(description = "test 1")
//	public void TestALanguage() {
//		String theActualLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//				.getText();
//		MyAssert.assertEquals(theActualLanguage, ExpectedLanguageArabic);
//
//	}
//
//	@Test(description = "test 2")
//	public void TestBCurrency() {
//		String theActualCurrency = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div/div/button")).getText();
//		MyAssert.assertEquals(theActualCurrency, ExpectedCurrency);
//
//	}
//
//	@Test(description = "test 3")
//	public void TestCContact() {
//		String TheActualContact = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
//		MyAssert.assertEquals(TheActualContact, ExpectedContact);
//
//	}
//
////	@Test
////	public void QitafLogoTest() {
////
////		//WebElement TheQitafLogo = driver
////			//	.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]/svg"));
////		WebElement MyFooter = driver.findElement(By.className("sc-dEfkYy"));
////		List<WebElement> TheSVGImages = MyFooter.findElements(By.tagName("svg"));
////		for(int i=0;i<TheSVGImages.size();i++) {
////		
////			String dataTestId=TheSVGImages.get(i).getAttribute("data-testid");  
////					
////			if(dataTestId.equals("Footer__QitafLogo")) {
////				System.out.println(dataTestId);
////				
////			}
////			
////		}
////
////	}
//	@Test(description = "test 4")
//	public void TestDQitafLogo2() {
//		WebElement MyFooter = driver.findElement(By.tagName("footer"));
//		List<WebElement> listOfLogos = MyFooter.findElements(By.tagName("svg"));
//		for (int i = 0; i < listOfLogos.size(); i++) {
//			String checkAttr = listOfLogos.get(i).getAttribute("data-testid");
//
//			if (checkAttr == (null)) {
//				continue;
//			} else if (listOfLogos.get(i).getAttribute("data-testid").equals("Footer__QitafLogo")) {
//				ActualValueForQitafLogo = true;
//				System.out.println(checkAttr);
//			}
//		}
//		MyAssert.assertEquals(ActualValueForQitafLogo, true);
//	}
//
//	@Test(description = "test 5")
//	public void TestEHotelTapFalse() {
//		WebElement HotelTap = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String ActualValueAttribute = HotelTap.getAttribute("aria-selected");
//		MyAssert.assertEquals(ActualValueAttribute, ExpectedAttributeValue);
//
//	}
//
//	@SuppressWarnings("deprecation")
//	@Test(description = "test 6")
//	public void TestFDatePlusOne() {
//
//		int PlusOneDay = 1;
//		Calendar cal = Calendar.getInstance();
//		int ExpectedTime = cal.get(Calendar.DAY_OF_MONTH);
//
//		String TheDayOnWebSite = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]"))
//				.getText();
//
//		int ActualTime = Integer.parseInt(TheDayOnWebSite);
//		MyAssert.assertEquals(ActualTime, ExpectedTime + PlusOneDay);
//
//	}
//
//	@SuppressWarnings("deprecation")
//	@Test(description = "test 7")
//	public void TestGDatePlusTwo() {
//
//		int PlusOneDay = 2;
//		Calendar cal = Calendar.getInstance();
//		int ExpectedTime = cal.get(Calendar.DAY_OF_MONTH);
//
//		String TheDayOnWebSite = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"))
//				.getText();
//
//		int ActualTime = Integer.parseInt(TheDayOnWebSite);
//		MyAssert.assertEquals(ActualTime, ExpectedTime + PlusOneDay);
//
//	}
//
//	@Test(description = "test 8")
//	public void TestHRandomLanguage() {
//
//		String[] GetWebSiteLanguageURL = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//		int index = rand.nextInt(0, 2);
//		driver.get(GetWebSiteLanguageURL[index]);
//
//		if (driver.getCurrentUrl().contains("en")) {
//			String Actuallang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//					.getText();
//			MyAssert.assertEquals(Actuallang, ExpectedLanguageArabic);
//		}
//		else {
//			String Actuallang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//					.getText();
//			MyAssert.assertEquals(Actuallang, ExpectedLanguageEnglish);
//		}
//	}
	@Test(description = "test 9")
	public void TestIHotelSearch() throws InterruptedException {
		// used to wait before gives error if there was one
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String[] GetWebSitLanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };

		String[] EnglishValues = { "Dubai", "Jeddah", "Riyadh" };
		int IndexEN = rand.nextInt(0, 3);
		String[] ArabicValues = { "دبي", "جدة" };
		int IndexAR = rand.nextInt(0, 2);
		int Index = rand.nextInt(0, 2);

		driver.get(GetWebSitLanguage[Index]);

		if (driver.getCurrentUrl().contains("en")) {
			WebElement HotelEn = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			HotelEn.click();
			Thread.sleep(1000);
			WebElement EnterEnglishValues = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			EnterEnglishValues.sendKeys(EnglishValues[IndexEN] + Keys.ARROW_DOWN);
			WebElement SearchButton = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			SearchButton.click();

		} else {
			WebElement HotelAr = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			HotelAr.click();
			Thread.sleep(1000);
			WebElement EnterArabicValues = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			EnterArabicValues.sendKeys(ArabicValues[IndexAR] + Keys.ARROW_DOWN);
			WebElement SearchButton = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			SearchButton.click();
		}

	}

	@Test(description = "test 10")
	public void TestJSelectOptinsRandomly() {
		WebElement options = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));
		Select MySelector = new Select(options);
		int SelectIndex=rand.nextInt(0, 2);
		MySelector.selectByIndex(SelectIndex);
		
		
	}
	@Test (description = "test 11")
	public void TestKSearchButton() {
		WebElement SearchButton=driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[4]/button"));
	SearchButton.click();
	}
	
	@Test (description = "test 12")
	public void TestLSearchResault() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchResaults=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span"));
		String SerachResaultsTest=SearchResaults.getText();
		
		boolean ActualResaultEN=SerachResaultsTest.contains("found")||SerachResaultsTest.contains("وجدنا");
		
//		boolean ActualResaultAR=SerachResaultsTest.contains("وجدنا");
//		if(driver.getCurrentUrl().contains("en")) {
//			MyAssert.assertEquals(ActualResaultEN, true);
//		}
//		else {
//			MyAssert.assertEquals(ActualResaultAR, true);
//		}
		// another solution use the OR to get one true of the search 
		MyAssert.assertEquals(ActualResaultEN, true);
		
		
	}
	@Test (description = "test 13")
	public void TestMLowestPrice() {
		WebElement LowestPriceButton=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]"));
		
		LowestPriceButton.click();
		WebElement RightSide=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[2]/div[1]"));
		List<WebElement> Prices=RightSide.findElements(By.className("Price__Value"));
		String TheFirstPrice=Prices.get(0).getText();
		String TheLastPrice=Prices.get(Prices.size()-1).getText();
		int FirstPriceResalut=Integer.parseInt(TheFirstPrice);
		int LastPriceResalut=Integer.parseInt(TheLastPrice);
		MyAssert.assertEquals(LastPriceResalut>FirstPriceResalut, true);
	}
	

	@AfterTest
	public void AfterTestMosafer() {

	}

}
