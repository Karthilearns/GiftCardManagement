import java.util.ArrayList;
import java.util.List;

public class User {
   private  String name;
   private  List<Transaction> transactionList = new ArrayList<>();
   private  List<GiftCard> giftCards = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", transactionList=" + transactionList +
                ", giftCards=" + giftCards +
                '}';
    }

    public  List<GiftCard> getGiftCards()
   {
       return  giftCards;
   }
   public  void setName(String _name)
   {
       this.name = _name;
   }
   public  String getName()
   {
       return name;
   }
    public User(String name)
    {
        this.name = name;
    }

    public  void addGiftCard(GiftCard giftCard)
    {

        giftCards.add(giftCard);
    }



    public  void addTransaction(Transaction transaction)
    {
        transactionList.add(transaction);
    }

    public  List<Transaction> getAlltransactions()
    {
        return transactionList;
    }
}
