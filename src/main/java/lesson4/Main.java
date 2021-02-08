import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import util.Helper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client Account From:");
        String clientAccountFrom;
        while (true) {
            clientAccountFrom = scanner.nextLine();
            try {
                Helper.method1(clientAccountFrom);
                client.setClientAccount(clientAccountFrom);
                break;
            } catch (WrongFieldException e) {
                System.out.println("Client account should be 10-signed number! Enter the value client Account From again!");
            }

        }
        System.out.println("Enter client Account To:");
        String clientAccountTo;
        while (true) {
            clientAccountTo = scanner.nextLine();
            try {
                Helper.method1(clientAccountTo);
                break;
            } catch (WrongFieldException e) {
                System.out.println("Client account should be 10-signed number! Enter the value client Account To again!");
            }
        }
                System.out.println("Enter the sum:");
        while (true) {
            try {
                Double sum = scanner.nextDouble();
                Helper.method2(sum);
                client.setSum(sum);
                break;
            } catch (WrongSumException e) {
                System.out.println("The sum is incorrect! The sum should be less then 1000! Enter the value sum again!");
            }
        }
            TransactionService.TransferOfMoney(client, clientAccountTo);
            System.out.println("The sum is successfully transferred!");

        System.out.println("On client account is: " + client.getSum() + " dollars");
    }
}







// try with resources
//
//            System.out.println("Enter client Account From:");
//while (true) {
//    try (Scanner scanner = new Scanner(System.in)) {
//        String clientAccountFrom = scanner.nextLine();
//
//        if (clientAccountFrom.length() == 10) {
//            Helper.method1(clientAccountFrom);
//            client.setClientAccount(clientAccountFrom);
//            System.out.println(clientAccountFrom);
//                break;
//        }
//        throw new WrongFieldException();
//    } catch (WrongFieldException e) {
//        System.out.println("Client account should be 10-signed number! Enter the value client Account From again!");
//    }
//}