package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CepheidMainPage  extends BasePage {

    public CepheidMainPage(WebDriver driver) {
        super(driver);
    }


    // check Laboratory Professionals
    public WebElement getTranslateForLaboratoryProfessionals(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='profile-selector']/div[1]/a[1]")));
        return driver.findElement(By.xpath("//*[@id='profile-selector']/div[1]/a[1]"));
    }
    // get link Laboratory Professionals
    public WebElement getLinkTranslateForLaboratoryProfessionals(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='profile-selector']/div[1]/a[1]")));
        return driver.findElement(By.xpath("//*[@id='profile-selector']/div[1]/a[1]"));
    }

    // check Healthcare Providers
    public WebElement getTranslateForHealthcareProviders(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='profile-selector']/div[1]/a[2]")));
        return driver.findElement(By.xpath("//*[@id='profile-selector']/div[1]/a[2]"));
    }

    // check Health System Administrators
    public WebElement getTranslateForHealthSystemAdministrators(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='profile-selector']/div[1]/a[3]")));
        return driver.findElement(By.xpath("//*[@id='profile-selector']/div[1]/a[3]"));
    }


// get Laboratory Professionals First Header
    public WebElement getLaboratoryProfessionalsHeaderH1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1")));
        return driver.findElement(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1"));
    }
    //is Laboratory Professionals First Header Displayed
    public boolean isLaboratoryProfessionalsHeaderH1Displayed() {
        try {
            return getLaboratoryProfessionalsHeaderH1().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

    //get Health System Administrator <div>
    public WebElement getHealthSystemAdministratorDiv() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='profile-selector']/div[2]/div[3]")));
        return driver.findElement(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1"));
    }

    // is Health System Administrator <div> showed
    public boolean isHealthSystemAdministratorDivH1Displayed() {
        try {
            return getHealthSystemAdministratorDiv().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    // get link Health System Administrator
    public WebElement getLinkHealthSystemAdministrator(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='profile-selector']/div[1]/a[3]")));
        return driver.findElement(By.xpath("//*[@id='profile-selector']/div[1]/a[3]"));
    }

    // get text Laboratory Professionals in H1 ??
    public boolean checkTextInLaboratoryProfessionalsH1(String text) {
        By getTextInLaboratoryProfessionalsH1 = By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getTextInLaboratoryProfessionalsH1));
        if (text == driver.findElement(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1")).getText()) {
            return true;
        }return false;
    }
    // get text Laboratory Professionals in H1 ??
    public String getTextInLaboratoryProfessionalsH1() {
        By getTextInLaboratoryProfessionalsH1 = By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getTextInLaboratoryProfessionalsH1));
        return driver.findElement(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1")).getText();
    }



    // get Healthcare Providers Header
    public WebElement getHealthcareProvidersH1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1")));
        return driver.findElement(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1"));
    }
    //is Healthcare Providers Header Header Displayed
    public boolean isHealthcareProvidersH1() {
        try {
            return getHealthcareProvidersH1().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }


    // get Health System Administrators Header
    public WebElement getHealthSystemAdministratorsH1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1")));
        return driver.findElement(By.xpath("//*[@id='masthead-content-0']/div[2]/div/div/h1"));
    }
    //is Health System Administrators Header Header Displayed
    public boolean isHealthSystemAdministratorsH1() {
        try {
            return getHealthSystemAdministratorsH1().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }



    public void open(String url) {
        driver.get(url);
    }


}
