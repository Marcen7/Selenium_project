
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // //a[contains(text(),'Contac')]

    // Co musi mieć taka klasa
    // 1. Inicjalizacja webelementów
    // 2. Konstruktor (razem z pageFactory)!!!
    // 3. Operacje na webelementach


    //1. Inicjalizacja Webelementów
    @FindBy(xpath = "//a[contains(text(),'Contac')]")  //(z opencua selenium
    private WebElement contactUs_link;

    @FindBy(css = )

    @FindBy(css = )


    //2. Konstruktor HomePage


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    //3. Operacje na webelementach

    public void clikOnContactUsLink(){
        contactUs_link.click();
        System.out.println("Contact us link has been clicked");
    }
    public void sendFile(String path){

    }
}


