package QA_Test_Pages;

import Configurations.BaseClass;
import Utilities.Verify_the_BrokenLinks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class TC01_Verify_HomePage extends BaseClass {
    @Given("a website to test")
    public void aWebsiteToTest() {
        init_dr();
    }

    @Then("Verify the page title {string}")
    public void verifyThePageTitle(String Page_title) {
       String title= Page_title();
       if(!(title.equals(Page_title))){
           System.out.println("Page title for:"+ dr.getCurrentUrl()+"do not match:"+title);
       } else {
           System.out.println("Page title matches");
       }
    }
    @And("Verify for the categories")
    public void verifyForTheCategories() {
        List<WebElement> category=dr.findElements(By.className("card mt-4 top-card"));
        System.out.println(category.size());
        dr.quit();
    }
}
