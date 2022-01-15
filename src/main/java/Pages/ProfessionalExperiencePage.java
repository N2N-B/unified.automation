package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfessionalExperiencePage {
	public WebDriver webdriver;

	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Add Professional Experience')]")
	private WebElement elm_addProfessionalExperienceButton;

	public ProfessionalExperiencePage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	public WebElement clickAddProfessionalExperienceButton() {
		return elm_addProfessionalExperienceButton;
	}

}
