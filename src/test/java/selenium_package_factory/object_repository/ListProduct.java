package selenium_package_factory.object_repository;

import org.openqa.selenium.By;

public class ListProduct {
    public By titleProductDynamic (String ProductName){
        return By.xpath("//div[@class='inventory_item_name' and text()='" + ProductName + "']");

    }
    
}
