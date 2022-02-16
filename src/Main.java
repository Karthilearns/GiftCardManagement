import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static  List<User> usersList = new ArrayList<>();
    public static void main(String args[])
    {
        Scanner scans = new Scanner(System.in);
        int choice = 1;
        System.out.println("already a user, if yes enter 1 , if no enter 0");
        int isUser = scans.nextInt();
        User user = null;
        if(isUser!=1)
        {
            System.out.println("Enter name");
            String name = scans.next();
            user = new User(name);
            Operations.addUser(user);

        }
        else {
            System.out.println("enter user name");
            String user_name = scans.next();
            user = Operations.getUserByUserName(user_name);
        }

        while (choice==1|| choice==2|| choice==3 || choice==4 || choice==5 || choice==6||choice==7)
        {
            System.out.println("enter choice");
            choice = scans.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter card number");
                    String card_number = scans.next();
                    System.out.println("Enter card holder name");
                    String card_holder = scans.next();
                    GiftCard giftCard = new GiftCard(card_number,0,card_holder);
                    user.addGiftCard(giftCard);
                    break;
                case 2:
                    Hashtable<Integer,GiftCard> cards = Operations.getAllCards(user);
                    for(Map.Entry<Integer,GiftCard> e: cards.entrySet())
                    {
                        System.out.println(e.getKey()+" = "+e.getValue());

                    }
                    System.out.println("Enter card choice");
                    int card_choice = scans.nextInt();
                    GiftCard cardToRecharge = cards.get(card_choice);
                    System.out.println("Enter amount");
                    int amount =scans.nextInt();
                    Operations.recharge(cardToRecharge,amount,user);
                    break;

                case 3:
                    List<Transaction> transactions = Operations.showMyTransaction(user);
                    for(Transaction t:transactions)
                    {
                        System.out.println(t.toString());
                    }
                    break;


                case 4:
                    List<GiftCard> giftCards = Operations.getAllCardForDisplay(user);
                    for(GiftCard g:giftCards)
                    {
                        System.out.println(g.toString());
                    }
                    break;

                case 5:
                    System.out.println("If new user enter 1 or enter 0");
                    int userChoice = scans.nextInt();
                    if(userChoice==1)
                    {
                        System.out.println("Enter the name");
                        String name = scans.next();
                        user = new User(name);
                        usersList.add(user);
                    }
                    else
                    {
                        System.out.println("ENTER USERNAME");
                        String name = scans.next();
                        user = Operations.getUserByUserName(name);
                    }
                    break;
                case 6:
                    for(User u:usersList)
                    {
                        System.out.println(u.toString());
                    }
                   break;

                case 7:

                    Hashtable<Integer,GiftCard> cardsForPurchase = Operations.getAllCards(user);
                    for(Map.Entry<Integer,GiftCard> e: cardsForPurchase.entrySet())
                    {
                        System.out.println(e.getKey()+" = "+e.getValue());

                    }
                    int purchaseChoice = scans.nextInt();
                    System.out.println("enter the amount needed for purchase");
                    int amountForPurchase = scans.nextInt();
                    GiftCard purchaseCard = cardsForPurchase.get(purchaseChoice);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    purchaseCard.setBalance_amount(purchaseCard.getBalance_amount()-amountForPurchase);
                    Transaction purchase = new Transaction(amountForPurchase,"purchase",now.toString());
                    purchaseCard.addTransaction(purchase);
                    user.addTransaction(purchase);
                    System.out.println("Your balance is "+purchaseCard.getBalance_amount());
                    break;
            }

        }
    }

}
