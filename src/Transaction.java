import java.util.Date;

public class Transaction
{
    int amount_spent;
    String transaction_type;
    String transaction_date;

    public Transaction(int amount_spent, String transaction_type, String transaction_date) {
        this.amount_spent = amount_spent;
        this.transaction_date = transaction_date;
        this.transaction_type= transaction_type;
    }

    public int getAmount_spent() {
        return amount_spent;
    }

    public void setAmount_spent(int amount_spent) {
        this.amount_spent = amount_spent;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount_spent=" + amount_spent +
                ", transaction_type='" + transaction_type + '\'' +
                ", transaction_date='" + transaction_date + '\'' +
                '}';
    }
}
