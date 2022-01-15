package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Helper.Reporter;

public class AspirationDetailsPage {
	public WebDriver webdriver;

	@FindBy(how = How.XPATH, using = "//label[text()='Number Of Schools']/following::input")
	private WebElement elm_noOfSchools;

	@FindBy(how = How.XPATH, using = "//label[text()='Additional Intakes']/following::input")
	private WebElement elm_additionalIntakes;

	@FindBy(how = How.XPATH, using = "//label[text()='Degree']/following::input")
	private WebElement elm_degree;

	@FindBy(how = How.XPATH, using = "//label[text()='Field of Study']/following::input")
	private WebElement elm_fieldOfStudy;

	@FindBy(how = How.XPATH, using = "//label[text()='Area of Specialization']/following::input")
	private WebElement elm_areaOfSpecialization;

	@FindBy(how = How.XPATH, using = "//label[text()='Preferred Region']/following::input")
	private WebElement elm_preferredRegion;

	@FindBy(how = How.XPATH, using = "//label[text()='Preferred B-schools']/following::input")
	private WebElement elm_preferredBusinessSchool;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	private WebElement elm_saveButton;

	@FindBy(how = How.XPATH, using = "//p[text()='Please Fill the Required Field']")
	private WebElement elm_errorMessage;

	public AspirationDetailsPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	public WebElement getSaveButton() {
		return elm_saveButton;
	}

	public WebElement clickNoOfSchoolsDropDown() {
		return elm_noOfSchools;
	}

	public WebElement clickAdditionalIntakesDropDown() {
		return elm_additionalIntakes;
	}

	public WebElement clickDegreeDropDown() {
		return elm_degree;
	}

	public WebElement clickFieldOfStudyDropDown() {
		return elm_fieldOfStudy;
	}

	public WebElement clickSpecializationDropDown() {
		return elm_areaOfSpecialization;
	}

	public WebElement clickPreferredRegionDropDown() {
		return elm_preferredRegion;
	}

	public WebElement clickPreferredGradSchoolDropDown() {
		return elm_preferredBusinessSchool;
	}

	public WebElement getErrorMessage() {
		WebElement element = null;

		try {
			FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(webdriver).withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class, TimeoutException.class);
			try {
				element = fWait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath("//p[text()='Please Fill the Required Field']")));
			} catch (Exception e) {
				element = null;
			}

			if (element == null) {
				Reporter.reportStep("A popup Message Box Shown Updated Successfully", "PASS");
			} else {
				Reporter.reportStep("Please fill the required field [Popup Detected]", "FAIL");
			}

		}

		catch (Exception ex) {

		}

		return elm_errorMessage;
	}

}
