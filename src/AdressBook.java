import java.util.ArrayList;

public class AdressBook {
    private ArrayList<BuddyInfo> buddies;

    public AdressBook() {
        buddies = new ArrayList<BuddyInfo>();
        this.buddies.add(new BuddyInfo("Joe", "50 Blue ave, Ottawa, ON", 5067891111L));
        this.buddies.add(new BuddyInfo("Zach", "765 Orange ave, Ottawa, ON", 5067891111L));
        this.buddies.add(new BuddyInfo("Tom", "2 Pink ave, Ottawa, ON", 5067891111L));
        this.buddies.add(new BuddyInfo("Amelia", "345 Black ave, Ottawa, ON", 5067891111L));
    }

    public boolean addBuddy(String name, String address, long phone) {
        return this.buddies.add(new BuddyInfo(name, address, phone));
    }
    public boolean removeBuddy(String name) {
        for (BuddyInfo buddy : this.buddies) {
            if (buddy.getName().equals(name)) {
                return this.buddies.remove(buddy);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
