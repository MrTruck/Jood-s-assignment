public class PaypalPayment extends PaymentProcess{

    private double paypalBalance = 600.00;
    private boolean accountExist = true;
    private double amountToPay = 250.00;

    @Override
    void validatePayment() {

        if(accountExist){
            System.out.println("account found");
            return;
        }
        if (paypalBalance < amountToPay) {
            System.out.println("insufficient balance");
            return;
        }

        System.out.println("eligible for payment");
    }

    @Override
    void transferMoney() {

        paypalBalance = paypalBalance - amountToPay;
        System.out.println("transfered: " + amountToPay + " from PAYPAL blank to PAYPAL account blank");

    }

    @Override
    void checkBalance() {

        System.out.println("amount in paypal: " + paypalBalance);
    }
}
