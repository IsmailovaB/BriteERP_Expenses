package tests_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.Expense_Reports_To_Approve_Page;
import utilities.Driver;


public class Expense_Reports_To_Approve_Test {
    LogingPageTest loginObject = new LogingPageTest();
    Expense_Reports_To_Approve_Page moduleObject = new Expense_Reports_To_Approve_Page();
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void login(){
        loginObject.loginTest();
    }

    @Test(priority = 1)
    public void goToExpensesModule(){
        moduleObject.expensesModule.click();
        moduleObject.expensesReportsToApprove.click();
        String actualTitle= Driver.getDriver().getTitle();
        String expectedInTitle = "Odoo";
        Assert.assertTrue(actualTitle.contains(expectedInTitle), "");
    }
  @Test(priority = 2)
    public void submitedEntryList(){
       int amountOfSubmittedEntry = moduleObject.submittedList.size();
       int amountOfDisplayedSubmitedEntry = Integer.parseInt(moduleObject.amountOfDisplayedSubmittedEntry.getText());
      Assert.assertEquals(amountOfDisplayedSubmitedEntry,amountOfSubmittedEntry,"Not passed");
    }

   @Test (priority = 3)
    public void approveEntry(){
        moduleObject.sampleEntry.click();
        moduleObject.approveButton.click();
        Assert.assertTrue(moduleObject.approveButton.isDisplayed(), "Not passed");

    }



}
