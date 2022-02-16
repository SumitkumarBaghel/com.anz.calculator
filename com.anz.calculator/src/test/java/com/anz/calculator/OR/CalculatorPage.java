package com.anz.calculator.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CalculatorPage {
	private WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
	}

	private By appTypeSingle = By.xpath("//*[@for=\"application_type_single\"]"); // //*[@for="application_type_single"]
	private By noofdependent = By.xpath("//select[@title=\"Number of dependants\"]");

	private By properyToBuy = By.xpath("//*[@for=\"borrow_type_home\"]");
	private By annualIncome = By.xpath("//*[@aria-labelledby=\"q2q1\"]");
	private By otherIncome = By.xpath("//*[@aria-labelledby=\"q2q2\"]");

	private By monthlyLivingExpenses = By.xpath("//*[@aria-labelledby=\"q3q1\"]");
	private By currentHomeLoan = By.xpath("//*[@aria-labelledby=\"q3q2\"]");
	private By otherHomeLoan = By.xpath("//*[@aria-labelledby=\"q3q3\"]");
	private By otherCommitments = By.xpath("//*[@aria-labelledby=\"q3q4\"]");
	private By totalCrLimit = By.xpath("//*[@aria-labelledby=\"q3q5\"]");

	private By workOutBorrow = By.xpath("//*[@id=\"btnBorrowCalculater\"]");
	private By startOver = By.xpath("//*[@class=\"result__restart\"]/button");
	private By estimatedValue = By.xpath("//*[@id=\"borrowResultTextAmount\"]");

	public WebElement estimatedValue() {
		WebElement estimatedValueBtn = driver.findElement(estimatedValue);

		return estimatedValueBtn;
	}
	
	public WebElement appTypeSingle() {
		WebElement appTypeSingleBtn = driver.findElement(appTypeSingle);

		return appTypeSingleBtn;
	}

	public WebElement noofdependent() {
		WebElement noofdependentBtn = driver.findElement(noofdependent);

		return noofdependentBtn;
	}

	public WebElement properyToBuy() {
		WebElement properyToBuyBtn = driver.findElement(properyToBuy);

		return properyToBuyBtn;
	}

	public WebElement annualIncome() {
		WebElement annualIncomeBtn = driver.findElement(annualIncome);

		return annualIncomeBtn;
	}

	public WebElement otherIncome() {
		WebElement otherIncomeBtn = driver.findElement(otherIncome);

		return otherIncomeBtn;
	}

	public WebElement monthlyLivingExpenses() {
		WebElement monthlyLivingExpensesBtn = driver.findElement(monthlyLivingExpenses);

		return monthlyLivingExpensesBtn;
	}

	public WebElement currentHomeLoan() {
		WebElement currentHomeLoanBtn = driver.findElement(currentHomeLoan);

		return currentHomeLoanBtn;
	}

	public WebElement otherHomeLoan() {
		WebElement otherHomeLoanBtn = driver.findElement(otherHomeLoan);

		return otherHomeLoanBtn;
	}

	public WebElement otherCommitments() {
		WebElement otherCommitmentsBtn = driver.findElement(otherCommitments);

		return otherCommitmentsBtn;
	}

	public WebElement totalCrLimit() {
		WebElement totalCrLimiteBtn = driver.findElement(totalCrLimit);

		return totalCrLimiteBtn;
	}

	public WebElement workOutBorrowbtn() {
		WebElement workOutBorrowbtn = driver.findElement(workOutBorrow);

		return workOutBorrowbtn;
	}

	public WebElement startOver() {
		WebElement startOverbtn = driver.findElement(startOver);

		return startOverbtn;
	}

}
