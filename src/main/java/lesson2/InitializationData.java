package lesson2;

public class InitializationData {

    String nicknameString = "Nickname";
    String mailString = "mailJavaHillel";
    String gmailCom = "@gmail.com";

    public Information fillInformation(Information information) {
        for (int i = 0; i < 30; i++) {
            information.getNickname().add(i, nicknameString + i);
            information.getMail().add(mailString + i + gmailCom);
            information.getUserMail().put(mailString + i + gmailCom, nicknameString + i);
        }
        return information;
    }

    public Information add10value(Information information) {
        for (int i = 0; i < 10; i++) {
            if (checkEqualsValue(information)) {
                information.getNickname().add(nicknameString);
            }
            information.getMail().add(mailString + gmailCom);
            information.getUserMail().put(mailString + gmailCom, nicknameString);
    }
        System.out.println(collectionSize(information));
        return information;
}

    private boolean checkEqualsValue(Information information) {
        for (int i = 0; i < information.getNickname().size(); i++) {
            if (information.getNickname().contains(nicknameString)) {
                return false;
            }
        }
        return true;
    }

    private boolean collectionSize(Information information) {
        if (information.getNickname().size() == information.getMail().size() ||
                information.getNickname().size() == information.getUserMail().size()) {
            return true;
        }
        return false;
    }


}

