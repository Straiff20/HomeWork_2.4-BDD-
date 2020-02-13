import static com.codeborne.selenide.Selenide.open;

public class ValidLoginPageObject {

    public static SMSVerificationPageObject ValidLogin() {
        open("http://localhost:9999");
        Constant.auth_page_title.isDisplayed();
        Constant.auth_login_input.setValue(Constant.valid_user_login);
        Constant.auth_password_input.setValue(Constant.valid_user_password);
        Constant.auth_continue_button.click();
        return new SMSVerificationPageObject();
    }
}