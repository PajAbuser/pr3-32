package p6.t1_10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>();

        for(int i = 0; i < ((int) (Math.random() * 10 + 1)) ; i++){
            computers.add(new Computer(ModelName.values()[(int)(Math.ceil(Math.random() * 3) - 1)],
                    new Processor(Integer.toString((int)(Math.random() * 10))),
                    new Memory (Integer.toString((int)(Math.random() * 10))),
                    new Monitor (Integer.toString((int)(Math.random() * 10)))
                )
            );
        }

        while(true){

            System.out.println("\n0 - List all computers ,1 - Add computer to shop, 2 - Search computer in list, 3 - Delete computer from shop\n");
            int select = new Scanner(System.in).nextInt();
            switch (select){

                case 0 -> {

                    int counter = 0;
                    for(Computer c : computers){
                        System.out.println("id = " + counter + " " + c);
                        counter++;
                    }

                }

                case 1 -> {

                    System.out.println("\nEnter comps model {ASUS_Strix, MacBook_Air15, HP_Envy}," +
                            "\nProcessor (String), Memory (String), Monitor (String)\n");

                    String Enum = new Scanner(System.in).nextLine(),
                        proc = new Scanner(System.in).nextLine(),
                        mem  = new Scanner(System.in).nextLine(),
                        mon  = new Scanner(System.in).nextLine();

                    computers.add(new Computer(ModelName.valueOf(Enum) ,new Processor(proc), new Memory(mem), new Monitor(mon)));

                }

                case 2 -> {

                    System.out.println("\nEnter search parameter (name, processor, memory, monitor)\n");
                    String searchtype = new Scanner(System.in).nextLine();
                    int counter = 0;
                    System.out.println("\nEnter keyword\n");
                    String search = new Scanner(System.in).nextLine();
                    switch(searchtype){
                        case "name" -> {
                            for(Computer computer : computers){
                                if(computer.getName() == ModelName.valueOf(search)){
                                    System.out.println("id = " + counter + " " + computer);
                                }
                                counter++;
                            }
                        }
                        case "processor" -> {
                            for(Computer computer : computers){
                                if(computer.getProc().getName().equals(search)){
                                    System.out.println("id = " + counter + " " + computer);
                                }
                                counter++;
                            }
                        }
                        case "memory" -> {
                            for(Computer computer : computers){
                                if(computer.getRam().getName().equals(search)){
                                    System.out.println("id = " + counter + " " + computer);
                                }
                                counter++;
                            }
                        }
                        case "monitor" -> {
                            for(Computer computer : computers){
                                if(computer.getMonitor().getName().equals(search)){
                                    System.out.println("id = " + counter + " " + computer);
                                }
                                counter++;
                            }
                        }

                    }


                }

                case 3 -> {

                    System.out.println("\nEnter id\n");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println("\nDeleting " + computers.get(id));
                    computers.remove(id);

                }

            }

        }


    }

}
