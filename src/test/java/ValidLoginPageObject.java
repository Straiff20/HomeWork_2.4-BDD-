import static com.codeborne.selenide.Selenide.open;

public class ValidLoginPageObject {

    public static SMSVerificationPageObject validLogin() {
        open("http://localhost:9999");
        Constant.AUTH_PAGE_TITLE.isDisplayed();
        Constant.AUTH_LOGIN_INPUT.setValue(Constant.VALID_USER_LOGIN);
        Constant.AUTH_PASSWORD_INPUT.setValue(Constant.VALID_USER_PASSWORD);
        Constant.AUTH_CONTINUE_BUTTON.click();
        return new SMSVerificationPageObject();
    }
}