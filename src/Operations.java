import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Operations {


   public  static User getUserByUserName(String username)
   {
       for(User u:Main.usersList)
       {
           if(User.getName().equals(username))
           {
               return u;
           }
       }
       return null;
   }


    public static void createCard(User user,GiftCard card)
    {
        user.addGiftCard(card);
    }

    public static void recharge(GiftCard card, int amount, User user)
    {
        card.setBalance_amount(card.getBalance_amount()+amount);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        card.addTransaction(new Transaction(0, "RECHARGED",now.toString()));
        user.addTransaction(new Transaction(0, "RECHARGED",now.toString()));
        System.out.println("Recharge Done");
    }

    public static Hashtable<Integer, GiftCard> getAllCards(User user)
    {
        Hashtable<Integer,GiftCard> giftCards = new Hashtable<>();
        List<GiftCard> giftCardsList = user.getGiftCards();
        int count=0;
        for(GiftCard g:giftCardsList)
        {
            giftCards.put(++count,g);
        }
        return giftCards;
    }

    public static void addUser(User user)
    {
        Main.usersList.add(user);
    }

    public static List<Transaction> showMyTransaction(User user)
    {
     return  user.getAlltransactions();
    }

    public static List<GiftCard> getAllCardForDisplay(User user)
    {
        return user.getGiftCards();
    }

}
