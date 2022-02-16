import java.util.ArrayList;
import java.util.List;

public class User {
   private static String name;
   private static List<Transaction> transactionList = new ArrayList<>();
   private static List<GiftCard> giftCards = new ArrayList<>();



    public static List<GiftCard> getGiftCards()
   {
       return  giftCards;
   }
   public static void setName(String _name)
   {
       name = _name;
   }
   public static String getName()
   {
       return name;
   }
    public User(String name) {
        this.name = name;
    }

    public static void addGiftCard(GiftCard giftCard)
    {
        System.out.println(giftCards);
        giftCards.add(giftCard);
        System.out.println(giftCard);
        System.out.println(giftCards);
    }

    public static  void addTrasaction(Transaction transaction)
    {
        transactionList.add(transaction);
    }

    public static void addTransaction(Transaction transaction)
    {
        transactionList.add(transaction);
    }

    public static List<Transaction> getAlltransactions()
    {
        return transactionList;
    }
}
