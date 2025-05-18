public abstract class PaymentProcess {

    public final void makePayment() {
        validatePayment();
        transferMoney();
        checkBalance();
    }
    abstract void validatePayment();
    abstract void transferMoney();
    abstract void checkBalance();
}
