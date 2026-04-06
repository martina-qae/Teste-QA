package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogSearchPage {

    private WebDriver driver;

    private final String URL = "https://blogdoagi.com.br/";

    private By searchIcon = By.cssSelector("button.header-search-toggle");
    private By searchInput = By.cssSelector("input.search-field");
    private By searchResults = By.cssSelector("article");
    private By noResultsMessage = By.xpath("//*[contains(text(),'Nenhum resultado')]");

    public BlogSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }

    public void searchFor(String term) {
        driver.findElement(searchIcon).click();
        driver.findElement(searchInput).sendKeys(term);
        driver.findElement(searchInput).submit();
    }

    public boolean hasResults() {
        return driver.findElements(searchResults).size() > 0;
    }

    public boolean hasNoResultsMessage() {
        return driver.findElements(noResultsMessage).size() > 0;
    }
}