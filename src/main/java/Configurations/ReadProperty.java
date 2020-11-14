package Configurations;

import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Properties;

public class ReadProperty {
    static Properties prop;
    public String URL,BROWSER;
    public ReadProperty(){
        try {
            InputStream file=new FileInputStream("E:\\Automation\\BDD_Learn\\src\\main\\resources\\config.properties");
                prop=new Properties();
                prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        URL= prop.getProperty("URL");
        BROWSER= prop.getProperty("Browser");
    }
}
