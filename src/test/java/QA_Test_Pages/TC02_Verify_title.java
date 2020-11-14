package QA_Test_Pages;

import Configurations.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC02_Verify_title extends BaseClass {
    @Given("a page")
    public void aPage() {
        init_dr();
        dr.navigate().to("https://demoqa.com/alertsWindows");
    }

    @Then("check the page title")
    public void checkThePageTitle() {
        String str=Page_title();
        if(str.equalsIgnoreCase("ToolsQA")){
            System.out.println("PASS");
        }
    }
}
