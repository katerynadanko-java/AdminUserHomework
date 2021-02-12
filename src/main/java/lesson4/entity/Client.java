package entity;

public class Client {
    private String id;
    private String surname;
    private String account;
    private double sum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Client() {
        this.id = id;
        this.surname = surname;
        this.account = account;
        this.sum = sum;
    }
}
