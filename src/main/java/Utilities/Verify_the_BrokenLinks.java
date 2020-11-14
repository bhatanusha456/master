package Utilities;

import Configurations.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class Verify_the_BrokenLinks extends BaseClass {
        public void validate_broken_links()  {
            List<WebElement> links=dr.findElements(By.tagName("a"));
            System.out.println(links.size());
            for(WebElement li:links){
                String url=li.getText();
                try {
                    Http_Connection(url);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(!(ResponseCode==200) || !(ResponseCode==400)){
                    System.out.println(url);
                }
            }
        }
}
