package BasicQuestions;

public class WithoutSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			   @Test

			   public void selectByList() {

			         WebDriver driver = new ChromeDriver();

			         driver.get("https://www.bstackdemo.com/");

			      driver.findElement(By.xpath("//select")).click();

			         List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));

			         String option = "Highest to lowest";

			         // Iterate the list using for loop

			         for (int i = 0; i < allOptions.size(); i++) {

			               if (allOptions.get(i).getText().contains(option)) {

			                     allOptions.get(i).click();

			                     System.out.println("clicked");

			                     break;

			               }

			         }

			   }

			}

			@AfterTest

			public void tearDown(){

			driver.quit();

			} 
	}

}
