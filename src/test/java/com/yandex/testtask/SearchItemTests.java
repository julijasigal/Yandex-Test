package com.yandex.testtask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchItemTests extends TestBase{

    @Test

        public void testItem(){
            goToMarket();

            switchToNextWindow();

            selectComputerDepartment();

            filterItem(new Item("planshety", "20000", "35000", "Apple"));

//        WebElement item = wd.findElement(By.cssSelector("//*[@data-autotest-id='product-snippet'][2]"));
//        String itemName = item.findElement(By.xpath(".//h3")).getText();
        // a mojno tak:
            String itemName = wd.findElement(By.cssSelector("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();


    }


}
