import java.util.Locale;

public class SystemLanguage{
    static void main(String[] args) {
        Locale locate = Locale.getDefault();

        String language = locate.getLanguage();
        String country = locate.getCountry();
        String name = locate.getDisplayName();

        System.out.printf("The system language is: %s\n", language);
        System.out.printf("The system country is: %s\n", country);
        System.out.printf("The system name is: %s\n", name);
    }
}