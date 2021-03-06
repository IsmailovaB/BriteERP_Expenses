package tests_pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Expenses_To_Submit_Page;
import utilities.Config;
import utilities.Driver;

public class ExpensesToSubmitTest {


    @Test                       // Begimai
    public void createExpense() throws InterruptedException{


        Expenses_To_Submit_Page expenseToSubmit = new Expenses_To_Submit_Page();
        LoginPageTest.loginTest();

        Assert.assertTrue(expenseToSubmit.textDisplay.isDisplayed());

        expenseToSubmit.createButton.click();
        Assert.assertTrue(expenseToSubmit.newTextDisplay.isDisplayed());

        expenseToSubmit.expenseDescriptionInput.sendKeys(Config.getProperty("expenseDescription"));

        expenseToSubmit.productInput.click();
        Driver.getDriver().findElement(By.xpath("//a[.='"+Config.getProperty("product")+"']")).click();

        expenseToSubmit.employeeField.click();
        Driver.getDriver().findElement(By.xpath("//a[.='"+Config.getProperty("employee")+"']")).click();

        expenseToSubmit.saveButton.click();

        Assert.assertTrue(expenseToSubmit.textAfterSave.isDisplayed());

        expenseToSubmit.submitToManagerButton.click();
        Thread.sleep(2000);
        expenseToSubmit.saveButton.click();

        String expectedMessage = "Expense report submitted, waiting approval";
        String actualMessage = expenseToSubmit.submittedMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        Driver.quitDriver();
    }
}
