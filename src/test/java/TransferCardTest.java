import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferCardTest {

    @Test
    void TransactionToFirstCardIntTest() {
        int amountTransfer = 2000;
        String cardNumberFrom = Constant.CARD_NUMBER_0002;

        SMSVerificationPageObject smsVerificationPage = ValidLoginPageObject.validLogin();
        AccountObjectPage beforeTransfer = smsVerificationPage.smsVerify();
        TransferPageToCard transfer = beforeTransfer.chooseCardForFirstTransfer();
        AccountObjectPage afterTransfer = transfer.moneyTransfer(String.valueOf(amountTransfer), cardNumberFrom);

        int sumFirstCardBeforeTransfer = Integer.parseInt(beforeTransfer.sumFirstCard);
        int sumSecondCardBeforeTransfer = Integer.parseInt(beforeTransfer.sumSecondCard);
        int sumFirstCardAfterTransfer = Integer.parseInt(afterTransfer.sumFirstCard);
        int sumSecondCardAfterTransfer = Integer.parseInt(afterTransfer.sumSecondCard);
        int diffAfterTransferFistCard = sumFirstCardAfterTransfer - sumFirstCardBeforeTransfer;
        int diffAfterTransferSecondCard = sumSecondCardBeforeTransfer - sumSecondCardAfterTransfer;

        assertEquals(diffAfterTransferFistCard, amountTransfer);
        assertEquals(diffAfterTransferSecondCard, amountTransfer);
    }

    @Test
    void TransactionToSecondCardIntTest() {
        int amountTransfer = 1000;
        String cardNumberFrom = Constant.CARD_NUMBER_0001;

        SMSVerificationPageObject smsVerificationPageObject = ValidLoginPageObject.validLogin();
        AccountObjectPage beforeTransfer = smsVerificationPageObject.smsVerify();
        TransferPageToCard transfer = beforeTransfer.chooseCardForSecondTransfer();
        AccountObjectPage afterTransfer = transfer.moneyTransfer(String.valueOf(amountTransfer), cardNumberFrom);

        int sumFirstCardBeforeTransfer = Integer.parseInt(beforeTransfer.sumFirstCard);
        int sumSecondCardBeforeTransfer = Integer.parseInt(beforeTransfer.sumSecondCard);
        int sumFirstCardAfterTransfer = Integer.parseInt(afterTransfer.sumFirstCard);
        int sumSecondCardAfterTransfer = Integer.parseInt(afterTransfer.sumSecondCard);
        int diffAfterTransferFistCard = sumFirstCardBeforeTransfer - sumFirstCardAfterTransfer;
        int diffAfterTransferSecondCard = sumSecondCardAfterTransfer - sumSecondCardBeforeTransfer;

        assertEquals(diffAfterTransferFistCard, amountTransfer);
        assertEquals(diffAfterTransferSecondCard, amountTransfer);
    }

    @Test
    void TransactionToFirstCardDoubleTest() {
        double amountTransfer = 11.11;
        String cardNumberFrom = Constant.CARD_NUMBER_0002;

        SMSVerificationPageObject smsVerificationPageObject = ValidLoginPageObject.validLogin();
        AccountObjectPage beforeTransfer = smsVerificationPageObject.smsVerify();
        TransferPageToCard transfer = beforeTransfer.chooseCardForFirstTransfer();
        AccountObjectPage afterTransfer = transfer.moneyTransfer(String.valueOf(amountTransfer), cardNumberFrom);

        double sumFirstCardBeforeTransfer = Double.parseDouble(beforeTransfer.sumFirstCard);
        double sumSecondCardBeforeTransfer = Double.parseDouble(beforeTransfer.sumSecondCard);
        double sumFirstCardAfterTransfer = Double.parseDouble(afterTransfer.sumFirstCard);
        double sumSecondCardAfterTransfer = Double.parseDouble(afterTransfer.sumSecondCard);
        double diffAfterTransferFistCard = sumFirstCardAfterTransfer - sumFirstCardBeforeTransfer;
        double diffAfterTransferSecondCard = sumSecondCardBeforeTransfer - sumSecondCardAfterTransfer;

        assertEquals(diffAfterTransferFistCard, amountTransfer);
        assertEquals(diffAfterTransferSecondCard, amountTransfer);
    }

    @Test
    void TransactionToSecondCardDoubleTest() {
        double amountTransfer = 11.11;
        String cardNumberFrom = Constant.CARD_NUMBER_0001;

        SMSVerificationPageObject smsVerificationPageObject = ValidLoginPageObject.validLogin();
        AccountObjectPage beforeTransfer = smsVerificationPageObject.smsVerify();
        TransferPageToCard transfer = beforeTransfer.chooseCardForSecondTransfer();
        AccountObjectPage afterTransfer = transfer.moneyTransfer(String.valueOf(amountTransfer), cardNumberFrom);

        double sumFirstCardBeforeTransfer = Double.parseDouble(beforeTransfer.sumFirstCard);
        double sumSecondCardBeforeTransfer = Double.parseDouble(beforeTransfer.sumSecondCard);
        double sumFirstCardAfterTransfer = Double.parseDouble(afterTransfer.sumFirstCard);
        double sumSecondCardAfterTransfer = Double.parseDouble(afterTransfer.sumSecondCard);
        double diffAfterTransferFistCard = sumFirstCardBeforeTransfer - sumFirstCardAfterTransfer;
        double diffAfterTransferSecondCard = sumSecondCardAfterTransfer - sumSecondCardBeforeTransfer;

        assertEquals(diffAfterTransferFistCard, amountTransfer);
        assertEquals(diffAfterTransferSecondCard, amountTransfer);
    }
}