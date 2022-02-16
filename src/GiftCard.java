import java.util.ArrayList;
import java.util.List;

public class GiftCard {
     String card_number;
     int balance_amount;
     String card_holder;
     List<Transaction> transactions = new ArrayList<>();

    @Override
    public String toString() {
        return "GiftCard{" +
                "card_number='" + card_number + '\'' +
                ", balance_amount=" + balance_amount +
                ", card_holder='" + card_holder + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public  String getCard_number() {
        return card_number;
    }

    public  void setCard_number(String _card_number) {
        card_number = _card_number;
    }

    public  int getBalance_amount() {
        return balance_amount;
    }

    public  void setBalance_amount(int balance_amount) {
        this.balance_amount = balance_amount;
    }

    public  String getCard_holder() {
        return card_holder;
    }

    public  void setCard_holder(String card_holder) {
        this.card_holder = card_holder;
    }

    public GiftCard(String card_number, int balance_amount, String card_holder) {
        this.card_number = card_number;
        this.balance_amount = balance_amount;
        this.card_holder = card_holder;
    }

    public  void addTransaction(Transaction transaction)
    {
        transactions.add(transaction);
    }


}
