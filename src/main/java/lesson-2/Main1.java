import sun.applet.Main;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        InitializationData initialData = new InitializationData();
        Information information = new Information();

        System.out.println("Info after filling: ");
        System.out.println(initialData.fillInformation(information));

        System.out.println("Info after adding: ");
        System.out.println(initialData.add10value(information));

        Main1 main1 = new Main1();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i<5; i++) {
            integers.add(i);
        }
        List<Float> floats = new ArrayList<>();
        for (float i = 0; i<2; i+=0.1){
            floats.add(i);
        }

        List<Byte> bytes = new ArrayList<>();
        for (byte i = 0; i<Byte.MAX_VALUE-100; i++) {
            bytes.add(i);
        }

        System.out.println("Info after additionalMethod with <Integer>: ");
        System.out.println(main1.additionalMethod(integers, information));
        System.out.println("Info after additionalMethod with <Integer> & <Float>: ");
        System.out.println(main1.additionalMethod(floats, information));
        System.out.println("Info after additionalMethod with <Integer> & <Float> & <Byte>: ");
        System.out.println(main1.additionalMethod(bytes, information));

    }

    public Information additionalMethod(List<? extends Number> numbers, Information information) {

        for (int i = 0; i < numbers.size(); i++) {
            information.getPseudonym().add(String.valueOf(numbers.get(i)));

            if (!((information.getMail()).contains((numbers.get(i)) + "@mail.ua"))) {
                information.getMail().add((numbers.get(i)) + "@mail.ua");
                information.getUserMail().put((numbers.get(i)) + "@mail.ua", "pseudonym" + i);
            }
        }

        return information;
    }
}
