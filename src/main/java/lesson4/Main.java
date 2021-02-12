import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import util.Helper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        final String FROM = "from which withdraw money";
        final String TO = "to which transfer money";

        client.setAccount(enterAccount(FROM));
        String accountTo = enterAccount(TO);
        client.setSum(enterSum());

        TransactionService.transferOfMoney(client, accountTo);
        System.out.println("The sum is successfully transferred!");
    }

    private static String enterAccount(String fromTo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client account " + fromTo + " :");
        String account;
        while (true) {
            account = scanner.nextLine();
            try {
                Helper.wrongFieldLength(account);
                break;
            } catch (WrongFieldException e) {
                System.out.println("Client account should be 10-signed number! Enter the value " +
                        "client account again! " + fromTo);
            }
        }
        return account;
    }

    private static Double enterSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum:");
        Double sum;
        while (true) {
            try {
                sum = scanner.nextDouble();
                Helper.wrongSum(sum);
                break;
            } catch (WrongSumException e) {
                System.out.println("The sum is incorrect! The sum should be less then 1000! " +
                        "Enter the value sum again!");
            }
        }return sum;
    }
        }