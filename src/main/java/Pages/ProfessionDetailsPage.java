package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfessionDetailsPage {
	public WebDriver webdriver;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Employment')]/following::input")
	private WebElement elm_employmentDropDown;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Organisation')]/following::input")
	private WebElement elm_organisationTextBox;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Designation')]/following::input")
	private WebElement elm_designationTextBox;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Role Description')]/following::input")
	private WebElement elm_roleDescriptionTextBox;

	public ProfessionDetailsPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	public WebElement clickEmploymentDropDown() {
		return elm_employmentDropDown;
	}

	public WebElement enterDetailsInOrganisationTextBox() {
		return elm_organisationTextBox;
	}

	public WebElement enterDetailsInDesignationTextBox() {
		return elm_designationTextBox;
	}

	public WebElement enterDetailsInRoleDescriptionTextBox() {
		return elm_roleDescriptionTextBox;
	}


}
