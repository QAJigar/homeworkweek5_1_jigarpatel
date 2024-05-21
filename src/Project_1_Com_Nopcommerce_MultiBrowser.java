import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_1_Com_Nopcommerce_MultiBrowser {
    /**
     * Project-1 - ProjectName : com-nopcommerce
     * BaseUrl = https://demo.nopcommerce.com/
     * 1. Setup multi browser.
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
    static String baseUrl = "https://demo.nopcommerce.com/";
    static String browser = "Edge";
    static WebDriver driver;
    public static void main(String[] args) {
        //Use for loop nested if
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //Print the page Title, CurrentUrl and PageSource
        System.out.println("Title of the page: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());
        //Navigate to Url
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        //Print the Current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Back to the page
        driver.navigate().back();
        //Forward to the page
        driver.navigate().forward();
        //print the current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
        // Navigate to the login page
        driver.findElement(By.linkText("Log in"));
        //field the email
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");
        //field the password
        driver.findElement(By.id("Password")).sendKeys("prime123");
        //click on login button
        driver.findElement(By.className("login-button")).click();
        //Close the programme
        driver.quit();

    }
}
