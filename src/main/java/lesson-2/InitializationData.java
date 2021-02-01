import java.util.*;

public class InitializationData {

    String pseudonymString = "Pseudonym";
    String mailString = "mail";
    String gmailCom = "@gmail.com";

    public Information fillInformation(Information information) {
        for (int i = 0; i < 30; i++) {
            information.getPseudonym().add(i, pseudonymString + i);
            information.getMail().add(mailString + i + gmailCom);
            information.getUserMail().put(mailString + i + gmailCom, pseudonymString + i);
        }
        return information;
    }

    public Information add10value(Information information) {
        for (int i = 0; i < 10; i++) {
            if (checkEqualsValue(information)) {
                information.getPseudonym().add(pseudonymString);
            }
            information.getMail().add(mailString + gmailCom);
            information.getUserMail().put(mailString + gmailCom, pseudonymString);
    }
        System.out.println(collectionSize(information));
        return information;
}

    private boolean checkEqualsValue(Information information) {
        for (int i = 0; i < information.getPseudonym().size(); i++) {
            if (information.getPseudonym().contains(pseudonymString)) {
                return false;
            }
        }
        return true;
    }

    private boolean collectionSize(Information information) {
        if (information.getPseudonym().size() == information.getMail().size() ||
                information.getPseudonym().size() == information.getUserMail().size()) {
            return true;
        }
        return false;
    }


}

