package Railworld_India_PVT_Task;

import java.util.Locale;

public class String9_ToUpperCase_Method2 {
    public static void main(String[] args) {
        String s = "hello string";
        String turkis = s.toUpperCase(Locale.forLanguageTag("tr"));

        String english = s.toUpperCase(Locale.forLanguageTag("en"));
        System.out.println(turkis);
        System.out.println(english);
    }
}
