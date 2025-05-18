public class Main {
    public static void main(String[] args) {

        System.out.println("Payment using credit card");
        PaymentProcess paymentUsingCredit = new CreditCardPayment();
        paymentUsingCredit.makePayment();
        System.out.println("---------------------------------------");

        System.out.println("Payment using Paypal");
        PaymentProcess paymentUsingPaypal = new PaypalPayment();
        paymentUsingPaypal.makePayment();

        }
    }
