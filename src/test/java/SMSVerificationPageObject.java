import com.codeborne.selenide.Condition;

class SMSVerificationPageObject {

    public SMSVerificationPageObject() {
        Constant.sms_accept_input.waitUntil(Condition.visible, 15000);
    }

    public AccountObjectPage smsVerify() {
        Constant.sms_accept_input.setValue(Constant.valid_sms_notify);
        Constant.sms_accept_button.click();
        return new AccountObjectPage();
    }
}