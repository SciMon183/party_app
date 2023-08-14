import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<Integer, Guest>();

    Scanner scanner = new Scanner(System.in);

    // tworzymy metodę która będzie dodawać urzytkowników do listy
    public void addGuest() {
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if (isVeganString.equals("Y")) {        // w przypadku zmiennej string zawsze przy porównywaniu nie morzemy urzvyć == musimy urzyć .equals
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);

        guests.add(guest);
    }

    public void displayMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu gościa którego chcesz znaleźć: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayGuestInformation();
    }

    // metoda która zwraca listę gości
    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInformation();
            System.out.println();
        }

    }
}
