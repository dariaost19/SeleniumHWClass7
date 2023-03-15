package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        WebElement button=driver.findElement(By.xpath("//button[@id='populate-text']"));
       button.click();
       String text=button.getText();
        System.out.println(text);
       WebDriverWait wait=new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h2")));
       WebElement button2=driver.findElement(By.xpath("//button[@id='display-other-button']"));
      button2.click();
        System.out.println(button2.isEnabled());
      WebDriverWait wait1=new WebDriverWait(driver,10);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']")));
      WebElement button3=driver.findElement(By.xpath("//button[@id='enable-button']"));
      button3.click();
        System.out.println(button3.isDisplayed());
      WebDriverWait wait2=new WebDriverWait(driver,10);
       wait2.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
      WebElement button4=driver.findElement(By.xpath("//button[@id='checkbox']"));
       button4.click();
       WebDriverWait wait3=new WebDriverWait(driver,10);
       wait3.until(ExpectedConditions.elementToBeSelected(By.id("ch")));
       


    }
}
