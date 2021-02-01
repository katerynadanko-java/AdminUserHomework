import java.util.*;

public class Information {

    private List<String> pseudonym = new ArrayList<>();
    private Set<String> mail = new HashSet<>();
    private Map<String, String> userMail = new HashMap<>();


    public List<String> getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(List<String> pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Set<String> getMail() {
        return mail;
    }

    public void setMail(Set<String> mail) {
        this.mail = mail;
    }

    public Map<String, String> getUserMail() {
        return userMail;
    }

    public void setUserMail(Map<String, String> userMail) {
        this.userMail = userMail;
    }

    @Override
    public String toString() {
        return "Information{" +
                "pseudonym: " + pseudonym + "\n" +
                "mail: " + mail + "\n" +
                "userMail: " + userMail + "\n" +
                '}';
    }
}
