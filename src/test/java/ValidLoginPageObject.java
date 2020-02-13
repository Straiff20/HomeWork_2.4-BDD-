import static com.codeborne.selenide.Selenide.open;

public class ValidLoginPageObject {

    public static SMSVerificationPageObject ValidLogin() {
        open("http://localhost:9999");
        Constant.AUTH_PAGE_TITLE.isDisplayed();
        Constant.AUTH_LOGIN_INPUT.setValue(Constant.valid_user_login);
        Constant.AUTH_PASSWORD_INPUT.setValue(Constant.valid_user_password);
        Constant.AUTH_CONTINUE_BUTTON.click();
        return new SMSVerificationPageObject();
    }
}