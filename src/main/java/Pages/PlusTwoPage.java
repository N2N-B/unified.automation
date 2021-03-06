package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PlusTwoPage {

	public WebDriver webdriver;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'School Name')]/following::input")
	private WebElement elm_schoolName;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Examination Board')]/following::input")
	private WebElement elm_examBoardDropDown;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Start Date')]/following::input")
	private WebElement elm_startDate;

	@FindBy(how = How.XPATH, using = "//p[text()='OnBoarding']")
	private WebElement elm_onBoarding;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'End Date')]/following::input")
	private WebElement elm_endDate;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Grading Scale')]/following::input")
	private WebElement elm_gradeScale;

	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'CGPA')]/following::input")
	private WebElement elm_percentageCgpa;

	@FindBy(how = How.XPATH, using = "//section[@class='container']//img")
	private WebElement elm_uploadMarkSheet;

	@FindBy(how = How.XPATH, using = "//p[text()='Please Fill The Required Field']")
	private WebElement elm_errorMessage;

	public PlusTwoPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	public WebElement clickOnBoarding() {
		return elm_onBoarding;
	}

	public WebElement getSchoolName() {
		return elm_schoolName;
	}

	public WebElement getExamBoardDropDown() {
		return elm_examBoardDropDown;
	}

	public WebElement getStartDate() {
		return elm_startDate;
	}

	public WebElement getEndDate() {
		return elm_endDate;
	}	

	public WebElement getPercentageCgpa() {
		return elm_percentageCgpa;
	}

	public WebElement uploadSheet() {
		return elm_uploadMarkSheet;
	}

}
