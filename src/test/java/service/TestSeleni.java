package service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleni {
    ChromeDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testSele() throws InterruptedException {
        driver.get("http://www.savor.vn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Hà Nội')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Giới thiệu')]")).click();
        driver.findElement(By.xpath("//a[@href='#collection']")).click();
        driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
//
////     DatBanh
//      Thread.sleep(5000);
//        driver.findElement(By.xpath("//body/div/main[@role='main']/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
//        driver.findElement(By.xpath("//button[@class='grid size-12 cursor-pointer place-content-center rounded-full !border-2 border-solid !border-white bg-primary-green-avocado-0 p-4 text-center text-xl font-medium text-white hover:bg-secondary-blueberry-0 focus:outline-none focus:ring-4 focus:ring-primary-green-avocado-100 md:size-14 md:text-2xl']")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Đặt hàng')]")).click();
    }
    //git init
//git remote add origin ...
//git remote -v
//git branch -M main
//git pull origin main
//git pull origin main
//git add .
//git commit -m "Commit"
//git push origin main
}
