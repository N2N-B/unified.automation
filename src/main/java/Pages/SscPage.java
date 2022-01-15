package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Helper.GlobalProperties;

public class SscPage {

	public WebDriver webdriver;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'School Name')]/following::input")
	private WebElement elm_schoolName;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Examination Board')]/following::input")
	private WebElement elm_examBoardDropDown;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Start Date')]/following::input")
	private WebElement elm_startDate;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'End Date')]/following::input")
	private WebElement elm_endDate;

	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Grading Scale')]/following::input")
	private WebElement elm_gradeScale;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'CGPA')]/following::input")
	private WebElement elm_percentageCgpa;

	@FindBy(how = How.XPATH, using = "//section[@class='container']//*[name()='svg']")
	private WebElement elm_uploadMarkSheet;

	@FindBy(how = How.XPATH, using = "//p[text()='Please Fill The Required Field']")
	private WebElement elm_errorMessage;

	public SscPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	public WebElement getSchoolName() {
		return elm_schoolName;
	}

	public WebElement getExamBoardCombo() {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) GlobalProperties.webdriver;
		javascriptExecutor.executeScript("arguments[0].click()", elm_examBoardDropDown);
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
