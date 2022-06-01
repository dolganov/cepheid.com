package baseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CepheidMainPage;

public class CepheidTestObjects extends BaseTestObjects{

    @Test
    public void mainPagelinktestForLaboratoryProfessionals(){
        CepheidMainPage cepheidMainPage = new CepheidMainPage(driver);
        cepheidMainPage.open(url);
        cepheidMainPage.getLinkTranslateForLaboratoryProfessionals().click();
        Assert.assertTrue(cepheidMainPage.isHealthcareProvidersH1());
    }
    @Test
    public void mainPageHeaderForLaboratoryProfessionalsExist(){
        CepheidMainPage cepheidMainPage = new CepheidMainPage(driver);
        cepheidMainPage.open(url);
        cepheidMainPage.getLinkTranslateForLaboratoryProfessionals().click();
        String test = "Where Faster Technology Meets Better Answers";
        Assert.assertTrue(cepheidMainPage.getTextInLaboratoryProfessionalsH1().matches(test));
    }

    @Test
    public void mainPageHeaderForLaboratoryProfessionalsDiv(){
        CepheidMainPage cepheidMainPage = new CepheidMainPage(driver);
        cepheidMainPage.open(url);
        cepheidMainPage.getLinkHealthSystemAdministrator().click();
        Assert.assertTrue(cepheidMainPage.isHealthSystemAdministratorDivH1Displayed());
    }
}
