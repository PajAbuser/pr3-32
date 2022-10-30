package p4.t3;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {

        Accounts accounts = new Accounts();
        boolean entriesExist = false;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Catalogue> catalogues = new ArrayList<>();
        ArrayList<Item> basket = new ArrayList<>();

        int amountOfCatalogues = (int) (Math.random() * 10) + 1;
        for(int n = 0; n < amountOfCatalogues; n++){
            Catalogue curCat = new Catalogue(String.format("%1$7.5f",Math.random()));
            curCat.setSize((int) (Math.random() * 10) + 1);
            for (int i = 0; i < curCat.getSize(); i++) {
                curCat.getCatalogue().add(new Item((int) (Math.ceil(Math.random() * 2)) - 1, (double)((int)(Math.random() * 10000000))/100));
            }
            catalogues.add(curCat);
        }


        boolean logged = false;

        while (true) {

            while (true) {

                while (!logged) {

                    System.out.println("\n1 - Registration, 2 - Login\n");
                    int select = scanner.nextInt();
                    if (!entriesExist && select == 2) {
                        System.out.println("\nThere is no users registered\n");
                        break;
                    }
                    System.out.println("\nEnter login and password");
                    String login, password;
                    login = new Scanner(System.in).nextLine();
                    password = new Scanner(System.in).nextLine();

                    switch (select) {

                        case 1 -> {

                            accounts.getLogins().add(login);
                            accounts.getPasswords().add(password);
                            entriesExist = true;
                        }

                        case 2 -> {

                            for (int i = 0; i < accounts.getPasswords().toArray().length; i++) {

                                if (accounts.getPasswords().get(i).equals(password)
                                        && accounts.getLogins().get(i).equals(login)) {
                                    logged = true;
                                    System.out.println("\nSuccesfully logged");
                                    break;
                                } else {
                                    System.out.println("\nWrong login/password");
                                }

                            }
                        }

                    }

                }

                if (!logged) break;

                boolean exit = false;

                while (!exit) {

                    System.out.println("\n1 - Show catalogues, 2 - Show items of certain catalogue, 3 - view basket, 4 - delete item from basket, 5 - purchase, 6 - exit");

                    int select2 = scanner.nextInt();

                    switch (select2) {

                        case 1 -> {
                            int c = 0;
                            for (Catalogue cat : catalogues) {
                                System.out.println(c + " " + cat.toString());
                                c++;
                            }

                        }

                        case 2 -> {

                            System.out.println("\nEnter catalogue id\n");
                            int select3 = scanner.nextInt();
                            System.out.println(catalogues.get(select3).toString2());
                            boolean back = false;
                            while (!back) {

                                System.out.println("\n1 - Add item to basket, 2 - back");
                                int select4 = scanner.nextInt();
                                switch (select4) {
                                    case 1 -> {
                                        System.out.println("\nEnter item id\n");
                                        int id = scanner.nextInt();
                                        try {
                                            basket.add(catalogues.get(select3).getCatalogue().get(id));
                                        } catch (Exception e){
                                            System.out.println("\nno(\n");
                                        }
                                    }
                                    case 2 -> {
                                        back = true;
                                    }
                                    default -> System.out.println("\nWrong input\n");
                                }
                            }
                        }

                        case 3 -> {

                            int c = 0;
                            for (Item i : basket) {
                                System.out.println(c + " " + i);
                                c++;
                            }

                        }

                        case 4 -> {

                            System.out.println("\nEnter item id\n");
                            int id = scanner.nextInt();
                            basket.remove(basket.get(id));
                            for(Item i : basket){
                                System.out.println(i);
                            }

                        }

                        case 5 -> {

                            double sum = 0;
                            for(Item i : basket){
                                sum += i.getPrice();
                            }
                            System.out.println("\nTotal = " + sum);

                        }

                        case 6 -> {
                            exit = true;
                            logged = false;
                        }

                        default -> {
                            System.out.println("\nWrong num");
                        }

                    }



                }
            }
        }
    }
}
