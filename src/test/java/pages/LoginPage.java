package pages;

import org.opeqa.slenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
  WebDriver driver;
    
public LoginPage(WebDriver driver){
 this.driver = driver;
 }

//locators
By usernameField = By.Id("");
By passwordField = By.Id("");
ByloginButton = By.Id("");

//methods
public void enterUsername(String Username){ drver.findElement(usernameField).sendKeys("");
  }
public void enterpassword(String password){driver.findElement(passwordField).sendKeys("");
   }
public void clicklogin(){
driver.findElement(loginButton).click();    }
}


