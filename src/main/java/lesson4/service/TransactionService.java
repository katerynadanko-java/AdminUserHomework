package service;

import entity.Client;
import util.Helper;

public class TransactionService {

    public static void transferOfMoney(Client client, String accountTo){

        String accountFrom = client.getAccount();
        Helper.equalsAccount(accountFrom, accountTo);
    }
}
