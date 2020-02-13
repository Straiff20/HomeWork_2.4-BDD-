import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    void TransactionToFirstCard_Int_Test() {
        int amountTransfer = 2000;
        String cardNumberFrom = Constant.card_number_0002;

        SMSVerificationPageObject smsVerificationPage = ValidLoginPageObject.ValidLogin();
        AccountObjectPage beforeTransfer = smsVerificationPage.smsVerify();
        TransferPageToCard transfer = beforeTransfer.ChooseCardForTransfer_1();
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
    void TransactionToSecondCard_Int_Test() {
        int amountTransfer = 1000;
        String cardNumberFrom = Constant.card_number_0001;

        SMSVerificationPageObject smsVerificationPageObject = ValidLoginPageObject.ValidLogin();
        AccountObjectPage beforeTransfer = smsVerificationPageObject.smsVerify();
        TransferPageToCard transfer = beforeTransfer.ChooseCardForTransfer_2();
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
    void TransactionToFirstCard_Double_Test() {
        double amountTransfer = 11.11;
        String cardNumberFrom = Constant.card_number_0002;

        SMSVerificationPageObject smsVerificationPageObject = ValidLoginPageObject.ValidLogin();
        AccountObjectPage beforeTransfer = smsVerificationPageObject.smsVerify();
        TransferPageToCard transfer = beforeTransfer.ChooseCardForTransfer_1();
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
    void TransactionToSecondCard_Double_Test() {
        double amountTransfer = 11.11;
        String cardNumberFrom = Constant.card_number_0001;

        SMSVerificationPageObject smsVerificationPageObject = ValidLoginPageObject.ValidLogin();
        AccountObjectPage beforeTransfer = smsVerificationPageObject.smsVerify();
        TransferPageToCard transfer = beforeTransfer.ChooseCardForTransfer_2();
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