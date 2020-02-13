public class TransferPageToCard {

    public TransferPageToCard() {
        Constant.card_replenishment_title.isDisplayed();
    }

    public AccountObjectPage moneyTransfer(String amount, String cardNumberFrom) {
        Constant.card_replenishment_input_sum.setValue(amount);
        Constant.card_replenishment_from.setValue(cardNumberFrom);
        Constant.card_button_transfer.click();
        return new AccountObjectPage();
    }
}