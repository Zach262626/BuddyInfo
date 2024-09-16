public class BuddyInfo {
    private String name;
    private String address;
    private long phone;

    public BuddyInfo(String name, String address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Zach", "50 ave Blue, Campbelleton, NB", 5069874000L);
        System.out.println("Hello " + buddy.getName() +" your adress is " + buddy.getAddress() +
                " and phone number is " + buddy.getPhone());
    }
}
