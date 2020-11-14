package Configurations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BaseClass extends Timeouts{
    public WebDriver dr;
    HttpURLConnection conn;
    public int ResponseCode;
    String title;
    ReadProperty read=new ReadProperty();
        protected void init_dr() {
            if(read.BROWSER.equals("Chrome")) {
                WebDriverManager.chromedriver().setup();
             dr=new ChromeDriver();
            }
            dr.get(read.URL);
            dr.manage().window().maximize();
            implicit_wait(dr);
        }

       public void Http_Connection(String url) throws IOException {
             conn= (HttpURLConnection)(new URL(url).openConnection());
             conn.connect();
             ResponseCode=conn.getResponseCode();
        }
       public String Page_title(){
          title=dr.getTitle();
           return title;
       }

}
