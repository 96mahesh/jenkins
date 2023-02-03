package com.nopcommerce.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
    private static WebDriver driver;
    public static WebDriver launchBrowser(String browsername)
    {
        if(browsername.equals("chrome"))
            driver=new ChromeDriver();
        else
            driver=new EdgeDriver();
        return driver;
    }
    public static void openURL(String url)
    {
        driver.get(url);
    }
    public static void close()
    {
        driver.close();
    }
}
