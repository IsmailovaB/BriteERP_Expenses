package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Expenses_To_Submit_Page {

    public Expenses_To_Submit_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement expenseDescriptionInput;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement productInput;

    @FindBy(xpath = "//input[@id='o_field_input_65']")
    public WebElement unitPriceInput;

    @FindBy(xpath = "//input[@id='o_field_input_70']")
    public WebElement expenseDate;

    @FindBy(xpath = "//input[@id='o_field_input_72']")
    public WebElement employeeField;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[.='Submit to Manager']")
    public WebElement submitToManagerButton;


}
