import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class AccountObjectPage {
    String sumFirstCard;
    String sumSecondCard;

    public AccountObjectPage() {
        Constant.BALANCE_DASHBOARD.waitUntil(Condition.visible, 15000);
        sumFirstCard = getSumCard0001();
        sumSecondCard = getSumCard0002();
    }

    private String getSumCard0001() {
        String sum = $("[data-test-id=\"92df3f1c-a033-48e6-8390-206f6b1f56c0\"]").getText();
        int a = sum.indexOf(":") +2;
        int b = sum.indexOf(" ", a);
        return sum.substring(a, b);
    }

    private String getSumCard0002() {
        String sum = $("[data-test-id=\"0f3f5c2a-249e-4c3d-8287-09f7a039391d\"]").getText();
        int a = sum.indexOf(":") +2;
        int b = sum.indexOf(" ", a);
        return sum.substring(a, b);
    }

    public TransferPageToCard chooseCardForFirstTransfer() {
        Constant.BALANCE_TRANSFER_BUTTON_0001.click();
        return new TransferPageToCard();
    }

    public TransferPageToCard chooseCardForSecondTransfer() {
        Constant.BALANCE_TRANSFER_BUTTON_0002.click();
        return new TransferPageToCard();
    }
}