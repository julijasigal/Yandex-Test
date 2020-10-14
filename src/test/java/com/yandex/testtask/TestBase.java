package com.yandex.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;

public class TestBase {
    WebDriver wd;

    @BeforeClass

    public void SetUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        openSite("https://yandex.ru/");
    }

    public void filterItem(Item item) {
        click(By.cssSelector("[href^='/catalog--"+ item.getItemType() +"']"));

        type(By.cssSelector("#glpricefrom"), item.getPriceFrom());

        type(By.cssSelector("#glpriceto"), item.getPriceTo());

        click(By.xpath("//span[text()='"+ item.getBrand() +"']"));
    }

    public void selectComputerDepartment() {
        click(By.cssSelector("[href*='kompiuternaia-tekhnika']"));
    }

    public void goToMarket() {
        click(By.cssSelector("[data-id='market']"));
    }

    public void type(By locator, String text) {
        if(text!=null){
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }}

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void switchToNextWindow() {
        List<String> availableWindows = new ArrayList<>(wd.getWindowHandles());
        if (!availableWindows.isEmpty()){
            wd.switchTo().window(availableWindows.get(1));
    }}
}
