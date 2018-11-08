package Steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {
    WebDriver driver;

    @Given("^I navigate to Customer Login page$")
    public void iNavigateToCustomerLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http:uk-qa-test.vaimo.com");
        driver.manage().window().maximize();
    }

    @And("^I Click on Sign in Link$")
    public void iClickOnSignInLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.linkText("Sign In")).click();
    }


    @And("^I enter the username as \"([^\"]*)\"  and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);

    }


    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterusernameAndpassword(String username, String password) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("username is" + username);
        System.out.println("password is" + password);

    }



    @And("^I Click on Sign in button$")
    public void iClickOnSigninButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();

    }

    @Then("^I should see Luma Homepage$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("I should see the Luma Homepage with Welcome Gboyega");
    }


    @And("^I click on Sign Out$")
    public void iClickOnSignOut() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        driver.findElement(By.cssSelector("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[4]/a")).click();


    }

}











