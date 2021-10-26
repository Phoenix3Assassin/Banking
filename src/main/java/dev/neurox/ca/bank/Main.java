package dev.neurox.ca.bank;

import dev.neurox.ca.bank.model.Client;
import dev.neurox.ca.bank.model.LoginCredentials;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (mainLoop(input)) {
        }
    }

    private static boolean mainLoop(Scanner input) {
        System.out.println("Press 1 to create an account, Press 2 to login, 3 to exit the application!");
        int command = getCommand(input);
        switch (command) {
            case 1 -> {
                Client client = getClientFromUser(input);
                return true;
            }
            case 2 -> {
                return true;
            }
            case 3 -> {
                return false;
            }
        }
        return false;
    }

    private static Client getClientFromUser(Scanner input) {
    }

    private static LoginCredentials getLCFromUser(Scanner input) {
    }

    private static int getCommand(Scanner input) {
        int x = input.nextInt();
        input.nextLine();
        return x;
    }


}
