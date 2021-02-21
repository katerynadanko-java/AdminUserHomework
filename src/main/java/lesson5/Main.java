package lesson5;

public class Main {

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;
        System.out.println(a);
        System.out.println(b);
        sum(a, b);
        System.out.println(a);
        System.out.println(b);

        Hug hug = new Hug(3, "asd");
        System.out.println(hug);
        hug(hug);
    }

    private static void sum(Integer a, Integer b){
        System.out.println("After sum: " + (++a));
        System.out.println("After sum: " + (++b));
    }

    public static void hug(Hug hug) {
        hug.how = "fgh";
        hug.s = 5;
        System.out.println(hug);
    }

}
class Hug{
    int s;
    String how;

    public Hug(int s, String how) {
        this.s = s;
        this.how = how;
    }

}
