package tests_pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.Expenses_To_Submit_Page;
import utilities.Config;
import utilities.Driver;

import java.util.Collection;

public class ExpensesToSubmitTest {

    @Test
    public void createButton(){

        Expenses_To_Submit_Page expenseToSubmit = new Expenses_To_Submit_Page();
       LogingPageTest.loginTest();
        Assert.assertTrue(expenseToSubmit.textDisplay.isDisplayed());

       expenseToSubmit.createButton.click();
       Assert.assertTrue(expenseToSubmit.newTextDisplay.isDisplayed());

       expenseToSubmit.expenseDescriptionInput.sendKeys(Config.getProperty("expenseDescription"));

       expenseToSubmit.productInput.click();


    }
}
