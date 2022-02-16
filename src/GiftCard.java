import java.util.ArrayList;
import java.util.List;

public class GiftCard {
    static String card_number;
    static int balance_amount;
    static String card_holder;
    static List<Transaction> transactions = new ArrayList<>();

    @Override
    public String toString() {
        return "GiftCard{" +
                "card_number='" + card_number + '\'' +
                ", balance_amount=" + balance_amount +
                ", card_holder='" + card_holder + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public static String getCard_number() {
        return card_number;
    }

    public static void setCard_number(String card_number) {
        card_number = card_number;
    }

    public static int getBalance_amount() {
        return balance_amount;
    }

    public static void setBalance_amount(int balance_amount) {
        balance_amount = balance_amount;
    }

    public static String getCard_holder() {
        return card_holder;
    }

    public static void setCard_holder(String card_holder) {
        card_holder = card_holder;
    }

    public GiftCard(String card_number, int balance_amount, String card_holder) {
        this.card_number = card_number;
        this.balance_amount = balance_amount;
        this.card_holder = card_holder;
    }

    public static void addTransaction(Transaction transaction)
    {
        transactions.add(transaction);
    }


}
