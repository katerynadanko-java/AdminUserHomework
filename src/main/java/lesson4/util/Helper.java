package util;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import entity.Client;
import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class Helper {

    public static void method1 (String clientAccount) throws WrongFieldException {
        if((clientAccount.length() != 10)) {
            throw new WrongFieldException();
        }
        }
    public static void method2 (Double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException();
        }
    }
    public static void method3 (String clientAccountFrom, String clientAccountTo) {
        if (!(clientAccountFrom.equals(clientAccountTo))) {
            throw new UserExpectedError();
        }
    }

    }
