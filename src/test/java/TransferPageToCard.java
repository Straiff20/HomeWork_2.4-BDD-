public class TransferPageToCard {

    public TransferPageToCard() {
        Constant.CARD_REPLENISHMENT_TITLE.isDisplayed();
    }

    public AccountObjectPage moneyTransfer(String amount, String cardNumberFrom) {
        Constant.CARD_REPLENISHMENT_INPUT_SUM.setValue(amount);
        Constant.CARD_REPLENISHMENT_FROM.setValue(cardNumberFrom);
        Constant.CARD_BUTTON_TRANSFER.click();
        return new AccountObjectPage();
    }
}