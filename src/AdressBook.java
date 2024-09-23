import java.util.ArrayList;

public class AdressBook {
    private ArrayList<BuddyInfo> buddies;

    public AdressBook() {
        buddies = new ArrayList<BuddyInfo>();
        this.buddies.add(new BuddyInfo("Joe", "50 Blue ave, Ottawa, ON", 5067891111L));
        this.buddies.add(new BuddyInfo("Zachddd", "765 Orange ave, Ottawa, ON", 5067891112L));
        this.buddies.add(new BuddyInfo("Tom", "2 Pink ave, Ottawa, ON", 5067891113L));
        this.buddies.add(new BuddyInfo("Amelia", "345 Black ave, Ottawa, ON", 5067891114L));
    }

    public boolean addBuddy(BuddyInfo buddy) {
        return buddies.add(buddy);
    }
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < this.buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tommy", "Carleton", 5067891115L);
        AdressBook adressBook = new AdressBook();
        adressBook.addBuddy(buddy);
        adressBook.removeBuddy(4);//tommy
    }
}
