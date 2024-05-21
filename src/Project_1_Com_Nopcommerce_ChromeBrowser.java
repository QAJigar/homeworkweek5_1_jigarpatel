import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url. “https://demo.nopcommerce.com/login?returnUrl=%2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
public class Project_1_Com_Nopcommerce_ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        //launch Chrome browser.
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //maximise browser window
        driver.manage().window().maximize();
        //title of the page
        System.out.println("The title of the page: " + driver.getTitle());
        //currant page Url
        System.out.println("The current page: " + driver.getCurrentUrl());
        //get page source
        System.out.println("The page source: " + driver.getPageSource());
        //navigate to Url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        System.out.println("Get Current URL: " + driver.getCurrentUrl());
        //navigate back to home page
        driver.navigate().back();
        System.out.println("Get Current URL: " + driver.getCurrentUrl());
        //Navigate to the login page
        driver.navigate().to(loginUrl);
        System.out.println("Get Current URL: " + driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
//        WebElement loginLink = driver.findElement(By.linkText("Log in"));
//        loginLink.click();
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("prime123");
        //Click on Login Button
       driver.findElement(By.className("login-button")).click();
        //Close the browser
        driver.quit();

    }
}
