public class CreditCardPayment extends PaymentProcess {


    private double balance = 1000.00;
    private boolean cardIsValid = true;
    private boolean isCardExpired = false;
    private double amountToPay = 250.00;

    @Override
    void validatePayment() {
        if(cardIsValid){
               System.out.println("eligible for payment");
               return;
        }
        if (balance < amountToPay) {
            System.out.println("insufficient balance");
            return;
        }
        if (isCardExpired) {
            System.out.println("card is expired");
            return;
        }
        System.out.println("card is valid");

    }

    @Override
    void transferMoney() {
        balance = balance - amountToPay;
        System.out.println("transfered: " + amountToPay + " from credit card blank to bank account blank");

    }

    @Override
    void checkBalance() {
        System.out.println("amount in creadit card: " + balance);

    }
}
