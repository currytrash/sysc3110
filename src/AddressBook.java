import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyList;


    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }
    public void addBuddy (BuddyInfo bud){
        buddyList.add(bud);
    }

    public void removeBuddy(BuddyInfo bud) {
        buddyList.remove(bud);
    }

    public static void main (String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("yahya" ,"carelton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }


    }


