import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyList;


    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }
    public void InsertBuddy (BuddyInfo bud){
        buddyList.add(bud);
    }

    public void removeBuddy(BuddyInfo bud) {
        buddyList.remove(bud);
    }

    public static void main (String[] args){
        System.out.println("Address Book");
    }


    }


