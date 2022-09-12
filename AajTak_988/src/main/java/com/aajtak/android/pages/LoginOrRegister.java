package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginOrRegister {
	
	public static AndroidDriver<AndroidElement> aDriver = null;
	
	public LoginOrRegister(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/signup_body']")
	private AndroidElement loginyaregister;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/signupBody")
	private AndroidElement loginyaregister_9_88;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_login_username']")
	private AndroidElement emailyaphone;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/etLoginUsername")
	private AndroidElement emailyaphone_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/etPassword")
	private AndroidElement password_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/tbClose")
	private AndroidElement closeIcon_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/btLoginSso")
	private AndroidElement login_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/tvLoginSignup")
	private AndroidElement signup_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/etFirstname")
	private AndroidElement name_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/etUsername")
	private AndroidElement emailyaPhone_signup_9_88;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/btnSignup")
	private AndroidElement signUPKaro_9_88;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_password']")
	private AndroidElement password;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/bt_login_login']")
	private AndroidElement login;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_close']")
	private AndroidElement closeIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_forget_pswd']")
	private AndroidElement forgotPassword;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_signup']")
	private AndroidElement signUpKaren;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/facebookView']")
	private AndroidElement facebookLogin;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/bt_twitter_login']")
	private AndroidElement twitterLogin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_loginwith']")
	private AndroidElement socialLoginKaren;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_account']")
	private AndroidElement accountNahiHain;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textinput_error']")
	private AndroidElement passwordInputErrorText;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-ic='in.AajTak.headlines:id/text_input_end_icon']")
	private AndroidElement passwordHideIcon;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	public AndroidElement getLoginOrRegister() {
		return loginyaregister;
	}
	
	public AndroidElement getEmailOrPhone() {
		return emailyaphone;
	}
	
	public AndroidElement getPassword() {
		return password;
	}
	
	public AndroidElement getLogin() {
		return login;
	}
	
	public AndroidElement getCloseIcon() {
		return closeIcon;
	}
	
	public AndroidElement getForgotPassword() {
		return forgotPassword;
	}
	
	public AndroidElement getSignUpKaren() {
		return signUpKaren;
	}
	
	public AndroidElement getFacebookLogin() {
		return facebookLogin;
	}
	
	public AndroidElement getTwitterLogin() {
		return twitterLogin;
	}
	
	public AndroidElement getSocialLoginKaren() {
		return socialLoginKaren;
	}
	
	public AndroidElement getAccountNahiHain() {
		return accountNahiHain;
	}
	
	public AndroidElement getPasswordInputErrorText() {
		return passwordInputErrorText;
	}
	
	public AndroidElement getPasswordHideIcon() {
		return passwordHideIcon;
	}
	public AndroidElement getToastMsg() {
		return toastmsg;
	}

	public static AndroidDriver<AndroidElement> getaDriver() {
		return aDriver;
	}

	public AndroidElement getLoginyaregister() {
		return loginyaregister;
	}
	
	
	
	public AndroidElement getLoginyaregister_9_88() {
		return loginyaregister_9_88;
	}

	public AndroidElement getEmailyaphone() {
		return emailyaphone;
	}

	public AndroidElement getEmailyaphone_9_88() {
		return emailyaphone_9_88;
	}

	public AndroidElement getPassword_9_88() {
		return password_9_88;
	}

	public AndroidElement getCloseIcon_9_88() {
		return closeIcon_9_88;
	}

	public AndroidElement getLogin_9_88() {
		return login_9_88;
	}

	public AndroidElement getSignup_9_88() {
		return signup_9_88;
	}

	public AndroidElement getName_9_88() {
		return name_9_88;
	}

	public AndroidElement getEmailyaPhone_signup_9_88() {
		return emailyaPhone_signup_9_88;
	}

	public AndroidElement getSignUPKaro_9_88() {
		return signUPKaro_9_88;
	}

	public AndroidElement getToastmsg() {
		return toastmsg;
	}
	public AndroidElement SignUp()
	{
		getSignUpKaren().click();
		getName_9_88().sendKeys("Sudhakar");
		getEmailyaPhone_signup_9_88().sendKeys("tester.com");
		getPassword_9_88().sendKeys("23y432dsa");
		getCloseIcon_9_88().click();
		return SignUp();
	}
	
	
}
