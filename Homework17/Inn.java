package Mirea.Homework17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inn {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ИНН: ");
        try {
            String Inn = br.readLine();
            if (isValidInn(Inn)) {
                System.out.println("ИНН действителен");
            } else {
                System.out.println("ИНН недействителен");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean isValidInn(String Inn) {
        String innPattern = "\\d{10}|\\d{12}";

        Pattern pattern = Pattern.compile(innPattern);

        Matcher matcher = pattern.matcher(Inn);

        return matcher.matches();
    }
}
