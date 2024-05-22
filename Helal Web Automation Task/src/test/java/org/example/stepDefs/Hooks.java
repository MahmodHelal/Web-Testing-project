package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser(){
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://swinji.azurewebsites.net");
    }
    /*
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }*/
}
