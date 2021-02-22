package pl.radekcholuj;

import java.util.Scanner;

public class StoreDataApp {
    private static Scanner scanner = new Scanner(System.in, "UTF-8");
    private static Repo repo;

    public static void main(String[] args) {
        int option;
        do {
            displayMainMenu();
            option = getOption();

            switch (option){
                case 1:
                    System.out.print("Text: ");
                    String text = scanner.nextLine();
                    storeMenu();
                    option = getOption();
                    saveText(option, text);
                    break;

                case 2:
                    System.out.println("Get data");
                    break;
            }

        } while (option != 0);
    }

    private static void saveText(int option, String text) {
        switch (option){
            case 1:
                repo = new FileRepo();
                repo.save(text);
                break;
            case 2:
                repo = new DBRepo();
                repo.save(text);
                break;
        }
    }

    private static void storeMenu() {
        System.out.println("1 - file");
        System.out.println("2 - database");
    }

    private static int getOption() {
        int option;
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void displayMainMenu() {
        System.out.println("------ Store Data App ------");
        System.out.println("1 - save data");
        System.out.println("2 - get data");
        System.out.println("0 - stop");
    }
}
