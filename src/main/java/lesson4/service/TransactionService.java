package service;

import entity.Client;
import util.Helper;

public class TransactionService {

    public static void TransferOfMoney(Client client, String clientAccountTo){

        String clientAccountFrom = client.getClientAccount();
        Helper.method3(clientAccountFrom, clientAccountTo);
    }
}
