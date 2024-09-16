import java.util.ArrayList;

public class AdressBook {
    private ArrayList<BuddyInfo> buddies;

    public AdressBook() {
        buddies = new ArrayList<BuddyInfo>();
        this.buddies.add(new BuddyInfo("Joe", "50 Blue ave, Ottawa, ON", 5067891111L));
        this.buddies.add(new BuddyInfo("Zach", "765 Orange ave, Ottawa, ON", 5067891112L));
        this.buddies.add(new BuddyInfo("Tom", "2 Pink ave, Ottawa, ON", 5067891113L));
        this.buddies.add(new BuddyInfo("Amelia", "345 Black ave, Ottawa, ON", 5067891114L));
    }

    public boolean addBuddy(BuddyInfo buddy) {
        return this.buddies.add(buddy);
    }
    public boolean removeBuddy(BuddyInfo buddy) {
        return this.buddies.remove(buddy);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tommy", "Carleton", 5067891115L);
        AdressBook adressBook = new AdressBook();
        adressBook.addBuddy(buddy);
        adressBook.removeBuddy(buddy);
    }
}
