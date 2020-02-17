import com.codeborne.selenide.Condition;

class SMSVerificationPageObject {

    public SMSVerificationPageObject() {
        Constant.SMS_ACCEPT_INPUT.waitUntil(Condition.visible, 15000);
    }

    public AccountObjectPage smsVerify() {
        Constant.SMS_ACCEPT_INPUT.setValue(Constant.VALID_SMS_NOTIFY);
        Constant.SMS_ACCEPT_BUTTON.click();
        return new AccountObjectPage();
    }
}