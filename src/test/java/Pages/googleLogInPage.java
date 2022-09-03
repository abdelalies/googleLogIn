package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.driver;

public class googleLogInPage {


    public googleLogInPage() {

        PageFactory.initElements(driver.getDriver(), this);

    }

    @FindBy (xpath = "//*[@id=\"gb\"]/div/div[2]/a")
    public WebElement signInbtn;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/img")
    public WebElement googleImg;

    @FindBy (xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div")
    public  WebElement emailBox;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[3]/div")
    public WebElement UACbtn;


}
