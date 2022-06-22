package baseTest;

import listeners.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CepheidMainPage;

public class CepheidTestObjects extends BaseTestObjects{
    private static Logger logger = LogManager.getLogger(CepheidTestObjects.class);
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void mainPagelinktestForLaboratoryProfessionals(){
        logger.debug("mainPagelinktestForLaboratoryProfessionals");
        CepheidMainPage cepheidMainPage = new CepheidMainPage(driver);
        cepheidMainPage.open(url);
        logger.info("URL = "+url);
        cepheidMainPage.getLinkTranslateForLaboratoryProfessionals().click();
        logger.info("LINK = "+cepheidMainPage.getLinkTranslateForLaboratoryProfessionals());
        Assert.assertTrue(cepheidMainPage.isHealthcareProvidersH1());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void mainPageHeaderForLaboratoryProfessionalsExist(){
        logger.debug("mainPageHeaderForLaboratoryProfessionalsExist");
        CepheidMainPage cepheidMainPage = new CepheidMainPage(driver);
        cepheidMainPage.open(url);
        cepheidMainPage.getLinkTranslateForLaboratoryProfessionals().click();
        String test = "Where Faster Technology Meets Better Answers";
        Assert.assertTrue(cepheidMainPage.getTextInLaboratoryProfessionalsH1().matches(test));
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void mainPageHeaderForLaboratoryProfessionalsDiv(){
        logger.debug("mainPageHeaderForLaboratoryProfessionalsDiv");
        CepheidMainPage cepheidMainPage = new CepheidMainPage(driver);
        cepheidMainPage.open(url);
        cepheidMainPage.getLinkHealthSystemAdministrator().click();
        Assert.assertTrue(cepheidMainPage.isHealthSystemAdministratorDivH1Displayed());
    }
}
