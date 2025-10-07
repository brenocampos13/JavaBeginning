import java.util.Locale;
public class SystemLanguage {
    static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String name = locale.getDisplayName();

        System.out.printf("The system language is: %s\n", language);
        System.out.printf("The system country is: %s\n", country);
        System.out.printf("The system name is: %s\n", name);
    }
}