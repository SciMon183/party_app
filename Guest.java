public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }
    public String getMeal() {
        return meal;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.println("Imię: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
        String isVeganString  = isVegan ? "tak" : "nie";            // tworzymy stringa który spawdza czy isVegan jest true czy nie jeśli tak to wykonuje się pierwszy argument jeśli nie to drugi (ten po dwukropku)
        System.out.println("Weganin?: " + isVeganString);
    }
}
