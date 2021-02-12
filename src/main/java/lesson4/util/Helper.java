package util;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import entity.Client;
import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class Helper {

    public static void wrongFieldLength(String account) throws WrongFieldException {
        if((account.length() != 10)) {
            throw new WrongFieldException();
        }
        }
    public static void wrongSum(Double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException();
        }
    }
    public static void equalsAccount(String accountFrom, String accountTo) {
        if (!(accountFrom.equals(accountTo))) {
            throw new UserExpectedError();
        }
    }

    }
