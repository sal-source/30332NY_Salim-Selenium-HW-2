package app.pom.resultpage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h1[@class='page-title']//span")
    public WebElement textSearchTerm;



    public  SearchResultsPage(){
        PageFactory.initElements(driver, this );

    }
    public List<WebElement>getSearchResults(){
       return driver.findElements(By.xpath("//ol[@class='products list items product-items']//li"));
        //div[@class='search results'] alternative path
    }


}
