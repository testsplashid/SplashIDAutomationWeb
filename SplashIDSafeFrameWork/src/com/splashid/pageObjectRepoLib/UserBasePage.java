package com.splashid.pageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.splashid.genericLib.Driver;

public class UserBasePage {
	
	//SplashID Safe Menu- Records Homepage	
	@FindBy (xpath="//span[contains(text(),'SplashID Safe')]")
	private WebElement splashIdSafebtn;
	
	//Dashboard Menu
	@FindBy (xpath="//span[contains(text(),'Dashboard')]")
	private WebElement dashBoardbtn;
	
	//Backup Menu
	@FindBy (xpath ="//span[contains(text(),'SplashID Backup')]")
	private WebElement backUpbtn;
	
	//Accounts page menu
	@FindBy (xpath ="//span[contains(text(),'Account')]")
	private WebElement accntbtn;
	
	//Edit Categories menu
	@FindBy (xpath ="//span[contains(text(),'Edit Categories')]")
	private WebElement edtCatbtn;
	
	//Edit Type menu
	@FindBy (xpath ="//span[contains(text(),'Edit Types')]")
	private WebElement edtTypbtn;
	
	//Sign-out
	@FindBy (xpath ="//span[contains(text(),'Sign Out')]")
	private WebElement sgnOutbtn;
	
	public void navigateToRecordsHomePage()
	{
		splashIdSafebtn.click();
	}
	
	public void navigateToDashboard()
	{
		dashBoardbtn.click();
	}
	
	public void navigateToBackup(){
		backUpbtn.click();
	}
	
	public void navigateToAccountsPage()
	{
		accntbtn.click();
	}
	
	public void navigateToEdtCatPage()
	{
		edtCatbtn.click();
	}
	
	public void navigateToEdtTypePage()
	{
		edtTypbtn.click();
	}
	
	public void signOut()
	{
		sgnOutbtn.click();
	}
}
